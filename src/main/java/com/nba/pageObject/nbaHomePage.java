package com.nba.pageObject;

import com.nba.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class nbaHomePage extends BasePage {

@FindBy(id ="nbaMenuButton") WebElement signInBtn;
@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[1]/nav[1]/a[1]/img[1]") WebElement nbaLogo;

    public nbaHomePage(WebDriver driver) {
        super(driver);
    }

    public Boolean NBALogoVisibility(){
        return nbaLogo.isDisplayed();
    }
    public signInMenu clickOnSignInBtn(){
      signInBtn.click();
     return new signInMenu(driver);
    }




}
