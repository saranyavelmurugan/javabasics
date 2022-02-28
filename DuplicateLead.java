package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
         driver.manage().window().maximize();
         //Thread.sleep(4000);
         //driver.close();
         driver.findElement(By.id("username")).sendKeys("demoSalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         String Title=driver.getTitle();
         System.out.println(Title);
         driver.findElement(By.linkText("Create Lead")).click();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("bny");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");

         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("velmurugan");
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("saran");
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
     driver.findElement(By.linkText("Duplicate Lead")).click();
     WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
     companyName.clear();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("dell");
     WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
         firstName.clear();
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
         driver.findElement(By.className("smallSubmit")).click();
         String  Title3=driver.getTitle();
         System.out.println(Title3);
}
}