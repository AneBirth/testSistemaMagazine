import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(Lifecycle.PER_CLASS)
public class Testes {

    WebDriver webdriver;

    @BeforeAll
    public void setupAll(){
        System.setProperty("webdriver.chrome.driver",
                "src/test/recursos/chromedriver.exe");
    }

    @BeforeEach
    public void setup(){
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
    }

    @AfterEach
    public void closeDriver(){
        webdriver.close();
    }

    @Test
        public void abrirPaginaTest (){


            WebDriver webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();

            webDriver.get("https://www.magazineluiza.com.br/");
            assertEquals("https://www.magazineluiza.com.br/",
                    webDriver.getCurrentUrl());
            WebElement textBox= webDriver.findElement(By.id("input-search"));
            textBox.sendKeys("geladeira");



    }
    @Test
    public void pesquisaTest () {


        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.magazineluiza.com.br/");
        assertEquals("https://www.magazineluiza.com.br/",
                webDriver.getCurrentUrl());
        webDriver.findElement(By.xpath("//*[@id=\"input-search\"]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"input-search\"]")).sendKeys("casaco");


    }

    }

