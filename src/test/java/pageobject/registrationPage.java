package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class registrationPage {
public registrationPage(WebDriver driver){

    PageFactory.initElements(driver, this);

}

@FindBy(how = How.ID,using ="nf-field-26" )
  private WebElement firstname;
@FindBy(how = How.ID,using = "nf-field-27")
private WebElement lastname;
@FindBy(how = How.NAME,using = "email")
private WebElement email;
@FindBy(how = How.ID_OR_NAME,using = "nf-field-29")
private  WebElement confirmemail;
@FindBy(how = How.NAME,using = "nf-field-30")
private WebElement genderidentification;
@FindBy(how = How.ID,using = "nf-field-31-1")
private WebElement age;
@FindBy(how = How.NAME,using = "nf-field-39")
private WebElement singlecheckbox;
@FindBy(how = How.ID,using = "nf-label-field-40")
private WebElement checkboxlist;
@FindBy(how = How.ID,using = "nf-field-40-0")
private  WebElement Checkboxlist;
@FindBy(how = How.ID,using = "nf-field-41")
private WebElement multiselect;
@FindBy(how = How.ID,using = "nf-field-42-0")
private WebElement radiolist;
@FindBy(how = How.ID,using = "nf-field-43")
private WebElement select;
@FindBy(how = How.ID,using = "nf-field-45")
private WebElement singlelinetext;
@FindBy(how = How.ID,using = "nf-field-44")
private WebElement paragraphtext;
@FindBy(how = How.ID,using = "nf-field-46")
private WebElement address;
@FindBy(how = How.CSS,using = ".pikaday__display")
private WebElement date;
@FindBy(how = How.ID,using = "nf-field-37")
private WebElement submit;


public void Submit(){
    submit.click();
}
public void Date(){
    date.sendKeys("10/14/2019");
}
public void Address(){
    address.sendKeys("557 westhorne avenue,london se9 6dn");
}
public void ParagraphText(){
    paragraphtext.sendKeys("I want to be able to explore bluesky citadel home page");
}
public void SingleLineText(){
  singlelinetext.sendKeys("i want to register with bluesky citadel ");
}
public void Select(){
  select.click();
}
public void RadioList(){
    radiolist.click();

}
public void MultiSelect(){
  multiselect.click();
}
public void CheckBoxlist(){

    checkboxlist.click();
}
public void CheckBoxList(){
  checkboxlist.click();
}
public void SingleCheckBox(){
    singlecheckbox.click();
}
public void Age(){
    age.click();
}
public void GenderIdentification(){
  genderidentification.sendKeys("female");
}
public void ConfirmEmail(){
    confirmemail.sendKeys("kudidebay@yahoo.com");
}
public void Email(){
 email.sendKeys("kudidebay@yahoo.com");
}
public void LastName(){
 lastname.sendKeys("Adebayo");
}
public void FirstName(){
    firstname.sendKeys("kudi");
}
}
