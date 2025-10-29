import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        WebElement box = driver.findElement(By.name("q"));
        box.sendKeys("Selenium WebDriver");
        box.submit();
        Thread.sleep(2000);
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
