package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements Testng listeners
public class Listeners implements ITestListener {
	
	 @Override
	   public void onTestStart(ITestResult result) {
		   //System.out.println();
	   }
	
   @Override
   public void onTestSuccess(ITestResult result) {
	  // System.out.println("I successfully executed Listener pass code");
   }
   
   @Override
   public void onTestFailure(ITestResult result) {
	   System.out.println("I successfully executed Listener fail code" +result.getName());
   }
   
   @Override
   public void onTestSkipped(ITestResult result) {
	   //System.out.println();
   }
   
   public void onTestFailedButWithinSucessPercentage(ITestResult result) {
	   //System.out.println();
   }
   
}
