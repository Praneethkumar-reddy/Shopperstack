package register;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ReadExcel;
import pom_scripts.ShopperLogin;
import pom_scripts.Shopper_Register;
import pom_scripts.WelcomePage;

public class SS_RG_001 extends generic.Base_Test{
	
	@Test(dataProvider = "shop_register")
	public void shopper_Register(String Firstname,String Lastname,String phonenumber,String Email,String Password,String Confirm_password) {
		WelcomePage page=new WelcomePage(driver);
		ShopperLogin login=new ShopperLogin(driver);
		Shopper_Register shopper=new Shopper_Register(driver);
		page.clickLogin();
		login.Create_Account_btn.click();
		shopper.First_Name_Textfield.sendKeys(Firstname);
		shopper.Last_Name_Textfield.sendKeys(Lastname);
		shopper.Male_Radiobtn.click();
		shopper.Phone_Number_Textfield.sendKeys(phonenumber);
		shopper.Email_Address_textfield.sendKeys(Email);
		shopper.Password_textfield.sendKeys(Password);
		shopper.Confirm_Password_textfield.sendKeys(Confirm_password);
		shopper.Terms_Conditions_Checkbox.click();
		shopper.Register_btn.click();
	}
	@DataProvider(name="shop_register")
	public Object[][] shop_register_data() throws IOException{
		return ReadExcel.getMultipleData("Shopper_Register");
	}
}