package org.pfa.qa.android.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AllInOne {

    public static AppiumDriverLocalService appService;
    public static AndroidDriver driver;

    @BeforeClass
    public void config() throws MalformedURLException {
        appService = new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\jignesh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        appService.start();
        UiAutomator2Options uiOptions = new UiAutomator2Options();
        uiOptions.setDeviceName("JigneshEmulator");  //emulator
        uiOptions.setApp(System.getProperty("user.dir") + "\\src\\main\\java\\org\\pfa\\qa\\android\\resources\\pfa_05012023.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("App Added in Emulator and Started");

    }


    @Test
    public void PFATest() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.id("com.prospectsforagents:id/edtUsername")).sendKeys("rosahaddad@allstate.com");
        Thread.sleep(1000);
        driver.findElement(By.id("com.prospectsforagents:id/edtPassword")).sendKeys("Haddadinss");
        Thread.sleep(1000);
        driver.findElement(By.id("com.prospectsforagents:id/btnLogin")).click();
        Thread.sleep(5000);

//      Login in successfully


//        driver.findElement(By.xpath("//android.widget.TextView[@text='My Leads']")).click();
        WebElement leads = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.prospectsforagents:id/leads']"));
        leads.click();

        Thread.sleep(1000);

        WebElement history = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.prospectsforagents:id/history']"));
        history.click();

        Thread.sleep(1000);

        WebElement profile = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.prospectsforagents:id/profile']"));
        profile.click();

        Thread.sleep(1000);

        WebElement dashboard = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.prospectsforagents:id/dashboard']"));
        dashboard.click();

//        Thread.sleep(1000);
//        history.click();
//
//        Thread.sleep(1000);
//        WebElement historyFunds = driver.findElement(By.id("com.prospectsforagents:id/txtFunds"));
//        historyFunds.click();
//
//
//        Thread.sleep(5000);
////        WebElement historyFundsSelectQuantity = driver.findElement(By.id("lead_qty_20"));
//        WebElement historyFundsSelectQuantity = driver.findElement(By.xpath("//android.view.View[@text='Select Quantity']"));
////        WebElement historyFundsSelectQuantity = driver.findElement(By.xpath("//android.widget.Spinner[@id='lead_qty_20']"));
//        historyFundsSelectQuantity.click();
////        driver.findElement(By.id("lead_qty_20")).click();
//
//        Thread.sleep(1500);
//        WebElement quantitySelect100 = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='180']"));
//        quantitySelect100.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsNextButton = driver.findElement(By.xpath("//android.widget.Button[@text='NEXT']"));
//        historyFundsNextButton.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardNumber = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='card-number']"));
//        historyFundsCardNumber.sendKeys("4111111111111111");
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardAddress = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='billing_address']"));
//        historyFundsCardAddress.sendKeys("Malad");
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardHolderName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='card_holder_name']"));
//        historyFundsCardHolderName.sendKeys("Jignesh Wala");
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardBillingCity = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='billing_city']"));
//        historyFundsCardBillingCity.sendKeys("Mumbai");
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardExpireYear = driver.findElement(By.xpath("//android.view.View[@resource-id='exp_year']"));
//        historyFundsCardExpireYear.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardExpireYearSelect = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='2025']"));
//        historyFundsCardExpireYearSelect.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardExpireMonth = driver.findElement(By.xpath("//android.view.View[@resource-id='exp_month']"));
//        historyFundsCardExpireMonth.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardExpireMonthSelect = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='05']"));
//        historyFundsCardExpireMonthSelect.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardBillingState = driver.findElement(By.xpath("//android.view.View[@resource-id='billing_state']"));
//        historyFundsCardBillingState.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardBillingStateSelect = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='California']"));
//        historyFundsCardBillingStateSelect.click();
//
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardCVC = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='cvc']"));
//        historyFundsCardCVC.sendKeys("123");
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardZipCode = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='billing_zip']"));
//        historyFundsCardZipCode.sendKeys("WSE521");
//        driver.hideKeyboard();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardTermCheckbox = driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='chkdisc']"));
//        historyFundsCardTermCheckbox.click();
//
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardPayBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id='payBtn']"));
//        historyFundsCardPayBtn.click();
//
//        Thread.sleep(1500);
//        WebElement historyFundsCardConfirmPayBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']"));
//        historyFundsCardConfirmPayBtn.click();
//
//        Thread.sleep(15000);

        Thread.sleep(1000);
        profile.click();
        Thread.sleep(5000);

        // Profile ChangePassword Page

        WebElement profileChangePassword = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.prospectsforagents:id/txtChangePassword']"));
        Thread.sleep(1000);
        profileChangePassword.click();

        WebElement profileChangePasswordEnterOldPassword = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.prospectsforagents:id/edtOldPassword']"));
        Thread.sleep(1000);
        profileChangePasswordEnterOldPassword.sendKeys("Haddadinss");

        WebElement profileChangePasswordEnterNewPassword = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.prospectsforagents:id/edtNewPassword']"));
        Thread.sleep(1000);
        profileChangePasswordEnterNewPassword.sendKeys("Haddadinss");


        WebElement profileChangePasswordEnterNewConfirmPassword = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.prospectsforagents:id/edtConfirmPassword']"));
        Thread.sleep(1000);
        profileChangePasswordEnterNewConfirmPassword.sendKeys("Haddadinss");

        WebElement profileChangePasswordPageBackBtn = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.prospectsforagents:id/imgBack']"));
        Thread.sleep(1500);
        profileChangePasswordPageBackBtn.click();




        // Profile  Sub Buyers Page

        WebElement profileSubBuyers = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.prospectsforagents:id/txtSubBuyer']"));
        Thread.sleep(3000);
        profileSubBuyers.click();

        WebElement profileSubBuyersLifePostBuyers = driver.findElement(By.xpath("//android.widget.TextView[@text='Life Post - Rosa Haddad']"));
        Thread.sleep(1500);
        profileSubBuyersLifePostBuyers.click();



//        WebElement profileSubBuyersHomePostBuyers = driver.findElement(By.xpath("//android.widget.TextView[@text='Home Post - Rosa Haddad']"));
//
//        WebElement profileSubBuyersTransferAutoBuyers = driver.findElement(By.xpath("//android.widget.TextView[@text='Transfer Auto - Rosa Haddad']"));


        // Profile Logout Page

        Thread.sleep(5000);
        WebElement profile1 = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.prospectsforagents:id/profile']"));
        profile1.click();
        Thread.sleep(1000);
        WebElement profileLogout = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.prospectsforagents:id/txtllLogout']"));
        Thread.sleep(1000);
        profileLogout.click();

        WebElement profileLogoutPopupNoBtn = driver.findElement(By.id("android:id/button2"));
        Thread.sleep(1000);
        profileLogoutPopupNoBtn.click();


        Thread.sleep(1000);
        profileLogout.click();
        Thread.sleep(1000);

        WebElement profileLogoutPopupYesBtn = driver.findElement(By.id("android:id/button1"));
        profileLogoutPopupYesBtn.click();
        Thread.sleep(15000);













    }


}
