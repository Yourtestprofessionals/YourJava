package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Mantisobjecten {
	
	private static WebElement element = null;

	public static WebElement DropDown_category(WebDriver driver){
		element =  driver.findElement(By.name("category_id"));
		return element;
	}

	public static WebElement DropDown_reproducibility(WebDriver driver){
		element =  driver.findElement(By.name("reproducibility"));
		return element;
	}
	
	public static WebElement DropDown_severity(WebDriver driver){
		element =  driver.findElement(By.name("severity"));
		return element;
	}
	
	public static WebElement DropDown_priority(WebDriver driver){
		element =  driver.findElement(By.name("priority"));
		return element;
	}
		
	public static WebElement text_platform(WebDriver driver){
		element =  driver.findElement(By.name("platform"));
		return element;
	}
	public static WebElement text_os(WebDriver driver){
		element =  driver.findElement(By.name("os"));
		return element;
	}
	public static WebElement text_os_build(WebDriver driver){
		element =  driver.findElement(By.name("os_build"));
		return element;
	}
	
	public static WebElement DropDown_handler_id(WebDriver driver){
		element =  driver.findElement(By.name("handler_id"));
		return element;
	}	
	
	public static WebElement text_summary(WebDriver driver){
		element =  driver.findElement(By.name("summary"));
		return element;
	}
	public static WebElement text_description(WebDriver driver){
		element =  driver.findElement(By.name("description"));
		return element;
	}
	public static WebElement text_steps_to_reproduce(WebDriver driver){
		element =  driver.findElement(By.name("steps_to_reproduce"));
		return element;
	}
	public static WebElement text_additional_info(WebDriver driver){
		element =  driver.findElement(By.name("additional_info"));
		return element;
	}
	
	public static WebElement DropDown_custom_field_5(WebDriver driver){
		element =  driver.findElement(By.name("custom_field_5"));
		return element;
	}
		
	public static WebElement DropDown_custom_field_1(WebDriver driver){
		element =  driver.findElement(By.name("custom_field_1"));
		return element;
	}
	
	public static WebElement DropDown_ToonSeverity(WebDriver driver){
		element =  driver.findElement(By.name("show_severity[]"));
		return element;
	}
	
	public static WebElement ClickWordIcon(WebDriver driver){
		element =  driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/a[1]/img"));
		return element;
	}
	
	public static WebElement ClickReport(WebDriver driver){
		element =  driver.findElement(By.linkText("Print Reports"));
		return element;
	}
	public static WebElement ApplyFilter(WebDriver driver){
		element =  driver.findElement(By.name("filter"));
		return element;
	}
	
	public static WebElement Select_Severity(WebDriver driver){
		element =  driver.findElement(By.id("show_severity_filter"));
		return element;
	}

	public static WebElement Vul_Severity(WebDriver driver){
		element =  driver.findElement(By.name("show_severity[]"));
		return element;
	}
		
	public static WebElement SelectCategory(WebDriver driver){
		element =  driver.findElement(By.id("show_category_filter"));
		return element;
	}
	public static WebElement Vul_Category(WebDriver driver){
		element =  driver.findElement(By.name("show_category[]"));
		return element;
	}

	public static WebElement submit_button(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[value='Submit Report']"));
		return element;
	}	

	public static WebElement Select_reporter(WebDriver driver){
		element =  driver.findElement(By.id("reporter_id_filter"));
		return element;
	}
	
	public static WebElement Vul_reporter(WebDriver driver){
		element =  driver.findElement(By.name("reporter_id[]"));
		return element;
	}	
	public static WebElement Click_CSV(WebDriver driver){
		element =  driver.findElement(By.linkText("CSV Export"));
		return element;
	}
	public static WebElement Click_XML(WebDriver driver){
		element =  driver.findElement(By.linkText("XML Export"));
		return element;
	}
	
}
