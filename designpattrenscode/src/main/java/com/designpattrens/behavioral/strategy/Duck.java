/**
 * 
 */
package com.designpattrens.behavioral.strategy;

/**
 * @author ravitejakommalapati
 *
 */
public class Duck {

	private IDisplay  iDisplay;
	private Ifly ifly;
	private IQuack iQuack;
	
	public Duck(IDisplay iDisplay,  Ifly   ifly, IQuack  iQuack) {
		this.iDisplay=iDisplay;
		this.ifly =ifly;
		this.iQuack =iQuack;
	}
	
	
	public Ifly fly() {
		return ifly;
	}
}
