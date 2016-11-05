package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageNewsDetail {
	/**
	 * ��ȡ���ϽǸ���Ŀؼ�
	 * @return
	 */
	public UiObject getMoreTextView(){
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/biz_newspage_menu_more");
	}
	/**
	 * 获取收藏控件
	 * @return
	 */
	public UiObject getFavoritesTextView(){
		return UiObjectHelper.getUiObjectByText("收藏");
	}
	
	public void clickMoreTextView(){
		try {
			getMoreTextView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickFavoritesTextView(){
		try {
			getFavoritesTextView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public UiObject getShareButton(){
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/comment_reply_share");
	}
	public void clickShareButton(){
		try {
			getShareButton().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
