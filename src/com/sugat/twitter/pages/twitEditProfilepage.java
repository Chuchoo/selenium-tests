package com.sugat.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.sugat.twitter.config.Configuration;

public class twitEditProfilepage {

	
	public WebDriver driver;
	
	public twitEditProfilepage(WebDriver driver){
		this.driver=driver;		
	}
	
	
	@FindBy(xpath=Configuration.profilePic)
	public WebElement profilePic;
	
	@FindBy(xpath=Configuration.uploadPhoto)
	public WebElement uploadPhoto;
	
	@FindBy(xpath=Configuration.cancelUploadPhoto)
	public WebElement cancelUploadPhoto;
	
	@FindBy(xpath=Configuration.cancelEditProfilePage)
	public WebElement cancelEditProfilePage;
		
	@FindBy(xpath=Configuration.title)
	public WebElement title;
		
	
	public void addProfilePic(){
		profilePic.click();
		uploadPhoto.sendKeys("C:\\Users\\sxs4439\\Desktop\\shiva.jpg");
		cancelUploadPhoto.click();
		try {
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(cancelEditProfilePage).click().perform();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	
	public void changeTitle(){
		title.clear();
		title.sendKeys("Chuchoo");
		
	}
		
	
}
