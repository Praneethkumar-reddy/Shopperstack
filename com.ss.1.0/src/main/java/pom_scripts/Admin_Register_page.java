package pom_scripts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Admin_Register_page {
	@FindBy(id = "First Name")
	WebElement First_Name_Textfield;
	
	@FindBy(id = "Last Name")
	WebElement Last_Name_Textfield;
	
	@FindBy(id = "Male")
	WebElement Male_Radiobtn;
	
	@FindBy(id = "Phone Number")
	WebElement Phone_Number_Textfield;
	
	@FindBy(id="Email Address")
	WebElement Email_Address_textfield;
	
	@FindBy(id="Password")
	WebElement Password_textfield;
	
	@FindBy(id="Confirm Password")
	WebElement Confirm_Password_textfield;
	
	@FindBy(id="Country")
	WebElement Country_dropdown;
	
	@FindBy(id="State")
	WebElement State_dropdown;

	@FindBy(id="City")
	WebElement City_dropdown;

	
	@FindBy(id = "Register")
	WebElement Register_btn;

}
