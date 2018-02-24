package com.cobee.javawebtech.designpattern.strategy;

/**
 * <pre>策略实现类：加农炮</pre>
 * 
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class Cannon implements WeaponAware {

	public void fighting() {
		System.out.println("使用大炮攻击敌人......");
	}

}
