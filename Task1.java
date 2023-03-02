package class03HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement textBox = driver.findElement(By.xpath("//input[@id='user-message']"));
        textBox.sendKeys("Alex");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        WebElement getTotal = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
        getTotal.click();
        System.out.println(getTotal.getAttribute("type"));
        driver.quit();

    }
}
