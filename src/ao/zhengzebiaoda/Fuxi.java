package ao.zhengzebiaoda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fuxi {
//{n}表示前面的原子恰好出现n次
	//{n,}表示前面的原子最少出现n次
	//{n,m}表示前面的原子最少出现n次，最多出现m次
	//*区配0次,1次或者多次其之前的原子即{0,}
	//+匹配一次或者多次其之前的原子 即{1，}
	//？匹配0次或者1次其之前的原子，即{0,1}
	//a+表示a至少出现一次
	public static void main(String[] args) {
		Tanlan();
		Landuo();
		Qingru();
	}
	public static void Tanlan() {
		String t = "aaaa8aabbbbb6a";
		Pattern p = Pattern.compile("(.{3,10})[0-9]");
		Matcher m = p.matcher(t);
		System.out.println("===贪婪模式===");
		//贪婪模式特点：(最大匹配)一次性地读入整个字符串，如果不匹配就吐掉最右边的
		while(m.find()) {
			System.out.println("开始"+m.start());//返回匹配的值
			
			System.out.println(m.group());
			System.out.println("结束"+m.end());
		}
	}
	public static void Landuo() {
		String t = "aaaa8aabbbbb6a";
		Pattern p1 = Pattern.compile("(.{3,10}?)[0-9]");
		Matcher m1 = p1.matcher(t);
		System.out.println("=====懒惰模式=====");
		//懒惰模式特点(最小匹配)
		/*他的特性是从字符串的左边开始，视图不读入字符串种的字符进行匹配，失败，
		 * 
		 */
		while(m1.find()) {
			System.out.println("开始"+m1.start());
			System.out.println(m1.group());
			System.out.println("结束"+m1.end());
		}
	}
	public static void Qingru() {
		String t = "aaaaa8aabbbbb6a";
		Pattern p2 = Pattern.compile("(.{3,10}+)[0-9]");
		Matcher m2 = p2.matcher(t);
		System.out.println("=====侵入模式=====");
		//侵入模式(完全匹配)
		//和最大匹配一样
		while(m2.find()) {
			System.out.println("开始"+m2.start());
			System.out.println(m2.group());
			System.out.println("结束"+m2.end());
	}
}
}
