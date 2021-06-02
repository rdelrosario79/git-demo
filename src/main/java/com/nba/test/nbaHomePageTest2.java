package com.nba.test;

import com.nba.base.BaseTest;
import com.nba.pageObject.nbaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaHomePageTest2 extends BaseTest {

    @Test
    public void homePageTests(){
        nbaHomePage nbaPage = new nbaHomePage(getDriver());

        Assert.assertTrue(nbaPage
                .clickOnSignInBtn()
                .clickOnSignInToNBAAccount()
                .setUserAndPassword("nbaqa23@gmail.com", "Basketball1")
                .NBALogoVisibility());

    }

    @Test
    public void Test2(){

    }
}
