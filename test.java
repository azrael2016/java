package test_7_1;

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Cylinder c1 = new Cylinder();
		Cylinder c2 = new Cylinder();
		Cylinder c3 = new Cylinder();
		c1.setX(3.2);c1.setY(4.1);
		c1.setR(4);c1.setH(7);
		c2.setX(4);c2.setY(6);
		c2.setR(5);c2.setH(7);
		c3.setX(7);c3.setY(2);
		c3.setR(9);c3.setH(5);
		System.out.println("����λ��:"+c1.getX()+" "+c1.getY()+"     �뾶��"+c1.getR()+"     �߶�"+c1.getH()+"     ���"+c1.tj());
		System.out.println("����λ��:"+c2.getX()+" "+c2.getY()+"     �뾶��"+c2.getR()+"     �߶�"+c2.getH()+"     ���"+c2.tj());
		System.out.println("����λ��:"+c3.getX()+" "+c3.getY()+"     �뾶��"+c3.getR()+"     �߶�"+c3.getH()+"     ���"+c3.tj());
	}

}
