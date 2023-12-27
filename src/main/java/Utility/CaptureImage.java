package Utility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureImage {
	
	public static void takeScreenShot_Failure (WebDriver driver ,String fileName) throws  IOException {

	
	 TakesScreenshot scrnShots=(TakesScreenshot)driver;
	    
	 File sourse = scrnShots.getScreenshotAs(OutputType.FILE);
	 
	 File dest =new File("..SeleniumPractise/CapturedScreenShot/"+fileName+".png");
	 
	// FileHandler.copy(sourse,dest);
	 
	 
}
	public static void takeScreenShot_Pass (WebDriver driver ,String fileName) throws  IOException {

		
		 TakesScreenshot scrnShots=(TakesScreenshot)driver;
		    
		 File sourse = scrnShots.getScreenshotAs(OutputType.FILE);
		 
		 File dest =new File("..SeleniumPractise/CapturedScreenShot/"+fileName+".png");
		 
	//	 FileHandler.copy(sourse,dest);
		 
	}	 
	
}