package pom_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class WelcomePage extends BasePage{
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="loginBtn")
	WebElement Loginbutton;
	
	public void clickLogin() {
		clickAction(Loginbutton);
	}
	
	
}