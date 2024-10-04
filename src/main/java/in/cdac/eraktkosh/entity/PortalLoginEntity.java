package in.cdac.eraktkosh.entity;

import javax.persistence.Entity;

@Entity

public class PortalLoginEntity {

	private String fromPrevDonationTable;

	private String isDonated;

	public String getIsDonated() {
		return isDonated;
	}

	public void setIsDonated(String isDonated) {
		this.isDonated = isDonated;
	}

	public String getFromPrevDonationTable() {
		return fromPrevDonationTable;
	}

	public void setFromPrevDonationTable(String fromPrevDonationTable) {
		this.fromPrevDonationTable = fromPrevDonationTable;
	}

	private String stateName;
	private String districtName;
	private String organizationType;

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	private String age;
	private String hospitalCode;
	private String campId;
	private String fatherName;
	private String pincode;
	private String campDate;
	private String bloodGroupName;

	public String getBloodGroupName() {
		return bloodGroupName;
	}

	public void setBloodGroupName(String bloodGroupName) {
		this.bloodGroupName = bloodGroupName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getCampId() {
		return campId;
	}

	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCampDate() {
		return campDate;
	}

	public void setCampDate(String campDate) {
		this.campDate = campDate;
	}

	public boolean isValidCredentails() {
		return isValidCredentails;
	}

	public void setValidCredentails(boolean isValidCredentails) {
		this.isValidCredentails = isValidCredentails;
	}

	// shalini 13-09-2022
	private String hospitalName;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getSrNo() {
		return srNo;
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

	private String mobileno;
	private String username;
	private String gender;
	private String dob;

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getHealthId() {
		return healthId;
	}

	public void setHealthId(String healthId) {
		this.healthId = healthId;
	}

	public String getSourceRefNo() {
		return sourceRefNo;
	}

	public void setSourceRefNo(String sourceRefNo) {
		this.sourceRefNo = sourceRefNo;
	}

	public String getHospitalStateCode() {
		return hospitalStateCode;
	}

	public void setHospitalStateCode(String hospitalStateCode) {
		this.hospitalStateCode = hospitalStateCode;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}

	public String getBagNo() {
		return bagNo;
	}

	public void setBagNo(String bagNo) {
		this.bagNo = bagNo;
	}

	private String healthId;
	private String source;
	private String sourceRefNo;
	private String srNo;
	private String hospitalStateCode;
	private String hospitalAddress;
	private String organizationName;

	private String address;
	private String district;
	private String state;
	private String bloodGroup;
	private String donationDate;
	private String bagNo;

	// shalini ends

	private String edonorGenderName;
	private String edonorbloodgroupName;
	private String edonorStateName;
	private String edonorDistName;
	private String donorLoginUsername;
	private String donorLoginPass;
	private String donorId;
	private String bloodgroup;
	private String donorFName;
	private String father;
	private String donorUserName;
	private String hasFlag;
	private String hospCode;
	private String userType;
	private String isFirstLogin;
	private String isLastLogin;
	private String isDemoGraphic;
	private String donorUserId;
	private String edonorId;
	private String ebloodgroup;
	private String edonorFName;
	private String edonorLName;
	private String edonorDob;
	private String edonorGender;
	private String edonorEmail;
	private String edonorMobile;
	private String edonorCity;
	private String edonorState;
	private String edonorDist;
	private String edonorPin;
	private String edonorAdd;
	private String edonorPass;
	private String edonorUserId;
	private String date;
	private String bloodbank;
	private String donationId;
	private String portalDonorId;

	private String otherbb;
	private String isEraktKosh;
	private String fitnessStatus;
	private String donationtype;
	private String donortype;
	private String CampDonation;
	private String bloodPressure;
	private String Pulse;
	private String weight;
	private String haemoglobin;
	private String reaction;
	private String hiv;
	private String hBsag;
	private String hepatitisC;
	private String syphilis;
	private String malaria;
	private String donationStatus;
	private boolean isValidCredentails;
	private String slno;
	private String bbcode;
	private String registrationMode;
	private String exeMode;
	private String noOfDonation;
	private String donorName;

	private String lastLoginAttemptCounter;
	private String lastLoginAttemptDate;

	// for registration number
	private String donorRegistration;

	private String investigationStatus; // Added by Asha on 28-dec-2020

	private String isOtpBasedLogin;
	private String bloodBankRating;

	// added by nilesh
	private String ndhmHealthId;
	private String ndhmHealthIdNo;
	private String lgd_state_code;
	private String lgd_district_code;
	private String Abha_link_mode;

	public String getBloodBankRating() {
		return bloodBankRating;
	}

	public void setBloodBankRating(String bloodBankRating) {
		this.bloodBankRating = bloodBankRating;
	}

	public String getIsOtpBasedLogin() {
		return isOtpBasedLogin;
	}

	public void setIsOtpBasedLogin(String isOtpBasedLogin) {
		this.isOtpBasedLogin = isOtpBasedLogin;
	}

	// private String base64Image;
	// private String donorId;
	// private String userType;
	public String getDonorFName() {
		return donorFName;
	}

	public void setDonorFName(String donorFName) {
		this.donorFName = donorFName;
	}

	public String getDonorLName() {
		return donorLName;
	}

	public void setDonorLName(String donorLName) {
		this.donorLName = donorLName;
	}

	public String getDonorDob() {
		return donorDob;
	}

	public void setDonorDob(String donorDob) {
		this.donorDob = donorDob;
	}

	public String getDonorGender() {
		return donorGender;
	}

	public void setDonorGender(String donorGender) {
		this.donorGender = donorGender;
	}

	public String getDonorEmail() {
		return donorEmail;
	}

	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}

	public String getDonorMobile() {
		return donorMobile;
	}

	public void setDonorMobile(String donorMobile) {
		this.donorMobile = donorMobile;
	}

	public String getDonorCity() {
		return donorCity;
	}

	public void setDonorCity(String donorCity) {
		this.donorCity = donorCity;
	}

	public String getDonorState() {
		return donorState;
	}

	public void setDonorState(String donorState) {
		this.donorState = donorState;
	}

	public String getDonorDist() {
		return donorDist;
	}

	public void setDonorDist(String donorDist) {
		this.donorDist = donorDist;
	}

	public String getDonorPin() {
		return donorPin;
	}

	public void setDonorPin(String donorPin) {
		this.donorPin = donorPin;
	}

	public String getDonorAdd() {
		return donorAdd;
	}

	public void setDonorAdd(String donorAdd) {
		this.donorAdd = donorAdd;
	}

	private String donorLName;
	private String donorDob;
	private String donorGender;
	private String donorEmail;
	private String donorMobile;
	private String donorCity;
	private String donorState;
	private String donorDist;
	private String donorPin;
	private String donorAdd;
	private String donorPass;
	private String religion;
	private String occupation;
	private String maritalStatus;
	private String country;
	private String cardNo;
	private String spouce;
	private String hno;
	private String street;
	private String location;
	private String landmark;
	private String anotherId;
	private int totalDonations;
	private boolean isValidOtp;
	private String allrep;
	private String selectrep;
	private String rstate;
	private String rdist;
	private String rbb;
	private String isRepository;
	private String repState;
	private String repDist;
	private String repBb;
	private String repBbCode;
	private String index;
	private String base64Image;
	private String bldBagNo;
	private String bloodComponent;
	private String issueTo;
	private String hospName;
	private String totalIssue;
	private String issueDate;
	private int totalDonationsYearWise;

	public String getBldBagNo() {
		return bldBagNo;
	}

	public void setBldBagNo(String bldBagNo) {
		this.bldBagNo = bldBagNo;
	}

	public String getBloodComponent() {
		return bloodComponent;
	}

	public void setBloodComponent(String bloodComponent) {
		this.bloodComponent = bloodComponent;
	}

	public String getIssueTo() {
		return issueTo;
	}

	public void setIssueTo(String issueTo) {
		this.issueTo = issueTo;
	}

	public String getHospName() {
		return hospName;
	}

	public void setHospName(String hospName) {
		this.hospName = hospName;
	}

	public String getDonorPass() {
		return donorPass;
	}

	public void setDonorPass(String donorPass) {
		this.donorPass = donorPass;
	}

	public boolean isValidOtp() {
		return isValidOtp;
	}

	public void setValidOtp(boolean isValidOtp) {
		this.isValidOtp = isValidOtp;
	}

	public String getDonorId() {
		return donorId;
	}

	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getSpouce() {
		return spouce;
	}

	public void setSpouce(String spouce) {
		this.spouce = spouce;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getAnotherId() {
		return anotherId;
	}

	public void setAnotherId(String anotherId) {
		this.anotherId = anotherId;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getDonorUserName() {
		return donorUserName;
	}

	public void setDonorUserName(String donorUserName) {
		this.donorUserName = donorUserName;
	}

	public String getHasFlag() {
		return hasFlag;
	}

	public void setHasFlag(String hasFlag) {
		this.hasFlag = hasFlag;
	}

	public String getHospCode() {
		return hospCode;
	}

	public void setHospCode(String hospCode) {
		this.hospCode = hospCode;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getIsFirstLogin() {
		return isFirstLogin;
	}

	public void setIsFirstLogin(String isFirstLogin) {
		this.isFirstLogin = isFirstLogin;
	}

	public String getIsLastLogin() {
		return isLastLogin;
	}

	public void setIsLastLogin(String isLastLogin) {
		this.isLastLogin = isLastLogin;
	}

	public String getIsDemoGraphic() {
		return isDemoGraphic;
	}

	public void setIsDemoGraphic(String isDemoGraphic) {
		this.isDemoGraphic = isDemoGraphic;
	}

	public String getDonorUserId() {
		return donorUserId;
	}

	public void setDonorUserId(String donorUserId) {
		this.donorUserId = donorUserId;
	}

	public String getEdonorId() {
		return edonorId;
	}

	public void setEdonorId(String edonorId) {
		this.edonorId = edonorId;
	}

	public String getEbloodgroup() {
		return ebloodgroup;
	}

	public void setEbloodgroup(String ebloodgroup) {
		this.ebloodgroup = ebloodgroup;
	}

	public String getEdonorFName() {
		return edonorFName;
	}

	public void setEdonorFName(String edonorFName) {
		this.edonorFName = edonorFName;
	}

	public String getEdonorLName() {
		return edonorLName;
	}

	public void setEdonorLName(String edonorLName) {
		this.edonorLName = edonorLName;
	}

	public String getEdonorDob() {
		return edonorDob;
	}

	public void setEdonorDob(String edonorDob) {
		this.edonorDob = edonorDob;
	}

	public String getEdonorGender() {
		return edonorGender;
	}

	public void setEdonorGender(String edonorGender) {
		this.edonorGender = edonorGender;
	}

	public String getEdonorEmail() {
		return edonorEmail;
	}

	public void setEdonorEmail(String edonorEmail) {
		this.edonorEmail = edonorEmail;
	}

	public String getEdonorMobile() {
		return edonorMobile;
	}

	public void setEdonorMobile(String edonorMobile) {
		this.edonorMobile = edonorMobile;
	}

	public String getEdonorCity() {
		return edonorCity;
	}

	public void setEdonorCity(String edonorCity) {
		this.edonorCity = edonorCity;
	}

	public String getEdonorState() {
		return edonorState;
	}

	public void setEdonorState(String edonorState) {
		this.edonorState = edonorState;
	}

	public String getEdonorDist() {
		return edonorDist;
	}

	public void setEdonorDist(String edonorDist) {
		this.edonorDist = edonorDist;
	}

	public String getEdonorPin() {
		return edonorPin;
	}

	public void setEdonorPin(String edonorPin) {
		this.edonorPin = edonorPin;
	}

	public String getEdonorAdd() {
		return edonorAdd;
	}

	public void setEdonorAdd(String edonorAdd) {
		this.edonorAdd = edonorAdd;
	}

	public String getEdonorPass() {
		return edonorPass;
	}

	public void setEdonorPass(String edonorPass) {
		this.edonorPass = edonorPass;
	}

	public String getEdonorUserId() {
		return edonorUserId;
	}

	public void setEdonorUserId(String edonorUserId) {
		this.edonorUserId = edonorUserId;
	}

	public String getDonorLoginUsername() {
		return donorLoginUsername;
	}

	public void setDonorLoginUsername(String donorLoginUsername) {
		this.donorLoginUsername = donorLoginUsername;
	}

	public String getDonorLoginPass() {
		return donorLoginPass;
	}

	public void setDonorLoginPass(String donorLoginPass) {
		this.donorLoginPass = donorLoginPass;
	}

	public String getEdonorGenderName() {
		return edonorGenderName;
	}

	public void setEdonorGenderName(String edonorGenderName) {
		this.edonorGenderName = edonorGenderName;
	}

	public String getEdonorbloodgroupName() {
		return edonorbloodgroupName;
	}

	public void setEdonorbloodgroupName(String edonorbloodgroupName) {
		this.edonorbloodgroupName = edonorbloodgroupName;
	}

	public String getEdonorStateName() {
		return edonorStateName;
	}

	public void setEdonorStateName(String edonorStateName) {
		this.edonorStateName = edonorStateName;
	}

	public String getEdonorDistName() {
		return edonorDistName;
	}

	public void setEdonorDistName(String edonorDistName) {
		this.edonorDistName = edonorDistName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBloodbank() {
		return bloodbank;
	}

	public void setBloodbank(String bloodbank) {
		this.bloodbank = bloodbank;
	}

	public String getDonationId() {
		return donationId;
	}

	public void setDonationId(String donationId) {
		this.donationId = donationId;
	}

	public String getPortalDonorId() {
		return portalDonorId;
	}

	public void setPortalDonorId(String portalDonorId) {
		this.portalDonorId = portalDonorId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getOtherbb() {
		return otherbb;
	}

	public void setOtherbb(String otherbb) {
		this.otherbb = otherbb;
	}

	public String getIsEraktKosh() {
		return isEraktKosh;
	}

	public void setIsEraktKosh(String isEraktKosh) {
		this.isEraktKosh = isEraktKosh;
	}

	public String getFitnessStatus() {
		return fitnessStatus;
	}

	public void setFitnessStatus(String fitnessStatus) {
		this.fitnessStatus = fitnessStatus;
	}

	public String getDonationtype() {
		return donationtype;
	}

	public void setDonationtype(String donationtype) {
		this.donationtype = donationtype;
	}

	public String getDonortype() {
		return donortype;
	}

	public void setDonortype(String donortype) {
		this.donortype = donortype;
	}

	public String getCampDonation() {
		return CampDonation;
	}

	public void setCampDonation(String campDonation) {
		CampDonation = campDonation;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getPulse() {
		return Pulse;
	}

	public void setPulse(String pulse) {
		Pulse = pulse;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHaemoglobin() {
		return haemoglobin;
	}

	public void setHaemoglobin(String haemoglobin) {
		this.haemoglobin = haemoglobin;
	}

	public String getReaction() {
		return reaction;
	}

	public void setReaction(String reaction) {
		this.reaction = reaction;
	}

	public String getHiv() {
		return hiv;
	}

	public void setHiv(String hiv) {
		this.hiv = hiv;
	}

	public String gethBsag() {
		return hBsag;
	}

	public void sethBsag(String hBsag) {
		this.hBsag = hBsag;
	}

	public String getHepatitisC() {
		return hepatitisC;
	}

	public void setHepatitisC(String hepatitisC) {
		this.hepatitisC = hepatitisC;
	}

	public String getSyphilis() {
		return syphilis;
	}

	public void setSyphilis(String syphilis) {
		this.syphilis = syphilis;
	}

	public String getMalaria() {
		return malaria;
	}

	public void setMalaria(String malaria) {
		this.malaria = malaria;
	}

	public String getDonationStatus() {
		return donationStatus;
	}

	public void setDonationStatus(String donationStatus) {
		this.donationStatus = donationStatus;
	}

	public boolean getisValidCredentails() {
		return isValidCredentails;
	}

	public void setisValidCredentails(boolean isValidCredentails) {
		this.isValidCredentails = isValidCredentails;
	}

	public int getTotalDonations() {
		return totalDonations;
	}

	public void setTotalDonations(int length) {
		this.totalDonations = length;
	}

	public String getAllrep() {
		return allrep;
	}

	public void setAllrep(String allrep) {
		this.allrep = allrep;
	}

	public String getSelectrep() {
		return selectrep;
	}

	public void setSelectrep(String selectrep) {
		this.selectrep = selectrep;
	}

	public String getRstate() {
		return rstate;
	}

	public void setRstate(String rstate) {
		this.rstate = rstate;
	}

	public String getRdist() {
		return rdist;
	}

	public void setRdist(String rdist) {
		this.rdist = rdist;
	}

	public String getRbb() {
		return rbb;
	}

	public void setRbb(String rbb) {
		this.rbb = rbb;
	}

	public String getIsRepository() {
		return isRepository;
	}

	public void setIsRepository(String isRepository) {
		this.isRepository = isRepository;
	}

	public String getRepState() {
		return repState;
	}

	public void setRepState(String repState) {
		this.repState = repState;
	}

	public String getRepDist() {
		return repDist;
	}

	public void setRepDist(String repDist) {
		this.repDist = repDist;
	}

	public String getRepBb() {
		return repBb;
	}

	public void setRepBb(String repBb) {
		this.repBb = repBb;
	}

	public String getRepBbCode() {
		return repBbCode;
	}

	public void setRepBbCode(String repBbCode) {
		this.repBbCode = repBbCode;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String str) {
		this.index = str;
	}

	public String getSlno() {
		return slno;
	}

	public void setSlno(String slno) {
		this.slno = slno;
	}

	public String getBbcode() {
		return bbcode;
	}

	public void setBbcode(String bbcode) {
		this.bbcode = bbcode;
	}

	public String getRegistrationMode() {
		return registrationMode;
	}

	public void setRegistrationMode(String registrationMode) {
		this.registrationMode = registrationMode;
	}

	public String getBase64Image() {
		return base64Image;
	}

	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}

	public String getTotalIssue() {
		return totalIssue;
	}

	public void setTotalIssue(String totalIssue) {
		this.totalIssue = totalIssue;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExeMode() {
		return exeMode;
	}

	public void setExeMode(String exeMode) {
		this.exeMode = exeMode;
	}

	public String getNoOfDonation() {
		return noOfDonation;
	}

	public void setNoOfDonation(String noOfDonation) {
		this.noOfDonation = noOfDonation;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public int getTotalDonationsYearWise() {
		return totalDonationsYearWise;
	}

	public void setTotalDonationsYearWise(int totalDonationsYearWise) {
		this.totalDonationsYearWise = totalDonationsYearWise;
	}

	public String getLastLoginAttemptCounter() {
		return lastLoginAttemptCounter;
	}

	public void setLastLoginAttemptCounter(String lastLoginAttemptCounter) {
		this.lastLoginAttemptCounter = lastLoginAttemptCounter;
	}

	public String getLastLoginAttemptDate() {
		return lastLoginAttemptDate;
	}

	public void setLastLoginAttemptDate(String lastLoginAttemptDate) {
		this.lastLoginAttemptDate = lastLoginAttemptDate;
	}

	public String getDonorRegistration() {
		return donorRegistration;
	}

	public void setDonorRegistration(String donorRegistration) {
		this.donorRegistration = donorRegistration;
	}

	public String getInvestigationStatus() {
		return investigationStatus;
	}

	public void setInvestigationStatus(String investigationStatus) {
		this.investigationStatus = investigationStatus;
	}

	public String getNdhmHealthId() {
		return ndhmHealthId;
	}

	public void setNdhmHealthId(String ndhmHealthId) {
		this.ndhmHealthId = ndhmHealthId;
	}

	public String getNdhmHealthIdNo() {
		return ndhmHealthIdNo;
	}

	public void setNdhmHealthIdNo(String ndhmHealthIdNo) {
		this.ndhmHealthIdNo = ndhmHealthIdNo;
	}

	public String getLgd_state_code() {
		return lgd_state_code;
	}

	public void setLgd_state_code(String lgd_state_code) {
		this.lgd_state_code = lgd_state_code;
	}

	public String getLgd_district_code() {
		return lgd_district_code;
	}

	public void setLgd_district_code(String lgd_district_code) {
		this.lgd_district_code = lgd_district_code;
	}

	public String getAbha_link_mode() {
		return Abha_link_mode;
	}

	public void setAbha_link_mode(String abha_link_mode) {
		Abha_link_mode = abha_link_mode;
	}

}
