
public class SignUpDataStorepage {
	
	private String UserFirstName;
	private String UserLastName;
	private String userPassword;
	private String userEmail;
	private String phoneNumber;
	private RandomSource randomNumber_9digit;
	private String random_number;
	
	public SignUpDataStorepage() {
		
	}
   
	public SignUpDataStorepage(	String UserFirstName, String UserLastName, String userPassword, String userEmail,String phoneNumber) {
		this.UserFirstName = UserFirstName;
		this.UserLastName = UserLastName;
		this.userPassword = userPassword;
		this.phoneNumber = phoneNumber;
	}
	
	
	//---------------------encapsolation-----------------
	
	 public String getrandomnumberdigitLimit(int digitLimit) {
		
		randomNumber_9digit = new RandomSource();
		 randomNumber_9digit.randomlimit(digitLimit);
		 random_number=String.valueOf(randomNumber_9digit.get_random());
		 return random_number;
	 }
	
	public String getUserFirstName() {
		return UserFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		UserFirstName = userFirstName;
	}
	public String getUserLastName() {
		return UserLastName;
	}
	public void setUserLastName(String userLastName) {
		UserLastName = userLastName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
