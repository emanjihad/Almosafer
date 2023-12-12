package almosafer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTestCaseNew {
	
	
	
	Random  rand = new Random();

	String [] ArbicCity = {"جدة","الرياض"};
	String [] EngCity = {"DUBAI","RIYAD","AMMAN"};
	int randomIndexA = rand.nextInt(ArbicCity.length);
	int randomIndexE = rand.nextInt(EngCity.length);
	
	

	String NewWebSitre = "https://www.almosafer.com/en";

	WebDriver driver = new ChromeDriver();
	SoftAssert SoftAssert = new SoftAssert();
	
	

	
	
	@BeforeTest()
	public void MyBeforeTest () {
	driver.manage().window().maximize();
	
		driver.get(NewWebSitre);
		
		
	}
	
	@Test(enabled=false)
	public void  CheckLanguage() {
		String ActualLang = driver.findElement(By.tagName("html")).getAttribute("lang");
		String ExpectLang = "en";
		AssertJUnit.assertEquals(ActualLang, ExpectLang, "this to check language");
		
		
		
		
	}

	@Test(enabled=false)
	public void  CheckCurren() {
		WebElement Currence =driver.findElement(By.cssSelector(".sc-dRFtgE.fPnvOO"));
		
		
		String ActuaCurr = Currence.getText();
		
	System.out.println(ActuaCurr);
		
		String ExpeCurr = "SAR";
		AssertJUnit.assertEquals(ActuaCurr, ExpeCurr, "this to check CURRENCY");
		
		
		
		
		
	}
	@Test(enabled=false)
	public void  CheckCContactNumber() {
		WebElement ContactNum =driver.findElement(By.cssSelector(".sc-hUfwpO.bWcsTG"));
		
		
		String ActuaContsct = ContactNum.getText();
		
	System.out.println(ActuaContsct);
		
		String ExpeCurr = "+966554400000";
		AssertJUnit.assertEquals(ActuaContsct, ExpeCurr, "this to check contactnumber");
		
		
		
		
		
	}
	
	@Test(enabled=false)
	public void  Qitaf() {
		WebElement Qitaf =driver.findElement(By.cssSelector("#__next > footer > div.sc-eEieub.cvLnoZ > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > div.sc-dznXNo.iZejAw > svg"));
		
		boolean ActuaQitaf = Qitaf.equals(Qitaf);
			
	System.out.println(ActuaQitaf);
		
		//String ExpeQitaf = "true";
		AssertJUnit.assertEquals(ActuaQitaf, true);
		
		
		
		
		
	}
	
	@Test(enabled=false)
	public void  HotalTap() {
		WebElement HotelTap = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		String ActualHotelTap = HotelTap.getAttribute("aria-selected");
		String ExpectedHotelTap = "false";
		
		AssertJUnit.assertEquals(ActualHotelTap, ExpectedHotelTap);
		
		
		
	
	}
	
	@Test(enabled=false)
	public void CheckTheDepartureAndArrivalDate() {
		
		LocalDate today=LocalDate.now();
	//System.out.println(today.plusDays(25));
	
	int ExpectedDepartureDate= today.plusDays(1).getDayOfMonth();
	int ExpectedArriveDate = today.plusDays(2).getDayOfMonth();
	
	System.out.println(ExpectedDepartureDate);
	//System.out.println(ExpectedArriveDate);
	
	
	WebElement ActualDepDate = driver.findElement(By.className("hNjEjT"));
	WebElement ActualArriveDate = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"));
	
	String actDep = ActualDepDate.getText();
	int ActDep = Integer.parseInt(actDep);
	
	
	
	String actArriver = ActualArriveDate.getText();
	int ActArriver = Integer.parseInt(actArriver);
	System.out.println(ActDep);
	//System.out.println(ActArriver);
	
	AssertJUnit.assertEquals(ActArriver, ExpectedArriveDate);
	
	AssertJUnit.assertEquals(ActDep, ExpectedDepartureDate);
	
	//	String DayOfMonthDep=today.plusDays(1).getDayOfWeek().toString().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		//String DayOfMonthArrive=today.plusDays(2).getDayOfWeek().toString();
	
	
		//System.out.println(DayOfMonthArrive);
		//String ExpectDeptuDay= DayOfMonthDep.toLowerCase(null);
		//String ExpecTArriveDay= DayOfMonthArrive;
		
		//day for departure and arrive
	 LocalDate currentDate = LocalDate.now();
        
        
        
       DayOfWeek DayOfMonthDep = currentDate.getDayOfWeek().plus(1);

         //Print the day of the week in the format "Sunday"
        String ExpectDeptuDay = DayOfMonthDep.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
       // System.out.println(ExpectDeptuDay);
        
        	DayOfWeek DayOfMonthArrive = currentDate.getDayOfWeek().plus(2);
		
        String ExpecTArriveDay = DayOfMonthArrive.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(ExpecTArriveDay);
        
        
        WebElement ActualDepartual = driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-lnrBVv gKbptE'] span[class='sc-eSePXt ljMnJa']"));
        
        String ActualDeptValue = ActualDepartual.getText();
        //System.out.println(ActualDeptValue);
        AssertJUnit.assertEquals(ActualDeptValue,ExpectDeptuDay);
        
        
        

        WebElement ActualArrive = driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-bYnzgO bojUIa'] span[class='sc-eSePXt ljMnJa']"));
        
        String ActualArriveValue = ActualDepartual.getText();
        System.out.println(ActualArriveValue);
        
        AssertJUnit.assertEquals(ActualArriveValue,ExpecTArriveDay);
        
        
        
        
        
        
	}
	
	@Test(invocationCount= 1)
	public void ChangeLanguageOfWebSite() throws InterruptedException {
		
		String [] MyUrls = {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
		
	
		int randomIndex = rand.nextInt(MyUrls.length);
		
		driver.get(MyUrls[randomIndex]);
		
		
		WebElement hotelTab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		hotelTab.click();
		
		
		Thread.sleep(2000);
		
		String actualUrl = driver.findElement(By.tagName("html")).getAttribute("lang");
		
		WebElement City =driver.findElement(By.className("phbroq-2"));
		
		
		if (driver.getCurrentUrl().contains("ar")){
			
			
			
			Assert.assertEquals(actualUrl, "ar");
			City.sendKeys(ArbicCity[randomIndexA]);
			
			Thread.sleep(2000);
			WebElement cityList = driver.findElement(By.className("phbroq-4"));
			
			List<WebElement> city =cityList.findElements(By.tagName("li"));
			city.get(3).click();
WebElement selectAge = driver.findElement(By.className("tln3e3-1"));
			
			Select select = new Select(selectAge);
			select.selectByIndex(1);
			
		}
		else 
		{
			
			
			Assert.assertEquals(actualUrl, "en");
			City.sendKeys(EngCity[randomIndexE]);
			Thread.sleep(2000);
			WebElement cityList = driver.findElement(By.className("phbroq-4"));
			
			List<WebElement> city = cityList.findElements(By.tagName("li"));
			city.get(2).click();
			WebElement selectAge = driver.findElement(By.className("tln3e3-1"));
			
			Select select = new Select(selectAge);
			select.selectByIndex(1);
			
			
			
			
		}
		//WebElement hotelTab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		//hotelTab.click();
		
		
	//
	
	}
	
	
	@AfterTest()
	public void MyAfter() {
		
		
		
		SoftAssert.assertAll();
		
		
		
	}
	
	
	
	
	

}


