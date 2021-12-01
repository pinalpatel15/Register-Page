package RegisterPageHomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("gender-female")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("FirstName")).sendKeys("Pinal");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Thread.sleep(2000);

        Select select = new Select(day);
        select.selectByVisibleText("7");

        Select select1 = new Select(month);
        select1.selectByVisibleText("May");

        Select select2 = new Select(year);
        select2.selectByVisibleText("2017");

        driver.findElement(By.id("Email")).sendKeys("pinal.patel11@yahoo.com");

        Thread.sleep(2000);
        driver.findElement(By.id("Company")).sendKeys("Unify");

        driver.findElement(By.name("Newsletter")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Swaminarayan1!");
        Thread.sleep(2000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Swaminarayan1!");

        driver.findElement(By.id("register-button")).click();
        Thread.sleep(2000);

        driver.close();



    }
}
