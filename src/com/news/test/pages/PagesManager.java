package com.news.test.pages;

public class PagesManager {
	PageLogin pageLogin;
	PageMy pageMy;
	PageMyFavorites pageMyFavorites;
	PageNavigation pageNavigation;
	PageNews pageNews;
	PageNewsDetail pageNewsDetail;
	PageCommon pageCommon;
	PageQQRegister pageQQRegister;
	PageQQLoginType pageQQLoginType;
	
	public PageNavigation getPageNavigation(){
		if(pageNavigation == null){
			pageNavigation = new PageNavigation();
		}
		return pageNavigation;
	}
	
	public PageLogin getPageLogin(){
		if(pageLogin == null){
			pageLogin = new PageLogin();
		}
		return pageLogin;
	}
	
	public PageMy getPageMy(){
		if (pageMy == null) {
			pageMy = new PageMy();
		}
		return pageMy;
	}
	
	public PageMyFavorites getPageMyFavorites(){
		if (pageMyFavorites == null) {
			pageMyFavorites = new PageMyFavorites();
		}
		return pageMyFavorites;
	}
	
	public PageNews getPageNews(){
		if (pageNews == null) {
			pageNews = new PageNews();
		}
		return pageNews;
	}
	
	public PageNewsDetail getPageNewsDetail(){
		if (pageNewsDetail == null) {
			pageNewsDetail = new PageNewsDetail();
		}
		return pageNewsDetail;
	}
	public PageCommon getPageCommon(){
		if(pageCommon == null){
			pageCommon = new PageCommon();
		}
		return pageCommon;
	}
	public PageQQRegister getPageQQRegister(){
		if(pageQQRegister == null){
			pageQQRegister = new PageQQRegister();
		}
		return pageQQRegister;
	}
	public PageQQLoginType getPageQQLoginType(){
		if(pageQQLoginType == null){
			pageQQLoginType = new PageQQLoginType();
		}
		return pageQQLoginType;
	}
}
