package com.sugat.twitter.config;

public class Configuration {

	
public static final String	testsite="http://twitter.com";

//XPATH for all the page elements

//twitLoginPage
public static final String initial_login_link="//a[@href='/login']";
public static final String username="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input";
public static final String password="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input";
public static final String login_link="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]";


//twitLandingPage
public static final String myprofile="//*[@id='page-container']/div[1]/div[1]/div/div[2]/span/a";
public static final String tweets="//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[1]/a";
public static final String followers="//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[2]/a";
public static final String following="//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[3]/a";


//twitProfilePage
public static final String editMyProfile="//button[@class='UserActions-editButton edit-button btn']";


//twitEditProfilepage
public static final String profilePic="//button[@class='ProfileAvatarEditing-button u-boxShadowInsetUserColorHover']";
public static final String uploadPhoto=".//*[@id='photo-choose-existing']/div/div/label/input";
public static final String cancelUploadPhoto="//*[@id='profile_image_upload_dialog-dialog']/div[2]/div[3]/button[1]";
public static final String cancelEditProfilePage="//*[@id='choose-photo']/div/div/ul/li[5]/button";
public static final String title="//*[@id='user_name']";

}
