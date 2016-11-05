package com.news.test;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
/**
 * 
 * @author zengyan
 *
 */
public class UiObjectHelper {
	/**
	 * ͨ���ı���λ�ķ���
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByText(String text){
		UiObject object = new UiObject(new UiSelector().text(text));
		return object;
	}
	/**
	 * ͨ��������λ�ķ���
	 * @param className
	 * @return
	 */
	public static UiObject getUiObjectByClassName(String className){
		UiObject object = new UiObject(new UiSelector().className(className));
		return object;
	}
	/**
	 * ͨ��ID��λ�ķ���
	 * @param id
	 * @return
	 */
	public static UiObject getUiObjectByResourceId(String id){
		UiObject object = new UiObject(new UiSelector().resourceId(id));
		return object;
	}
	/**
	 * ͨ��Content description��λ�ķ���
	 * @param des
	 * @return
	 */
	public static UiObject getUiObjectByContentDes(String des){
		UiObject object = new UiObject(new UiSelector().descriptionContains(des));
		return object;
		
	}
	/**
	 * ����������ı�һ��λ�ķ���
	 * @param className
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByClassNameAndText(String className,String text){
		UiObject object = new UiObject(new UiSelector().className(className).text(text));
		return object;
	}
	/**
	 * ������ͬid�Ĳ�ͬ�ռ��ȡ����
	 * @param id
	 * @param index
	 * @return
	 */
	public static UiObject getUiObjectByIdAndInstanceIndex(String id,int index){
		UiObject object = new UiObject(new UiSelector().resourceId(id).instance(index));
		return object;
	}
	/**
	 * ��ȡ��������ķ���������ָ��ˮƽ������ֱ������true��ʾˮƽ������false��ʾ��ֱ����
	 * @param isHorizontal
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public static UiScrollable getScrollList(boolean isHorizontal) throws UiObjectNotFoundException{
		UiScrollable scrollView = new UiScrollable(new UiSelector().scrollable(true));
		if(isHorizontal){
			scrollView.setAsHorizontalList();
		}else
			scrollView.setAsVerticalList();
		return scrollView;
	}
	public static UiObject scrollToGetChild(UiScrollable scrollView,String text) throws UiObjectNotFoundException{
		return scrollView.getChild(new UiSelector().text(text));
	}
	
	public static UiObject getUiObjectByClassNameAndInstanceIndex(String className,int index){
		UiObject object = new UiObject(new UiSelector().className(className).instance(index));
		return object;
		
	}
}
