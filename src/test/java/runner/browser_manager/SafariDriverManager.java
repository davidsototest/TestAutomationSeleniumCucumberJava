package runner.browser_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SafariDriverManager extends DriverManager{

    @Override
    public void createDriver(){
//        System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
    }
}
