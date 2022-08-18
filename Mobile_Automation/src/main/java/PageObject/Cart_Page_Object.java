package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Cart_Page_Object {

	public AndroidDriver driver;
	
	private By added_product_Name_List = By.id("com.androidsample.generalstore:id/productName");
	
	private By check_me = By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']");
	
	private By proceed_submit = By.id("com.androidsample.generalstore:id/btnProceed");
	
	public Cart_Page_Object(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public List<WebElement> get_product_name_list(){
		return driver.findElements(added_product_Name_List);
	}
	
	public WebElement get_check_box_option() {
		return driver.findElement(check_me);
	}
	
	public WebElement get_proceed_submit() {
		return driver.findElement(proceed_submit);
	}
}
