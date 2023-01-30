package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en el home de nuestra web$")
    public void el_usuario_se_encuentra_en_el_home_de_nuestra_web() {
        String titleHomePage = "Home | imalittletester";
        Assert.assertEquals(titleHomePage,driver.getTitle());
    }
    @When("^Cuando hace click en el boton The little tester comics$")
    public void cuando_hace_click_en_el_boton_the_little_tester_comics() {
        WebElement contactos = driver.findElement(By.id("comp-iiyocj9v5label"));
        contactos.click();
    }
    @Then("^se debe dirigir a la pantalla comics$")
    public void se_debe_dirigir_a_la_pantalla_comics() {
        String title = driver.getTitle();
        Assert.assertEquals("Latest 'The Little Tester' Comics | imalittletester", title);
//        Assert.assertTrue("No coincide el titulo con: Contactos", modalContactos.isDisplayed());
    }

}
