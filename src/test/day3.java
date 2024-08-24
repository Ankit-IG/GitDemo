package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before executing any method in the class");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("After executing any method in the class");
	}
    @Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname, String key) {
		// selenium
		System.out.println("WebloginCarLoan");
		System.out.println(urlname);
		System.out.println(key);
		
	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every method in day3 class");
	}
	
	@AfterMethod
	public void Aftereevery() {
		System.out.println("I will execute after every method in day3 class");
	}
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan() {
		// Appium
		System.out.println("MobileloginCar");
	}
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am on no.1");
	}
	@Test(enabled=false)
	public void MobilesigninCarLoan() {
		// Appium
		System.out.println("Mobile SIGNIN");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String username, String password) {
		// Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods={"WebloginCarLoan"}) //Make sure this method has executed first then it will executed
	public void LoginAPICarLoan() {
		// Rest API automation
		System.out.println("LoginAPICar");
	}
     @DataProvider
     public Object[][] getData()
     {
    	 //1st Combination- Username password- good credit history
    	 //2nd- username password- no credit history
    	 //3rd - username password- fraud credit history
    	 
    	 Object[][] data= new Object[3][2];//[row][col]
    	 //1st Set
    	 data[0][0]= "firstsetusername";
    	 data[0][1]= "firstpassword";
    	 //columns in the row re nothing but values for that particular combination(row)
    	 
    	 //2nd Set
    	 data[1][0]= "secondsetusername";
    	 data[1][1]= "secondpassword";
    	 
    	//3rd Set
    	 data[2][0]= "thirdsetusername";
    	 data[2][1]= "thirdpassword";
    	 return data;
     }
}
