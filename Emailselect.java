import java.util.regex.*; 
/*
	该程序用于获取字符串内的的所有Email地址，基本通用国内外所有Email地址，已进行多次测试，可以使用在各个网站爬虫中。
	The program is used to get all Email address within the string, basic general all Email addresses both at home and abroad, has been tested many times, can use in each website crawler.
*/
public class Emailselect {
    public static void main (String[] args) {
    	String str ="恩恩asdqfqwe@163.com呵呵哈哈1324154@hotmail.com哈哈哈楼主好人13416541@qweqwq.com.cn.pasASFASDFSGas谢谢楼主dada41415417@NETVISION.NET.IL4365啦啦啦15641@hotmail.com1234561445@qq.com";		
    	String reg = "[\\w[.-]]+@[\\w[-.]]+([a-zA-Z\\.]{2,6})";
    	Pattern pattern = Pattern.compile (reg);
        Matcher matcher = pattern.matcher (str);
        while (matcher.find()) {
            System.out.println (matcher.group());
        }
    }
}