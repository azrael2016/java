package test_9_2_1;
/*���ڳ���û�о������󣬸����޸�ֻ��֤�����������У�����֤����ʵ�ʿ����ԡ� by��ʵ��
 * 
 * ʵ�ʴ���Ч���������������������һ������100���׳��쳣��������������
 * 
 * ����Ч������һ�δ���Ϊ40,30 ��������� ֮���޸Ĳ����󲶻��쳣�����Ծ����ԭ��������ֵ�Ľ��120�����쳣��ʱ�޷������
 */
class MyException extends Exception { 
String message; 
MyException(String str) { 
	message=str;
} 
public String getMessage() { 
	return message;
} 
} 
abstract class A { 
abstract int f(int x,int y) throws MyException; 
} 
class B extends A { 
int f(int x,int y) throws MyException { 
if(x>100||y>100)//�ж�x��y��������100 
throw new MyException("��������100");//�׳�һ��MyException���󣬹��췽������Ϊ����������100�� 
return x*y; 
} 
}
public class eClass { 
public static void main (String args[]) { 
A a; 
a = new B();//���a�����B����ת�Ͷ��� 
try { 
System.out.println(a.f(12,10)); 
	a.f(101, 30);//ʹ��f()����ʱ����һ������100�ĳ���
} catch(MyException e) { 
	e.printStackTrace();
} 
} 
}
