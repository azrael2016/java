package test_7_1;


public class Circle extends Point{
	public final double PI = 3.14;
	protected double r;
	public Circle(){
		r=0;
	}
	public double getR(){
		return r;
	}
	public void setR(double r){
		this.r=r;
	}
	public double mj(){
		return r*PI*PI;
	}
}
