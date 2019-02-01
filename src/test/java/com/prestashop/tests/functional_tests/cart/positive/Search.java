package com.prestashop.tests.functional_tests.cart.positive;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.SignInPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends TestBase {
    @Test
    public void search(){
        pages.homePage.signInButton.click();
        pages.signInPage.signIn("username","password");
        pages.signInPage.search("searchItem1");
        Assert.assertEquals(pages.searchPage.searchResultDisplayed.
                getText().toLowerCase().replace("\"",""),ConfigurationReader.getProperty("searchItem1").toLowerCase());
    }
}
