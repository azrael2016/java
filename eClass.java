package test_9_2_1;
/*由于程序没有具体需求，个人修改只保证程序正常运行，不保证程序实际可用性。 by李实杰
 * 
 * 实际代码效果：传入的两个参数任意一个超过100则抛出异常，否则输出结果。
 * 
 * 测试效果：第一次传参为40,30 输出正常， 之后修改参数后捕获异常，但仍旧输出原参数所赋值的结果120，该异常暂时无法解决。
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
if(x>100||y>100)//判断x、y都不大于100 
throw new MyException("乘数超过100");//抛出一个MyException对象，构造方法参数为“乘数超过100” 
return x*y; 
} 
}
public class eClass { 
public static void main (String args[]) { 
A a; 
a = new B();//设计a对象的B类上转型对象 
try { 
System.out.println(a.f(12,10)); 
	a.f(101, 30);//使用f()方法时传入一个大于100的乘数
} catch(MyException e) { 
	e.printStackTrace();
} 
} 
}
