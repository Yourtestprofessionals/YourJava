package codebase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPortal {
		
		public WebDriver inloggen(String Omgeving, String Rol, String Browser) {
		
		String InlogUrl = null;
				
		WebDriver driver = AanroepDriver.roepdriver(Browser);
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  // Variablen van productie- en acceptatieomgeving
		  if (Omgeving == "ACC") {
		  	   InlogUrl = "http://accept.yourtestprojects.com/";
		  }
		  
		  if (Omgeving == "PRO") {
			  InlogUrl = "http://www.yourtestprojects.com/";
		  }
		  
		  // Url  aan de hand van opgegeven ACC of PRO variable
		  driver.get(InlogUrl);
		  
		  // Maximaal formaat browservenster
		   driver.manage().window().maximize(); 
		  
		  // Variablen van diverse users/rollen
		  if (Rol == "developer") {
			  driver.findElement(By.name("name")).sendKeys("softwaredeveloper");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016!");
		  }
		  
		  if (Rol == "testanalyst") {
			  driver.findElement(By.name("name")).sendKeys("testanalyst");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016!");
		  }
		  
		  if (Rol == "testleader") {
			  driver.findElement(By.name("name")).sendKeys("testleader");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016!");
		  }
		  
		  if (Rol == "stakeholder") {
			  driver.findElement(By.name("name")).sendKeys("stakeholder");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016!");
		  }
		  
		  if (Rol == "projectmanager") {
			  driver.findElement(By.name("name")).sendKeys("projectmanager");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016!");
		  }
		  
		  if (Rol == "testleader-error") {
			  driver.findElement(By.name("name")).sendKeys("aap");
			  driver.findElement(By.name("pass")).sendKeys("bullcrap");
		  }
		  
		  // Inloggen - submit button
		  driver.findElement(By.name("op")).click();
				  
		  // Verificatie inloggen
		  String a = "Log out";
		  String b = driver.findElement(By.linkText("Log out")).getText();				      
		  
		  if ((a).equals(b)) {
			   System.out.println("Inloggen op CP/T Portal gelukt als " + Rol + " in " + Omgeving + "-omgeving");
		  }
		    
		  else {
			   System.out.println("Inloggen op CP/T Portal mislukt als " + Rol + " in " + Omgeving + "-omgeving");
		  }
		  return driver;
		  //driver.close();
		  		  
		 }
		
//___________________________________________________________________________________________________
	
		
				
		public WebDriver inloggenError(String Omgeving, String Rol, String Browser) {
			
			String InlogUrl = null;
					
			WebDriver driver = AanroepDriver.roepdriver(Browser);
					
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  // Variablen van productie- en acceptatieomgeving
			  if (Omgeving == "ACC") {
			  	   InlogUrl = "http://accept.yourtestprojects.com/";
			  }
			  
			  if (Omgeving == "PRO") {
				  InlogUrl = "http://www.yourtestprojects.com/";
			  }
			  
			  // Url  aan de hand van opgegeven ACC of PRO variable
			  driver.get(InlogUrl);
			  
			  // Maximaal formaat browservenster
			   driver.manage().window().maximize(); 
			  
			  // Variablen van diverse users/rollen
			  
			  if (Rol == "testleader-error") {
				  driver.findElement(By.name("name")).sendKeys("aap");
				  driver.findElement(By.name("pass")).sendKeys("bullcrap");
			  }
			  
			  // Inloggen - submit button
			  driver.findElement(By.name("op")).click();
					  
		
			  return driver;
			  //driver.close();
			  		  
			 }

}


