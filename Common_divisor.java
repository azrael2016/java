package test_6_1;

public class Common_divisor {
	public int f(int a,int b){
			 if(a%b==0)
			  return b;//返回值（有条件）
			 return f(b,a%b);//返回值
			 //计算方法来源百度百科 C语言递归算法。个人感觉很好用测试了一下就直接复制过来用了。
	}
}
