package com.cobee.javawebtech.designpattern.strategy;

/**
 * <pre>策略实现类：弓箭</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class Bow implements WeaponAware {

	public void fighting() {
		System.out.println("使用弓箭射死敌人......");
	}

}
