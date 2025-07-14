package tests.day04;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllCurrencyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;

public class AllCurrencyConventer {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();

    AllCurrencyPage allCurrencyPage = new AllCurrencyPage();

    @Test
    public void test01() throws InterruptedException, IOException {

        // all currency uygulamasinin yuklendigi dogulanir
        Assert.assertTrue(driver.isAppInstalled(ConfigReader.getProperty("allCurrencyPackage")));


        Thread.sleep(100);
        // uygulamanin acildigi dogrulanir
        Assert.assertTrue(allCurrencyPage.currencyConventerTitle.isDisplayed());


        // cevirmek istedigimiz para birimi Türk Lirasi olarak secilir
        Thread.sleep(100);
        allCurrencyPage.firstCurrency.click();
        ReusableMethods.scrollWithUiScrollableAndClick("Turkish Lira");


        // cevrilecek tutar tuslanir
        allCurrencyPage.one.click();
        allCurrencyPage.zeroZeroZero.click();

        // cevirelecek olan para birimi Euro olarak secilir
        allCurrencyPage.secondCurrency.click();
        ReusableMethods.scrollWithUiScrollableAndClick("Euro");


        // cevrilen tutar screenShot olarak kaydedilir
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("screenhot.png"));


        // Ardindan Türk lirasinin Euro karsiligi olan degeri kaydedilir
        String result = allCurrencyPage.result.getText();

        // kullaniciya sms olarak bildirilir
        driver.sendSMS("05555555555","1000 Turkish Lira = " + result + "Euro");
    }
}
