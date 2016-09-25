package com.sugat.twitter.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sugat.twitter.config.Configuration;

public class twitLoginPage {
	
	
	public WebDriver driver;
	
	public twitLoginPage(WebDriver driver) throws IOException{
		this.driver = driver;
			
	}
	
	
	@FindBy(xpath=Configuration.initial_login_link)
	public WebElement initial_login_link;	
	
	@FindBy(xpath=Configuration.username)
	public WebElement username;
		
	@FindBy(xpath=Configuration.password)
	public WebElement password;
	
	@FindBy(xpath=Configuration.login_link)
	public WebElement login_link;
	
	//login to twitter
	public twitLandingPage doLogin(String UserName,String Password){
		initial_login_link.click();
		username.sendKeys(UserName);
		password.sendKeys(Password);
		login_link.click();
		return PageFactory.initElements(driver, twitLandingPage.class);
	}

}
