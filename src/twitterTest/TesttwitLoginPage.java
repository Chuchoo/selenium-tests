package twitterTest;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sugat.twitter.config.Configuration;
import com.sugat.twitter.pages.twitEditProfilepage;
import com.sugat.twitter.pages.twitLandingPage;
import com.sugat.twitter.pages.twitLoginPage;
import com.sugat.twitter.pages.twitProfilePage;


public class TesttwitLoginPage {
	
	public static WebDriver driver;		
	
	/**
	 public static void main(String[] args) throws IOException{		
		driver = new FirefoxDriver();
		driver.get(Configuration.testsite);
		twitLoginPage loginPage = PageFactory.initElements(driver, twitLoginPage.class);		
		twitLandingPage landingPage= loginPage.doLogin("gitkalu@gmail.com", "KalankI007");
		twitProfilePage myProfile = landingPage.gotoProfile();
		twitEditProfilepage editProfilePage = myProfile.clickEditProfile();
		editProfilePage.addProfilePic();
	} 	  
	 */
	@BeforeTest
	public void navigateToSite(){
		driver = new FirefoxDriver();
		driver.get(Configuration.testsite);
		Assert.assertEquals("Twitter. It's what's happening.", driver.getTitle());				
	}
	
	
	@Test(priority=0)
	public void doLogin(){
		twitLoginPage initialLoginpage = PageFactory.initElements(driver, twitLoginPage.class);
		twitLandingPage landingPage = initialLoginpage.doLogin("gitkalu@gmail.com", "KalankI007");
		System.out.println(landingPage.myprofile.getText());		
		Assert.assertEquals("@gitkalu_test", landingPage.myprofile.getText());		
	}	
	
	
}