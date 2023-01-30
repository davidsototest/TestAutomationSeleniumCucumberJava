package runner.browser_manager;

//driverManagerFactory = driverManager class nos sirve para definir que browser vamos a usar.
public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){
        runner.browser_manager.DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case SAFARI:
                driverManager = new SafariDriverManager();
                break;
//            case EDGE:
//                driverManager = new EdgeDriverManager();
//                break;
            default:
                System.out.println("Browser invalido");
                break;
        }
        return driverManager;
    }
}
