package test_7_1;

public class Cylinder extends Circle{
	protected double h;
	public Cylinder(){
		h=0;
	}
	public double getH()
	{
		return h;
	}
	public void setH(double h){
		this.h=h;
	}
	public double tj(){
		return super.mj()*h;
	}
}
