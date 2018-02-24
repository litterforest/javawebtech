/**
 * 
 */
package com.cobee.javawebtech.designpattern.strategy.discount;

/** <pre>打8折</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class Discount80 implements DiscountStrategy {

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.strategy.DiscountStrategy#discount(java.lang.Double, java.lang.Integer)
	 */
	public Double discount(Double price, Integer quality) {
		return price * quality * 0.8;
	}

}
