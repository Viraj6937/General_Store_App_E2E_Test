package PageObject;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Product_Page_Object {

	public AndroidDriver driver;
	
	private By productNameList = AppiumBy.className("android.widget.TextView");
	
	private By addToCartButton = By.id("com.androidsample.generalstore:id/productAddCart");
	
	private By cartButton = By.id("com.androidsample.generalstore:id/appbar_btn_cart");
	
	public Product_Page_Object(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public List<WebElement> getProductNameList(){
		return driver.findElements(productNameList);
	}
	
	public List<WebElement> getAddToCartButton(){
		return driver.findElements(addToCartButton);
	}
	
	public WebElement getCartButton() {
		return driver.findElement(cartButton);
	}
		
}
