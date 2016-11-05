package com.news.test.testcases;

import com.news.test.BasicTestCase;

import android.Manifest.permission;

/**
 * 测试用例详情：
 * 点击我tab页
 * 点击登录头像
 * 输入用户名：robotium2016@163.com
 * 输入密码：uiautomator
 * 点击登录按钮
 * 点击回到新闻tab页
 * 继续点击进入第二条新闻详情
 * 点击收藏按钮
 * 点击返回按钮
 * 继续点击返回按钮
 * 点击我tab页
 * 点击收藏按钮
 * 在我的收藏页校验第一条的标题内容和新闻详情页面的标题一致
 * 
 * @author zengyan
 *
 */
public class TestCase1 extends BasicTestCase{

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//需登录下进行，设置为true
		super.setUp(true);
	}
	
	public void testTestCase1(){
		pm.getPageNavigation().goToNewsTab();
		String expected = pm.getPageNews().getNewsTitleText(0);
		pm.getPageNews().clickNewsTitle(0);
		pm.getPageNewsDetail().clickMoreTextView();
		pm.getPageNewsDetail().clickFavoritesTextView();
		getUiDevice().pressBack();
		pm.getPageNavigation().goToMySettingTab();
		pm.getPageMy().clickFavoirtesRL();
		String actual = pm.getPageMyFavorites().getTitleTVText(0);
		assertEquals("收藏的新闻标题不一致", expected, actual);
		getUiDevice().pressBack();
		pm.getPageNavigation().goToNewsTab();
	}
	

}
