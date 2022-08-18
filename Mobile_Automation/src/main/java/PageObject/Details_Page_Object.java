package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Details_Page_Object {


	public AndroidDriver driver;
	
	
	private By tool_bar_title = By.id("com.androidsample.generalstore:id/toolbar_title");
	
	private By countryDropDownOption = By.id("com.androidsample.generalstore:id/spinnerCountry");
	
	private By countryList = By.id("android:id/text1");
	
	private By nameField = By.id("com.androidsample.generalstore:id/nameField");
	
	private By genderOptions = AppiumBy.className("android.widget.RadioButton");
	
	private By lets_shop_submit = By.id("com.androidsample.generalstore:id/btnLetsShop");
	
	
	public Details_Page_Object(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}

	public WebElement getToolBarTitle() {
		return driver.findElement(tool_bar_title);
	}
	
	public WebElement getCountryDropDown() {
		return driver.findElement(countryDropDownOption);
	}
	
	public List<WebElement> getCountryList(){
		return driver.findElements(countryList);
	}
	
	public WebElement getNameField() {
		return driver.findElement(nameField);	
	}
	
	public List<WebElement> getGenderOptionList(){
		return driver.findElements(genderOptions);
	}
	
	public WebElement getLetShopSubmit() {
		return driver.findElement(lets_shop_submit);
	}
}
