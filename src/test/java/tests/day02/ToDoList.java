package tests.day02;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ToDoList {

    AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 148");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability("appPackage","todolist.scheduleplanner.dailyplanner.todo.reminders");
        caps.setCapability("appActivity","app.todolist.activity.SplashActivity");


        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void test01() throws InterruptedException {
        // uygulamanin basarili bir sekilde yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("todolist.scheduleplanner.dailyplanner.todo.reminders"));

        // uygulaminin basarili bir sekilde acildigi dogrulanir
        Assert.assertTrue(driver.findElementByXPath("//*[@text='Welcome to To-do List']").isDisplayed());

        // Ileri butonlarina tiklanir ve pop-up lar kapatilir
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/honor_continue").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@text='CONTINUE']").click();
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/toolbar_back").click();
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_pro_first_close").click();

        // gorev ekleme adimina gecilir
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/iv_task_add").click();

        // gorev adi girilir
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_input").sendKeys("Tiyatroya bilet al");

        // gorev kaydedilir
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_btn").click();

        Thread.sleep(100);
        TouchAction touchAction = new TouchAction<>(driver);
        /*touchAction.press(PointOption.point(879,1159)).release().perform();
        Thread.sleep(1000);
        touchAction.press(PointOption.point(879,1159)).release().perform();
        Thread.sleep(1000);
        touchAction.press(PointOption.point(879,1159)).release().perform();

         */



        for (int i = 0; i <=3 ; i++) {
            Thread.sleep(100);
            touchAction.press(PointOption.point(872,1159)).release().perform();
        }



        // gorev silinir
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_text").click();
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_detail_more").click();
        driver.findElementByXPath("//*[@text='Delete']").click();
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_confirm").click();

        // Gorev olusturma sayfasina geri dönüldügü dogrulanir
        Assert.assertTrue(driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/iv_task_add").isDisplayed());


    }

}
