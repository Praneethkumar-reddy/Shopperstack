package pom_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Shopper_Register extends BasePage {
	public Shopper_Register(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "First Name")
	public WebElement First_Name_Textfield;
	
	@FindBy(id = "Last Name")
	public WebElement Last_Name_Textfield;
	
	@FindBy(id = "Male")
	public WebElement Male_Radiobtn;
	
	@FindBy(id = "Phone Number")
	public WebElement Phone_Number_Textfield;
	
	@FindBy(id="Email Address")
	public WebElement Email_Address_textfield;
	
	@FindBy(id="Password")
	public WebElement Password_textfield;
	
	@FindBy(id="Confirm Password")
	public WebElement Confirm_Password_textfield;
	
	@FindBy(id="Terms and Conditions")
	public WebElement Terms_Conditions_Checkbox;
	
	@FindBy(id = "Register")
	public WebElement Register_btn;
	
}