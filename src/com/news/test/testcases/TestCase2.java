package com.news.test.testcases;

import com.news.test.BasicTestCase;

public class TestCase2 extends BasicTestCase{
	
	String packageName = "com.tencent.mobileqq";
	String activityName = "com.tencent.mobileqq.activity.SplashActivity";
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp(false);
		Runtime.getRuntime().exec("am start com.tencent.mobileqq/com.tencent.mobileqq.activity.SplashActivity");
	}
	
	public void testTestCase2(){
		pm.getPageNavigation().goToNewsTab();
		pm.getPageNews().clickNewsTitleByClassName(4);
		pm.getPageNewsDetail().clickShareButton();
		pm.getPageCommon().clickByText("QQ好友");
		pm.getPageQQLoginType().clickNewUserBtn();
		assertEquals("验证手机号码", pm.getPageQQRegister().getTitleText());
	}

}
