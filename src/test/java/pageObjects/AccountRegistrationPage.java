package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//input[@id=\"input-firstname\"]")
	WebElement txtFirstName;		
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement txtEmail;		
			
	@FindBy(xpath="//input[@id=\"input-telephone\"]")
	WebElement txtTelephone;	
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement txtPwd;
	
	@FindBy(xpath="//input[@id=\"input-confirm\"]")
	WebElement txtConfirmPwd;
	
	@FindBy(xpath="//input[@name='agree']") 
	WebElement chkdPolicy;

	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fName) {
		txtFirstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		txtLastName.sendKeys(lName);
	}
	
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	
	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);
	}
	
	public void setpwd(String pwd) {
		txtPwd.sendKeys(pwd);
	}
	
	public void setconfirmpwd(String confirmpwd) {
		txtConfirmPwd.sendKeys(confirmpwd);
	}
	
	public void setPrivacyPolicy() {
		chkdPolicy.click();
	}
	
	public void clickContinueBtn() {
		btnContinue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	
}
}
