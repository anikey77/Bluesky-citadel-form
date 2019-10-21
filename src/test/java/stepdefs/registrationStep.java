package stepdefs;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pageobject.registrationPage;

public class registrationStep {
     public static WebDriver driver;
     public registrationPage registration;

     public registrationStep(){

         System.setProperty("webdriver.gecko.driver", "D:\\Blueskycitadel\\firefox\\geckodriver.exe");
            driver = new FirefoxDriver();
            registration= new registrationPage(driver);
              }

    @Given("^I navigate to blueskycitadel site$")
    public void iNavigateToBlueskycitadelSite() {
        driver.get("http://blueskycitadel.com/test-form-for-bluesky-automation-training/");

    }
        //System.setProperty("webdriver.gecko.driver", "D:\\Blueskycitadel\\firefox\\geckodriver.exe");
//    @And("^I click on register link$")
//    public void iClickOnRegisterLink() {
//        driver.findElement(By.id(""))


    @When("^I fill in the registration details$")
    public void i_fill_in_the_registration_details() throws Throwable {
      registration.FirstName();
      registration.LastName();
      registration.Email();
      registration.ConfirmEmail();
      registration.GenderIdentification();
      registration.Age();
      registration.SingleCheckBox();
      registration. CheckBoxList();
      registration.CheckBoxlist();
      registration.MultiSelect();
      registration.RadioList();
      registration.Select();
      registration.SingleLineText();
      registration.ParagraphText();
      registration.Address();
      registration. Date();
      registration. Submit();
       // driver.findElement(By.id("nf-field-27")).sendKeys("Adebayo");
    }

    @Then("^I am registered$")
    public void i_am_registered() throws Throwable {
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.cssSelector(".nf-response-msg")).getText(),"Your form has been successfully submitted.");
    }


}

