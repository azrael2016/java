package test_7_1;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Cylinder c1 = new Cylinder();
		Cylinder c2 = new Cylinder();
		Cylinder c3 = new Cylinder();
		c1.setX(3.2);c1.setY(4.1);
		c1.setR(4);c1.setH(7);
		c2.setX(4);c2.setY(6);
		c2.setR(5);c2.setH(7);
		c3.setX(7);c3.setY(2);
		c3.setR(9);c3.setH(5);
		System.out.println("坐标位置:"+c1.getX()+" "+c1.getY()+"     半径："+c1.getR()+"     高度"+c1.getH()+"     体积"+c1.tj());
		System.out.println("坐标位置:"+c2.getX()+" "+c2.getY()+"     半径："+c2.getR()+"     高度"+c2.getH()+"     体积"+c2.tj());
		System.out.println("坐标位置:"+c3.getX()+" "+c3.getY()+"     半径："+c3.getR()+"     高度"+c3.getH()+"     体积"+c3.tj());
	}

}
