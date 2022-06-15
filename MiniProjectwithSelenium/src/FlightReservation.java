

		import org.openqa.selenium.WebDriver;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		public class FlightReservation {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
				
			     ChromeDriver driver=new ChromeDriver();
			     driver.get("http://blazedemo.com");
			     
			     String titlename=driver.getTitle();
			     System.out.println("The title of this webpage is "+titlename);
			     
			     List<WebElement> number=driver.findElements(By.tagName("a"));
			     int a=number.size();
			     System.out.println("The number of links are "+a);
			     for(int i=0;i<a;i++) {
			    	 WebElement z=number.get(i);
			    	 String c=z.getText();
			    	 System.out.println("The text of the link is "+c);
			    	 
			     }
			   WebElement ddown1=  driver.findElement(By.name("fromPort"));
			     Select select =new Select(ddown1);
			     select.selectByVisibleText("Boston");
			     WebElement ddown2=  driver.findElement(By.name("toPort"));
			     Select select1 =new Select(ddown2);
			     select1.selectByVisibleText("New York");
			driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
			driver.findElement(By.xpath("//input[@value='Choose This Flight']")).click();
			
			driver.findElement(By.name("inputName")).sendKeys("Tushar joshi");
			driver.findElement(By.name("address")).sendKeys("Balapur");
			driver.findElement(By.name("city")).sendKeys("Hyderabad");
			driver.findElement(By.name("state")).sendKeys("Telangana");
			driver.findElement(By.name("zipCode")).sendKeys("500097");
			driver.findElement(By.name("inputName")).sendKeys("Tushar joshi");
			 
			 WebElement ddown3=  driver.findElement(By.name("cardType"));
		     Select select2 =new Select(ddown3);
		     select2.selectByVisibleText("Diner's Club");
		     
		     
		     driver.findElement(By.name("creditCardNumber")).sendKeys("9998887776");
		     driver.findElement(By.name("creditCardMonth")).sendKeys("3");
		     driver.findElement(By.name("creditCardYear")).sendKeys("2022");
		     driver.findElement(By.name("nameOnCard")).sendKeys("Tushar Dhananjay Joshi");
		      driver.findElement(By.id("rememberMe")).click();
		      driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		    
			   	 
			     }


	}
