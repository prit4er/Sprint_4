import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseUI {
    protected WebDriver webDriver;

    @Before
    public void startUp() { // Метод для запуска браузера и открытия сайта
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @After
    public void tearDown() { // Метод закрытия браузера
        webDriver.quit();
    }
}
