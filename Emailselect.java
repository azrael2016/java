import java.util.regex.*; 
/*
	�ó������ڻ�ȡ�ַ����ڵĵ�����Email��ַ������ͨ�ù���������Email��ַ���ѽ��ж�β��ԣ�����ʹ���ڸ�����վ�����С�
	The program is used to get all Email address within the string, basic general all Email addresses both at home and abroad, has been tested many times, can use in each website crawler.
*/
public class Emailselect {
    public static void main (String[] args) {
    	String str ="����asdqfqwe@163.com�Ǻǹ���1324154@hotmail.com������¥������13416541@qweqwq.com.cn.pasASFASDFSGasлл¥��dada41415417@NETVISION.NET.IL4365������15641@hotmail.com1234561445@qq.com";		
    	String reg = "[\\w[.-]]+@[\\w[-.]]+([a-zA-Z\\.]{2,6})";
    	Pattern pattern = Pattern.compile (reg);
        Matcher matcher = pattern.matcher (str);
        while (matcher.find()) {
            System.out.println (matcher.group());
        }
    }
}