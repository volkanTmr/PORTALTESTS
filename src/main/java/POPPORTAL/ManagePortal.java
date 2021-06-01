package POPPORTAL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManagePortal {

    WebDriver driver;


    @BeforeMethod
    public void startPage()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMSUNG\\chrome_web_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://185.99.199.194:8181/portal/#/login");
    }

    @Test
    public void setUp() throws InterruptedException {
        // TODO 1- username ve şifre ile sayfaya gir
        // 2- akıllı binalar personel portalı sayfasında çalışanlar butonu var buna bas
        // 3- hamza uyanık adlı işçinin üzerine gel tıkla mazeret izin bilgilerini gör



        LoginPortal lp=new LoginPortal(driver);
        lp.UserId().sendKeys("gokman");
        lp.PassId().sendKeys("12345678");
        lp.ButtonClick().click();
        Thread.sleep(5000);

        AkıllıBinFirstPage akbin=new AkıllıBinFirstPage(driver);
        akbin.ButtonOfWorkers().click();
        Thread.sleep(5000);

        TargetWorkers tw=new TargetWorkers(driver);
        tw.WorkerHamza().click();
    }

    //@AfterMethod
    //public void endPage() {driver.quit();}

}
