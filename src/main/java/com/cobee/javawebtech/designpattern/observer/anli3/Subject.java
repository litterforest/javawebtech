/**
 * 
 */
package com.cobee.javawebtech.designpattern.observer.anli3;

/** 
 * <pre>被观察的对象，主题</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
public interface Subject {

	/**
	 * <pre>注册观察者</pre>
	 * @author 陈淦森
	 * @version 1.0.1
	 * @date 2017年10月25日
	 *
	 * @param observer
	 */
	void registObserver(Observer observer);
	/**
	 * <pre>通知所有观察者</pre>
	 * @author 陈淦森
	 * @version 1.0.1
	 * @date 2017年10月25日
	 *
	 */
	void notifyObservers();
	/**
	 * <pre>移除观察者</pre>
	 * @author 陈淦森
	 * @version 1.0.1
	 * @date 2017年10月25日
	 *
	 * @param observer
	 */
	void removeObserver(Observer observer);
	
}
