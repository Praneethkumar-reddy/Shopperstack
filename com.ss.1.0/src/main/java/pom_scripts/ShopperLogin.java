package pom_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ShopperLogin extends BasePage{
	public ShopperLogin(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id = "Password")
	public WebElement Password;
	
	@FindBy(xpath = "//span[text()='Login']")
	public WebElement LoginButton;
	
	@FindBy(xpath = "//span[text()='Create Account']")
	public
	WebElement Create_Account_btn;
}
