package pom_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Merchant_Login extends BasePage {
    public Merchant_Login(WebDriver driver) {
    	super(driver);
    }
    @FindBy(id = "vertical-tab-1")
    WebElement Merchant_Login_Btn;
    
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