package pom_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Admin_Login extends BasePage {
	public Admin_Login(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="vertical-tab-2")
	WebElement Admin_Login_btn;
	
	@FindBy(id="Email")
    WebElement Email_Textfield;
    
    @FindBy(id="Password")
    WebElement Password_Textfield;
    
    @FindBy(xpath="//span[text()='Login']")
    WebElement Login_btn;
    
    @FindBy(xpath="//span[text()='Create Account']")
    WebElement Createaccount_btn;
    
    @FindBy(id="Forgot Password?")
    WebElement Forgot_Password_btn;
      
}
