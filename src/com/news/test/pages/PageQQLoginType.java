package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageQQLoginType {
	
	public UiObject getDirectLoginBtn(){
		return UiObjectHelper.getUiObjectByResourceId("com.tencent.mobileqq:id/btn_login");
	}
	
	public UiObject getNewUserBtn(){
		return UiObjectHelper.getUiObjectByResourceId("com.tencent.mobileqq:id/btn_register");
	}
	
	public void clickNewUserBtn(){
		try {
			getNewUserBtn().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  clickDirectLoginBtn(){
		try {
			getDirectLoginBtn().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
