/**
 * 
 */
package com.cobee.javawebtech.designpattern.strategy.discount;

/** 
 * <pre>打折策略抽象类</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public interface DiscountStrategy {

	Double discount(Double price, Integer quality);
	
}
