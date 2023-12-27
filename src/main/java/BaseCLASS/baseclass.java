package BaseCLASS;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
  public static  WebDriver driver;
   public static  Properties prop;
     FileInputStream fInput;
     
    
	public baseclass() throws  IOException  {                     
       Properties prop=new Properties();
      fInput = new FileInputStream("../AutomaionClass/src/main/java/Utility/config.properties");
       
       prop.load(fInput); 
       
       }
	
	public void initialBrowser() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("baseUrl"));
	}
	
	public void closeBrowser () throws InterruptedException {
		Thread.sleep(2000);
	
	}
}
