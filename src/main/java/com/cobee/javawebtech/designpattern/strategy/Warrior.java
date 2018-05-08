package com.cobee.javawebtech.designpattern.strategy;

/**
 * <pre>战士</pre>
 * 
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class Warrior {
	
	private WeaponAware weaponAware;
	
	public Warrior(WeaponAware weaponAware)
	{
		this.weaponAware = weaponAware;
	}

	public void setWeaponAware(WeaponAware weaponAware) {
		this.weaponAware = weaponAware;
	}
	
	public void fihgt()
	{
		weaponAware.fighting();
	}
	
	public static void main(String[] args) {
		Warrior warrior = new Warrior(new Cannon());
		warrior.fihgt();
		warrior.setWeaponAware(new Bow());
		warrior.fihgt();
	}
	
}
