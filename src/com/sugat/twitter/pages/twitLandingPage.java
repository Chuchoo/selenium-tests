package com.sugat.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sugat.twitter.config.Configuration;

public class twitLandingPage {

	public WebDriver driver;
	
	public twitLandingPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath=Configuration.myprofile)
	public WebElement myprofile;
	
	@FindBy(xpath=Configuration.tweets)
	public WebElement tweets;
	
	@FindBy(xpath=Configuration.following)
	public WebElement following;
	
	@FindBy(xpath=Configuration.followers)
	public WebElement followers;
	
	
	public twitProfilePage gotoProfile(){
		myprofile.click();
		return PageFactory.initElements(driver, twitProfilePage.class);
	}
	
	public void gotoTweets(){
		tweets.click();
	}
	
	public void gotoFollowing(){
		following.click();
	}
		
	public void gotoFollowers(){
		followers.click();
	}
		
}



