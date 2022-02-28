	package week2.day1;

	import java.sql.DriverPropertyInfo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateLeadClass {

public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/main");
	         driver.manage().window().maximize();
	         driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	         driver.findElement(By.className("decorativeSubmit")).click();
	        
	        driver.findElement(By.linkText("CRM/SFA")).click();
	         driver.findElement(By.linkText("Leads")).click();
	         String Title=driver.getTitle();
	         System.out.println(Title);
	         driver.findElement(By.linkText("Create Lead")).click();
	         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("dell");
	         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");

	         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("velmurugan");
	         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("saranya");
	         WebElement sourceid = driver.findElement(By.id("createLeadForm_dataSourceId"));
	         Select source=new Select(sourceid);
	         source.selectByIndex(4);
	         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("eee");
	         driver.findElement(By.id("createLeadForm_description")).sendKeys("testleaf");
	         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranneyveli@gmail.com");
	         WebElement stateId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	         Select state=new Select(stateId);
	         state.selectByVisibleText("New York");
	         driver.findElement(By.className("smallSubmit")).click();
	         String Title1=driver.getTitle();
	        System.out.println(Title1);
	         
	         		       
	         
	         
	       
	         

	}
	}

