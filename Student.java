package test_9;

public class Student {
	private int m;
	public void speak(int m){
		try{
			if(m<=1000) this.m=m;
			//else if(m<=2000)  throw new MyException("��ֵ����1000��С��2000");
			else throw new MyException("��ֵ���󣬳���1000��");
		}catch(MyException e){
			e.printStackTrace();
		}
	}
}
