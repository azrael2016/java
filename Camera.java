package test_8_2;

public class Camera implements Usb{
	public void start(){
		System.out.println("开始访问相机");
	}
	public void stop(){
		System.out.println("停止访问相机");
	}
}
