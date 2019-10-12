import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.google.com");
	}

}
