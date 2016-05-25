package test_8_2;

public class test_usb {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
