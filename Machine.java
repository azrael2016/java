package test_9_2;

public class Machine { 
 	Goods[] goods; 
 	public void checkBag(Goods goods) throws DangerException{ 
if(goods.isDanger){
 	//	������1��//��throw�׳�һ��DangerException��������
		throw new DangerException();
} 
 } 
} 
