package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

import junit.framework.Assert;

public class PageNews {
	/**
	 * ���ָ���е����ſؼ�����
	 * @param index
	 * @return
	 */
	public UiObject getNewsTitle(int index){
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/title", index);
	}
	/**
	 * 通过获取className获取新闻
	 * @param index
	 * @return
	 */
	public UiObject getNewsTitleByClassName(int index){
		return UiObjectHelper.getUiObjectByClassNameAndInstanceIndex("android.widget.LinearLayout", index);
	}
	/**
	 * ���ָ���еı����ı�
	 * @param index
	 * @return
	 */
	public String getNewsTitleText(int index){
		String newsTitle = null;
		try {
			newsTitle = getNewsTitle(index).getText().toString();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newsTitle;
	}
	public void clickNewsTitle(int index){
		try {
			getNewsTitle(index).clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("�Ҳ���clickNewsTitle");
		}
	}
	/**
	 * 通过getNewsTitleByClassName方法获取新闻标题文本
	 * @param index
	 * @return
	 */
	public String getNewsTitleTextByClassName(int index){
		String newsTitle = null;
		try {
			newsTitle = getNewsTitleByClassName(index).getText().toString();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newsTitle;
	}
	/**
	 * 点击新闻标题
	 * @param index
	 */
	public void clickNewsTitleByClassName(int index){
		try {
			getNewsTitleByClassName(index).clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
