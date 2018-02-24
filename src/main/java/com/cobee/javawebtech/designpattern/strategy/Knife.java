package com.cobee.javawebtech.designpattern.strategy;

/**
 * <pre>策略实现类：小刀</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class Knife implements WeaponAware {

	public void fighting() {
		System.out.println("使用小刀刺向敌人......");
	}

}
