package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;

    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Ejecutando TS: " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.SAFARI);
        driver = driverManager.getDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        System.out.println("Se ejecuto correctamente TS: " + numberOfCase);
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
