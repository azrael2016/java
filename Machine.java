package test_9_2;

public class Machine { 
 	Goods[] goods; 
 	public void checkBag(Goods goods) throws DangerException{ 
if(goods.isDanger){
 	//	【代码1】//用throw抛出一个DangerException的匿名类
		throw new DangerException();
} 
 } 
} 
