package test_9_2;

public class Check { 
public static void main(String[] args) { 
Machine machine=new Machine(); 
String name[]={"ƻ��","ըҩ","����","����","�ֱ�","���"}; 
Goods [] goods= new Goods[name.length];//���6����Ʒ
for(int i=0;i<name.length;i++){ 
goods[i]=new Goods(); 
if(i%2==0){ 
goods[i].setisDanger(false); 
goods[i].setName(name[i]); 
} 
else{ 
goods[i].setisDanger(true); 
goods[i].setName(name[i]); 
} 
} 
for(int i=0;i<goods.length;i++){ 
try{ 
machine.checkBag(goods[i]); 
System.out.println(goods[i].getName()+"���ͨ��"); 
} catch(DangerException e){ 
//������2��//e����toShow()���� 
	e.toShow();
System.out.println(goods[i].getName()+"����ֹ��"); 
} 
} 
} 
}
