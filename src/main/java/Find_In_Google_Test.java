import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Find_In_Google_Test {
        WebDriver driver;

        @Test
        public void googleTest(){
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://google.com.ua");
            WebElement searchField = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
            searchField.sendKeys("Selenide");
            searchField.submit();
            WebElement secondSearchField = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div/div[1]/input"));
            secondSearchField.clear();
            secondSearchField.sendKeys("Selenium");
            secondSearchField.submit();
            List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/div/div/div[1]/a/h3"));
            searchResults.get(0).click();
            String resultURL = driver.getCurrentUrl();
            System.out.println("URL:"+resultURL);


        }

    }
