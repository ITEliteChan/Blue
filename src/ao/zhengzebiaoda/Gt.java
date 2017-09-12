package ao.zhengzebiaoda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gt {

	public static void main(String[] args) {
		 String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";    
		 Pattern regex = Pattern.compile(check);    
		 Matcher matcher = regex.matcher("494346394@qq.com");    
		 boolean isMatched = matcher.matches();    
		 System.out.println(isMatched);    
	}
}