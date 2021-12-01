package RegisterPageHomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPageXpathCssSelector {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

      //  WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.titleContains("nopC"))


       // driver.manage().deleteAllCookies();

        driver.findElement(By.cssSelector("button.search-box-button")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
       String text = alert.getText();
        System.out.println(text);

        alert.accept();

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//label[@for='gender']"));
        Actions gender = new Actions(driver);
        Actions doubleclick = gender.doubleClick(element).doubleClick();
        doubleclick.perform();

        Thread.sleep(4000);

        driver.findElement(By.id("gender-female")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Pinal");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Patel");
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        WebDriverWait wait = new WebDriverWait(driver,30);

        Select select = new Select(day);
        select.selectByVisibleText("7");

        Select select1 = new Select(month);
        select1.selectByVisibleText("May");

        Select select2 = new Select(year);
        select2.selectByVisibleText("2017");

        driver.findElement(By.cssSelector("input[id=Email]")).sendKeys("pinal.patel1@yahoo.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@id,'Company')]")).sendKeys("Unify");
        driver.findElement(By.xpath("//label[@for='Newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='Newsletter']")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id=Password]")).sendKeys("Swaminarayan1!");

        Thread.sleep(2000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Swaminarayan1!");

        driver.findElement(By.id("register-button")).click();
        Thread.sleep(2000);

        driver.close();


    }
}


