import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    @Test
    public void navigateToGoogle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Documents\\Proyectos Automatización\\selenium_basic\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        Thread.sleep(3000);

        driver.quit();

    }
}
