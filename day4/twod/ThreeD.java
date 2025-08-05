

package com.day4.twod;

public class ThreeD extends TwoD{
	private int z;
	public ThreeD() {
		super();
		System.out.println("Executed the ThreeD default constructor");	
	}
	public ThreeD(int x,  int y, int z) {
		super(x,y);
		this.z=z;
		System.out.println("Executed the ThreeD parameterized constructor");	
	}
	public double findDistance(ThreeD other) {
		double powerx=Math.pow((other.getX()-super.getX()),2);
		double powery=Math.pow((other.getY()-super.getY()),2);
		double powerz=Math.pow((other.getZ()-this.z),2);
		return Math.sqrt(powerx+powery+powerz);
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

}
