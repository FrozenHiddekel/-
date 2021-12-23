import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class bigTest {

    public static MainPage discordPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\program\\chromedriver.exe");
        driver = new ChromeDriver();
        discordPage = new MainPage(driver);
        //responsePage = new ResponsePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public static void test1() throws InterruptedException {
        driver.get("https://discord.com/channels/@me");
        Thread.sleep(1000);
        discordPage.Authorization("binjo_spirit@mail.ru", "supperpas");
        Thread.sleep(3000);
        Assert.assertEquals(discordPage.AuthorizationChek(), "Morph");

    }



    @Test
    public static void test2() throws InterruptedException {
        //driver.get("https://discord.com/channels/@me");
        Thread.sleep(1000);
        //discordPage.Authorization("binjo_spirit@mail.ru", "supperpas");
        //Thread.sleep(3000);

        discordPage.sendMessage("Тестовове сообщение");
        Thread.sleep(500);
        Assert.assertEquals(discordPage.getResponse(), "Тестовове сообщение");

    }

    @Test
    public static void test3() throws InterruptedException {
        discordPage.sendSmile();
        Thread.sleep(500);
        Assert.assertEquals(discordPage.SmileChek(), "https://discord.com/assets/08c0a077780263f3df97613e58e71744.svg");
    }



    @Test
    public static void test4() throws InterruptedException {
        discordPage.slashSand("pog");
        Thread.sleep(500);
        Assert.assertEquals(discordPage.GifChek(), "container-1ov-mD");
    }

    @Test
    public static void test5() throws InterruptedException {
        discordPage.tableflip();
        Thread.sleep(1000);
        Assert.assertEquals(discordPage.tableflipChek(), "markup-2BOw-j messageContent-2qWWxC");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
