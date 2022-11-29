import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_tests {

    @BeforeAll
    public static void setupClass(){
        System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");
    }



    @Test
    public void test_one(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl/");
        driver.quit();
    }
}
