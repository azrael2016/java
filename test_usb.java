package test_8_2;

public class test_usb {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Usb c = new UsbDiskWriter();
		c.start();
		c.stop();
		Usb a = new Camera();
		a.start();
		a.stop();
		Usb b = new Mobile();
		b.start();
		b.stop();
	}

}
