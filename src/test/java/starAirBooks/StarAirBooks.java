package starAirBooks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import commoDataSetup.CommonDataSetUp;

public class StarAirBooks extends CommonDataSetUp {

    @Test(priority = 1)
    public void toLaunch() {
        driver.get("https://starair.in/Customer/GstInvoice");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void toCustomTaxInvoice() throws InterruptedException, AWTException {
        String homePage = driver.getWindowHandle();
        

        WebElement pnrNo = driver.findElement(By.xpath("//input[@name='Book_code']"));
        pnrNo.sendKeys("HEMSUU");

        WebElement registrationNo = driver.findElement(By.xpath("//input[@name='CustGSTIN']"));
        registrationNo.sendKeys("33AAACH2364M1ZM");

        WebElement search = driver.findElement(By.xpath("(//input[@name='action'])[1]"));
        search.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

        // Click the first print button
        WebElement print1 = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(print1).click().perform();

        Thread.sleep(2000);

        toAutomatePrint("starAirlineOne.pdf"); // First call with default file name

        // Switch back to the main window
        driver.switchTo().window(homePage);

        // Click the second print button
        WebElement print2 = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]"));
        action.moveToElement(print2).click().perform();

        Thread.sleep(2000);

        toAutomatePrint("starAirlineTwo.pdf"); // Second call with custom file name
        
    }

    public static void toAutomatePrint(String fileName) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);

        StringSelection filePath = new StringSelection("C:\\Users\\Omkar G\\Downloads\\" + fileName);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);
    }
   
}
