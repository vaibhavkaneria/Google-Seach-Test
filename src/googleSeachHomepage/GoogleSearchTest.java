package googleSeachHomepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	static int counter = 1;
	static List<File> screenShotList = new ArrayList<File>();
	static List<String> colorList = new ArrayList<String>();
	static List<String> testStepNameList = new ArrayList<String>();
	static String reportPath;
	static final String GREEN = "00FF00";
	static final String RED = "FF0000";
	static final String USERDIRECTORY = System.getProperty("user.dir");

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",USERDIRECTORY + File.separator + "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String actualResult,expectedResult;
		createFolders();
		if (driver.findElement(By.xpath("//*[@id=\'gb\']/div/div[1]/div/div[1]/a")).isDisplayed())
			actualResult = "Gmail Link is present";
		else
			actualResult = "Gmail Link is not present";
		expectedResult = "Gmail Link is present";
		takeScreenShot(driver,actualResult,expectedResult);
		
		if (driver.findElement(By.xpath("//*[@id=\'gb\']/div/div[1]/div/div[2]/a")).isDisplayed())
			actualResult = "Images Link is present";
		else
			actualResult = "Images Link is not present";
		expectedResult = "Images Link is present";
		takeScreenShot(driver,actualResult,expectedResult);
		
		if (driver.findElement(By.xpath("//*[@id=\'gbwa\']/div/a")).isDisplayed())
			actualResult = "Hamburger Menu is present";
		else
			actualResult = "Hamburger Menu is not present";
		expectedResult = "Hamburger Menu is present";
		takeScreenShot(driver,actualResult,expectedResult);
		
		if (driver.findElement(By.xpath("//*[@id=\'gb\']/div/div[2]/a")).isDisplayed())
			actualResult = "SignIn Button is present";
		else
			actualResult = "SignIn Button is not present";
		expectedResult = "SignIn Button is present";
		takeScreenShot(driver,actualResult,expectedResult);
		
		if (driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed())
			actualResult = "Google logo is present";
		else
			actualResult = "Google logo is not present";
		expectedResult = "Google logo is present";
		takeScreenShot(driver,actualResult,expectedResult);
		
		if (driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).isDisplayed())
			actualResult = "Input Search textbox is present";
		else
			actualResult = "Input Search textbox is not present";
		expectedResult = "Input Search textbox is present";
		takeScreenShot(driver,actualResult,expectedResult);
		
		if (driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).isDisplayed())
			actualResult = "Google Search button is present";
		else
			actualResult = "Google Search button is not present";
		expectedResult = "Google Search button is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]")).isDisplayed())
			actualResult = "I'm feeling lucky button is present";
		else
			actualResult = "I'm feeling lucky button is not present";
		expectedResult = "I'm feeling lucky button is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("//*[@id='SIvCob']")).isDisplayed())
			actualResult = "Google Offered In text is present";
		else
			actualResult = "Google Offered In text is not present";
		expectedResult = "Google Offered In text is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]")).isDisplayed())
			actualResult = "India text is present";
		else
			actualResult = "India text is not present";
		expectedResult = "India text is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[1]")).isDisplayed())
			actualResult = "About link is present";
		else
			actualResult = "About link is not present";
		expectedResult = "About link is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[2]")).isDisplayed())
			actualResult = "Advertising link is present";
		else
			actualResult = "Advertising link is not present";
		expectedResult = "Advertising link is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[3]")).isDisplayed())
			actualResult = "Business link is present";
		else
			actualResult = "Business link is not present";
		expectedResult = "Business link is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[4]")).isDisplayed())
			actualResult = "How Search Works link is present";
		else
			actualResult = "How Search Works link is not present";
		expectedResult = "How Search Works link is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[1]")).isDisplayed())
			actualResult = "Privacy link is present";
		else
			actualResult = "Privacy link is not present";
		expectedResult = "Privacy link is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[2]")).isDisplayed())
			actualResult = "Terms link is present";
		else
			actualResult = "Terms link is not present";
		expectedResult = "Terms link is present";
		takeScreenShot(driver,actualResult,expectedResult);

		if (driver.findElement(By.xpath("//*[@id=\'Mses6b\']")).isDisplayed())
			actualResult = "Settings link is present";
		else
			actualResult = "Settings link is not present";
		expectedResult = "Settings link is present";
		takeScreenShot(driver,actualResult,expectedResult);

		WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchBox.sendKeys("Hello");
		searchBox.sendKeys(Keys.RETURN);
		
		if (driver.findElement(By.xpath("//*[@id=\'hdtb-msb\']/div[1]/div/div[1]")).isDisplayed())
			actualResult = "Search results are displayed";
		else
			actualResult = "Search results are not displayed";
		expectedResult = "Search results are displayed";
		takeScreenShot(driver,actualResult,expectedResult);
		driver.close();
		generateReport();
	}
	
	public static void takeScreenShot(WebDriver driver, String actualResult, String expectedResult) throws Exception
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
	    File destFile=new File(reportPath + File.separator + counter++ + ".jpg");
	    FileUtils.copyFile(srcFile, destFile);
	    screenShotList.add(destFile);
	    colorOfTestSteps(actualResult, expectedResult);
	}
	
	public static void colorOfTestSteps(String actualResult, String expectedResult)
	{
		testStepNameList.add(actualResult);
		if (actualResult.equals(expectedResult))
			colorList.add(GREEN);
		else
			colorList.add(RED);
	}
	
	public static void generateReport() throws Exception
	{
		XWPFDocument document = new XWPFDocument();
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		for (int iterator = 0; iterator < colorList.size();iterator++)
		{
			File screenShot = screenShotList.get(iterator);
			run.setColor(colorList.get(iterator));
			run.setText(testStepNameList.get(iterator));
			run.addCarriageReturn();
			run.addCarriageReturn();
			FileInputStream fin = new FileInputStream(screenShot);
			run.addPicture(fin, XWPFDocument.PICTURE_TYPE_JPEG, screenShot.getName(), Units.toEMU(450), Units.toEMU(210));
			run.addCarriageReturn();
			run.addCarriageReturn();
		}
		String status;
		if (colorList.contains(RED))
			status = "Failed";
		else
			status = "Passed";
		FileOutputStream fout = new FileOutputStream(new File(reportPath + File.separator + "Google_Search_Test_" + status + ".docx"));
		document.write(fout);
		fout.close();
		document.close();		
	}
	
	public static void createFolders()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");  
	    Date date = new Date();
        File file = new File(USERDIRECTORY + File.separator + "Results" + File.separator + formatter.format(date) + File.separator);
		if (!file.exists())
			file.mkdirs();
		reportPath = file.getAbsolutePath();
	}

}
