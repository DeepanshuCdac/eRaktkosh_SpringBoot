package in.cdac.eraktkosh.services;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

//import com.hazelcast.core.HazelcastInstance;

import in.cdac.eraktkosh.entity.PortalLoginEntity;
import in.cdac.eraktkosh.repository.EraktkoshPortalLoginRepository;
import in.cdac.eraktkosh.utility.SendMessageToUser;

@Service
public class PortalLoginService {
//	@Autowired
//    private HazelcastInstance hazelcastInstance;
	
	@Autowired
	EraktkoshPortalLoginRepository portalDonorRepository;

	@Autowired
	HttpSession session;
	   @Autowired
	    private HazelcastInstance hazelcastInstance;
	  
	long timeDifference = 0;
	long fiveMinutesInSeconds = 0;
	private final String OTP_CHARS = "0123456789";
	private final int OTP_LENGTH = 6;
	String flag1 = "0";
	long previousOtpTimestamp = 0;
	private static final long OTP_EXPIRY_DURATION = 60 * 1000;
	private Map<String, String> otpStore = new HashMap<>();
	private Map<String, String> captchaStore = new HashMap<>();
	//Map<String, String> otpCache = hazelcastInstance.getMap("otpCache");
//	Map<String, String> captchaCache = hazelcastInstance.getMap("captchaCache");
	
	
	  private static final int OTP_EXPIRATION_TIME = 5; // minutes

	  private static final int CAPTCHA_EXPIRATION_TIME = 5; // minutes

		  
	public String generateOtp(String mobile_no) throws InvalidKeyException, NoSuchAlgorithmException {

		boolean hasFlag = true;
		int otpCount = 0;
		JSONObject finalResponse = new JSONObject();
		SecureRandom random = new SecureRandom();
		StringBuilder otp = new StringBuilder(OTP_LENGTH);
		for (int i = 0; i < OTP_LENGTH; i++) {
			int index = random.nextInt(OTP_CHARS.length());
			otp.append(OTP_CHARS.charAt(index));
		}

		String msg = "Your eRaktKosh OTP for username ";

		String contactno = mobile_no.substring(mobile_no.length() - 3);

		contactno = "*******" + contactno;

		msg += contactno + " is: ";

		try {
			hasFlag = isUserExists(mobile_no);
			otpCount = Otpcount(mobile_no);

			PortalLoginEntity portalLoginVo = new PortalLoginEntity();
			if (hasFlag == false) {
				portalLoginVo.setMobileno(mobile_no);

				portalLoginVo = fetchdetailsCamp(portalLoginVo);

				if (portalLoginVo == null) {

					hasFlag = false;
				} else {
					hasFlag = true;
				}

			}

			if (otpCount >= 1) {
				previousOtpTimestamp = getPreviousOtpTimestampFromDB(portalLoginVo);

			}
			flag1 = "1";

			if (otpCount < 1) {

				if (hasFlag == true) {
					if (flag1 == "1") {

						if (mobile_no != null && !mobile_no.isEmpty()) {
							boolean flg = true;
							if (otpCount <= 4) {

								otp = otp;
								insertcount(portalLoginVo);
							} else {
								flg = false;
							}

							if (flg) {

								msg = "Your eRaktKosh OTP for username ";
								msg += mobile_no + " is: ";
								SendMessageToUser.SendOTP(msg + otp + ". Please do not share your OTP with anyone.",
										mobile_no);

								System.out.println(otp);
							} else {
								flag1 = "0";
							}
						}
					}
				} else if (hasFlag == false) {
					flag1 = "2";
				} else {
					flag1 = "0";
				}
			}

			else {
				if (!(timeDifference < fiveMinutesInSeconds)) {
					if (hasFlag == true) {
						if (flag1 == "1") {

							if (mobile_no != null && !mobile_no.isEmpty()) {
								boolean flg = true;
								if (otpCount <= 4) {

									insertcount(portalLoginVo);
								} else {
									flg = false;
								}

								if (flg) {

									msg = "Your eRaktKosh OTP for username ";
									msg += mobile_no + " is: ";
									SendMessageToUser.SendOTP(msg + otp + ". Please do not share your OTP with anyone.",
											mobile_no);

									System.out.println(otp);
								} else {
									flag1 = "0";
								}
							}
						}
					} else if (hasFlag == false) {
						flag1 = "2";
					} else {
						flag1 = "0";
					}

				} else {
					flag1 = "3";
				}

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		if (hasFlag == true) {
			SendMessageToUser.SendOTP(msg + otp + ". Please do not share your OTP with anyone.", mobile_no);

			
			      // Store the OTP with the phone number as key (or user ID if applicable)
		       // otpCache.put(mobile_no, String.valueOf(otp));
			finalResponse.put("otp", otp);
			finalResponse.put("isUserExists", hasFlag);
			finalResponse.put("otpCount", otpCount);
			// Store OTP and CAPTCHA in session

		}

		else {

			hasFlag = false;
			finalResponse.put("isUserExists", hasFlag);
		}

		 IMap<String, String> otpMap = hazelcastInstance.getMap("otpMap");
	        otpMap.put(mobile_no, otp.toString(), OTP_EXPIRATION_TIME, TimeUnit.MINUTES);

		return finalResponse.toString();

	}

	public BufferedImage generateCaptchaImage(String captchaText) {
		int width = 100;
		int height = 40;

		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics2D g2d = bufferedImage.createGraphics();

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, width, height);

		g2d.setFont(new Font("Roboto", Font.BOLD, 16));

		g2d.setColor(new Color(109, 112, 120));

		int letterSpacing = 5;
		int xPosition = 8;
		int yPosition = 25;

		for (char c : captchaText.toCharArray()) {
			g2d.drawString(String.valueOf(c), xPosition, yPosition);
			xPosition += g2d.getFontMetrics().charWidth(c) + letterSpacing;
		}

		g2d.drawLine(20, yPosition - 10, xPosition - letterSpacing, yPosition - 10);
		g2d.dispose();

		return bufferedImage;
	}

	public String generateCaptchaText() {
		Random random = new Random();
		String captchaChars = "abcdefghijklmnopqrstuvwxyz#$#!&*^ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder captchaText = new StringBuilder();

		for (int i = 0; i < 6; i++) {
			captchaText.append(captchaChars.charAt(random.nextInt(captchaChars.length())));
		}
		//captchaCache.put("ct", captchaText.toString());
		
		  IMap<String, String> captchaMap = hazelcastInstance.getMap("captchaMap");
	        captchaMap.put("RR", captchaText.toString(), CAPTCHA_EXPIRATION_TIME, TimeUnit.MINUTES);
		return captchaText.toString();

	}

	private void insertcount(PortalLoginEntity portalLoginVo) {
	}

	public boolean isUserExists(String mobile_no) {

		System.out.println("Inside user exists");
		Boolean hasFlag = portalDonorRepository.getPortalDonorDtlByMobileNo(mobile_no);
		System.out.println("DD" + hasFlag);
		return hasFlag;

	}

	public int Otpcount(String mobile_no) {

		return 0;
	}

	public PortalLoginEntity fetchdetailsCamp(PortalLoginEntity PortalLoginEntity) {

		System.out.println("Inside fetch User camp details");
		PortalLoginEntity res = portalDonorRepository.fetchdetailsCamp(PortalLoginEntity);
		System.out.println("OTP COUNT" + res);
		return res;

	}

	public int getPreviousOtpTimestampFromDB(PortalLoginEntity PortalLoginEntity) {

		return 0;

	}

	public int validate(String otp, String captcha, String mobileno) {
		  IMap<String, String> otpMap = hazelcastInstance.getMap("otpMap");
	        String storedOtp = otpMap.get(mobileno);
	        if(storedOtp != null && storedOtp.equals(otp)){
	        	
	        	return 1;
	        }
	        
		return 0;

	}

}
