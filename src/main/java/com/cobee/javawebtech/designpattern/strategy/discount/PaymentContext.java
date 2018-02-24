/**
 * 
 */
package com.cobee.javawebtech.designpattern.strategy.discount;

/** <pre></pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class PaymentContext {
	
	private DiscountStrategy discountStrategy;
	
	public PaymentContext()
	{
		this.discountStrategy = new NoDiscount();
	}
	
	public PaymentContext(DiscountStrategy discountStrategy)
	{
		this.discountStrategy = discountStrategy;
	}

	public void setDiscountStrategy(DiscountStrategy discountStrategy)
	{
		this.discountStrategy = discountStrategy;
	}

	public Double pay(Double price, Integer quality)
	{
		return discountStrategy.discount(price, quality);
	}
	


	/** <pre></pre>
	 * @author 陈淦森
	 * @version 1.0.1
	 * @date 2017年10月24日
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		PaymentContext paymentContext = new PaymentContext();
		System.out.println(paymentContext.pay(80.0D, 2));
		paymentContext.setDiscountStrategy(new Discount80());
		System.out.println(paymentContext.pay(80.0D, 2));
		paymentContext.setDiscountStrategy(new DiscountFull200Tu40());
		System.out.println(paymentContext.pay(80.0D, 3));
	}

}
