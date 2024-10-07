
package in.cdac.eraktkosh.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cdac.eraktkosh.entity.PortalLoginEntity;
import in.cdac.eraktkosh.services.PortalLoginService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("eraktkosh")

public class PortalLoginController {

	@Autowired
	PortalLoginService portalLoginService;

	@Autowired
	HttpSession session;

	// 1. Original endpoint for generating both OTP and Captcha

	@PostMapping("/generateOTP")
	public ResponseEntity<Map<String, String>> generateOTP(@RequestBody PortalLoginEntity portalLogin) {
		Map<String, String> response1 = new HashMap<>();
		String mobile_no = portalLogin.getMobileno();
		String response = null;

		try {
			// Generate OTP
			response = portalLoginService.generateOtp(mobile_no);

			// Generate CAPTCHA
			String captcha = portalLoginService.generateCaptchaText();
			BufferedImage captchaImage = portalLoginService.generateCaptchaImage(captcha);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(captchaImage, "png", baos);
			String base64Captcha = Base64.getEncoder().encodeToString(baos.toByteArray());
//SET OTP AND CAPTHCA IN SESSION

			System.out.println(session.getAttribute("generatedOtp"));

			System.out.println(session.getAttribute("generatedCaptcha"));

			// Return OTP and CAPTCHA
			response1.put("captchaImage", "data:image/png;base64," + base64Captcha);
			response1.put("captchaText", captcha);
			response1.put("OtpData", response);

		} catch (InvalidKeyException | NoSuchAlgorithmException | IOException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(response1, new HttpHeaders(), HttpStatus.OK);
	}

	// 2. New endpoint for regenerating only the OTP
	@PostMapping("/regenerateOtp")
	public ResponseEntity<Map<String, String>> regenerateOtp(@RequestBody PortalLoginEntity portalLogin) {
		Map<String, String> response = new HashMap<>();
		String mobile_no = portalLogin.getMobileno();

		try {
			// Generate OTP only
			String otpResponse = portalLoginService.generateOtp(mobile_no);
			response.put("OtpData", otpResponse);

			System.out.println(session.getAttribute("generatedOtp"));

		} catch (InvalidKeyException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
	}

	// 3. New endpoint for regenerating only the CAPTCHA
	@PostMapping("/regenerateCaptcha")
	public ResponseEntity<Map<String, String>> regenerateCaptcha() {
		Map<String, String> response = new HashMap<>();

		try {
			// Generate CAPTCHA only
			String captcha = portalLoginService.generateCaptchaText();
			BufferedImage captchaImage = portalLoginService.generateCaptchaImage(captcha);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(captchaImage, "png", baos);
			String base64Captcha = Base64.getEncoder().encodeToString(baos.toByteArray());

			// Return CAPTCHA
			response.put("captchaImage", "data:image/png;base64," + base64Captcha);
			response.put("captchaText", captcha);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
	}

		@PostMapping("/validate")
		public ResponseEntity<String> validate(@RequestBody String  requestData,HttpSession session) {
			Map<String, Object> response = new HashMap<>();
		
			JSONObject jsonObject = new JSONObject(requestData);
		
		    // Extract values
		    String inputOtp = jsonObject.getString("otp");
		    String inputCaptcha = jsonObject.getString("captcha");
		    String mobileNo =  jsonObject.getString("mobile_no");
			
			
			
			
		
		
			return portalLoginService.validate(inputOtp, inputCaptcha, mobileNo);
		
		}
	
}
