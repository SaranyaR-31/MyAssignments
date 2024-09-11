package Assignment5;

public class LoginTestData extends TestData {
	
		
		public void enterUsername() {
			System.out.println("Saranya");
		}
		
		public void enterPassword() {
			System.out.println("2031");
		}
		
		public static void main(String[] args) {
			LoginTestData logintestdata = new LoginTestData();
			logintestdata.enterCredentials();
			logintestdata.navigateToHomePage();
			logintestdata.enterUsername();
			logintestdata.enterPassword();
					
		}

	}


