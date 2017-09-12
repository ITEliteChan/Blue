package ao.zhengzebiaoda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengzehuoqu {

	public static void main(String[]args){
		String regex = "\\b[a-z]{3}";
		Pattern p = Pattern.compile(regex);//封装正则对象，把正则封装成对象。
//		String str = "21311";//匹配操作，找匹配器
		String str1 = "da jia xia wu hao ,ming tian fang jia";
		Matcher m = p.matcher(str1);
		while(m.find()){
			System.out.println(m.group());
		}
//		System.out.println(m.matches());
//		System.out.println(m.group());
	}
}
