/**
 * 
 */
package com.cobee.javawebtech.designpattern.strategy.discount;

/** 
 * <pre>满200返40</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class DiscountFull200Tu40 implements DiscountStrategy {

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.strategy.DiscountStrategy#discount(java.lang.Double, java.lang.Integer)
	 */
	public Double discount(Double price, Integer quality) {
		Double total = price * quality;
		if (total >= 200.0D)
		{
			return total - 40.0D;
		}
		return total;
	}

}
