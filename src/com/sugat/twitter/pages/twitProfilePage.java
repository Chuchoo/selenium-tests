package com.sugat.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sugat.twitter.config.Configuration;

public class twitProfilePage {
	
	public WebDriver driver;
	
	public twitProfilePage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath=Configuration.editMyProfile)
	public WebElement editMyProfile;
	
	
	public twitEditProfilepage clickEditProfile(){
		editMyProfile.click();
		return PageFactory.initElements(driver, twitEditProfilepage.class);
			
	}
	
	

}
