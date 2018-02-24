package com.cobee.javawebtech.designpattern.adapter.anli1;

/**
 * <pre>坐骑：鹿。增加会飞的功能</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
public class FlyDeer implements DeerAware {
	
	private Deer deer;

	public FlyDeer(Deer deer) {
		super();
		this.deer = deer;
	}

	public Deer getDeer() {
		return deer;
	}

	public void setDeer(Deer deer) {
		this.deer = deer;
	}

	public void run() {
		deer.run();
	}

	public void fly() {
		System.out.println("鹿往天空上飞......");
	}
	
}
