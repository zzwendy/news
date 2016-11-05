package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

import junit.framework.Assert;

public class PageLogin {
	/**
	 * ��ȡ�û��������
	 * @return
	 */
	public UiObject getUserEditText(){
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/login_username");
	}
	/**
	 * ��ȡ���������
	 * @return
	 */
	public UiObject getPwdEditText(){
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/login_password");
	}
	/**
	 * ��ȡ��¼��ť
	 * @return
	 */
	public UiObject getloginButton(){
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/do_login_button");
	}
	/**
	 * �����û����ķ���
	 * @param username
	 */
	public void enterUserName(String username){
		try {
			getUserEditText().clearTextField();
			getUserEditText().setText(username);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("获取输入框对象为null");
		}
		
	}
	/**
	 * ��������ķ���
	 * @param password
	 */
	public void enterPwd(String password){
		try {
			getPwdEditText().clearTextField();
			getPwdEditText().setText(password);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("获取密码框为null");
		}
		
		
	}
	/**
	 * �����¼��ť�ķ���
	 */
	public void clickLoginButton(){
		try {
			getloginButton().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("获取登录按钮为null");
		}
	}
	/**
	 * �����¼�ķ���
	 * @param username
	 * @param password
	 */
	public void login(String username,String password){
		enterUserName(username);
		try {
			getPwdEditText().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterPwd(password);
		clickLoginButton();
	}
	
	
}
