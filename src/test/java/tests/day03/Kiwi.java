package tests.day03;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Kiwi {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();

    KiwiPage page = new KiwiPage();

    @Test
    public void test01() throws InterruptedException {

        // uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled(ConfigReader.getProperty("kiwiAppPackage")));


        // uygulamanin basariyla acildigi dogrulanir
        Thread.sleep(100);
        Assert.assertTrue(page.continueAsAGuestButton.isDisplayed());


        // misafir olarak devam et e tiklanir
        page.continueAsAGuestButton.click();


        // ardindan gelecek olan 3 adimda da yesil butona basilarak devam edilir
        for (int i = 0; i < 3; i++) {
            ReusableMethods.koordinatTiklamaMethodu(550, 2060, 300);
        }


        // Trip type,one way olarak secilir
        //page.returnButton.click();
        //page.oneWayButton.click();
        // eger app'de trip type one way secili gelmezse bu sekilde degistirebiliriz


        // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
        page.fromButton.click();
        page.clearAll.click();
        page.fromToTextBox.click();


        // kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
        if (driver.isKeyboardShown()) {
            driver.getKeyboard().pressKey("Ankara");
        } else {
            page.fromToTextBox.sendKeys("Ankara");
        }
        page.addDepartureAirportButton.click();
        Thread.sleep(200);
        page.chooseButton.click();


        // varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
        page.toButton.click();
        page.fromToTextBox.click();

        if (driver.isKeyboardShown()) {
            driver.getKeyboard().pressKey("Bodrum");
        } else {
            page.fromToTextBox.sendKeys("Bodrum");
        }
        page.addArrivalAirportButton.click();
        Thread.sleep(100);
        page.chooseButton.click();


        // gidis tarihi 1 Temmuz olarak secilir ve set date e tiklanir
        page.departure.click();

        Thread.sleep(4000);
        TouchAction touchAction = new TouchAction<>(driver);
        touchAction.press(PointOption.point(500, 1300))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .moveTo(PointOption.point(500, 409))
                .release()
                .perform();

        ReusableMethods.koordinatTiklamaMethodu(412, 1222, 300);
        page.setDateButton.click();


        // search butonuna tiklanir
        page.searchButton.click();


        // en  ucuz ve aktarmasiz filtrelemeleri yapilir
        page.bestButton.click();
        page.cheapestButton.click();
        page.stopsButton.click();
        page.nonstopButton.click();


        // ilk sirada gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir
        String price = page.price.getText();
        driver.sendSMS("05555555", "Secilen ucusun fiyat bilgisi " + price);


    }
}
