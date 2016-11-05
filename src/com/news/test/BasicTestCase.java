package com.news.test;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.news.test.pages.PagesManager;

public class BasicTestCase extends UiAutomatorTestCase{
	
	protected PagesManager pm = null;
	
	String packageName = "com.netease.newsreader.activity";
	String activityName = "com.netease.nr.biz.ad.AdActivity";
	protected void setUp(boolean isNeedLogin) throws Exception {
		
		super.setUp();
		
		Runtime.getRuntime().exec("am start -n " + packageName + "/" + activityName);
		pm = new PagesManager();
		Thread.sleep(3000);
		if(isNeedLogin){
				pm.getPageNavigation().goToMySettingTab();
				pm.getPageMy().clickLoginImageView();
				pm.getPageLogin().login("17190446320", "wendyzz");
			
		}
	}
}
