package test_6_1;

public class Common_divisor {
	public int f(int a,int b){
			 if(a%b==0)
			  return b;//����ֵ����������
			 return f(b,a%b);//����ֵ
			 //���㷽����Դ�ٶȰٿ� C���Եݹ��㷨�����˸о��ܺ��ò�����һ�¾�ֱ�Ӹ��ƹ������ˡ�
	}
}
