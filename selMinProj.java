package selenium;



		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class selMinProj {
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		        driver.get("https://blazedemo.com/");
		        String pageTitle =driver.getTitle();
		        System.out.println("The page title is "+pageTitle);
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		        driver.findElement(By.id("inputName")).sendKeys("Radharapu Divya");
		        Thread.sleep(1000);
		        driver.findElement(By.id("address")).sendKeys("23-54/456 sainik vihar neredmet ");
		        Thread.sleep(1000);
		        driver.findElement(By.id("city")).sendKeys("Malkajgiri");
		        Thread.sleep(1000);
		        driver.findElement(By.id("state")).sendKeys("telangana");
		        Thread.sleep(1000);
		        driver.findElement(By.id("zipCode")).sendKeys("500056");
		        Thread.sleep(1000);
		         WebElement cardType= driver.findElement(By.className("form-inline"));
		        @SuppressWarnings("unused")
				Select select =new Select(cardType);
		        select.selectByVisibleText("American Express");
		        Thread.sleep(1000);
		        driver.findElement(By.name("creditCardNumber")).sendKeys("1243456789");
		        Thread.sleep(1000);
		        driver.findElement(By.id("creditCardMonth")).clear();
		        driver.findElement(By.id("creditCardMonth")).sendKeys("2");
		        Thread.sleep(1000);
		        driver.findElement(By.id("creditCardYear")).clear();
		        driver.findElement(By.id("creditCardYear")).sendKeys("2022");
		        Thread.sleep(1000);
		        driver.findElement(By.id("nameOnCard")).sendKeys("R.DIVYA");
		        Thread.sleep(1000);
		        driver.findElement(By.id("rememberMe")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
		        Thread.sleep(1000);
		        List<WebElement> b =driver.findElements(By.tagName("a"));
		       int c= b.size();
		       System.out.println("the total number of links are "+c);
		       Thread.sleep(1000);
		       driver.quit();
		       
		        
		        }
			

		}



	}

}
