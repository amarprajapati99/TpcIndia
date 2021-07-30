package com.bridgelabz.selenium.tpcindia.test;

import com.bridgelabz.tpcindia.base.BaseClass;
import com.bridgelabz.tpcindia.pages.LoginPage;
import org.testng.annotations.Test;

public class TpcIndiaTest extends BaseClass{

    @Test
    public void test_tpcIndia() throws InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.setTpcIndia ();

        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.close ();
    }
}
