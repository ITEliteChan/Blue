package ao.zhengzebiaoda;

import java.util.TreeSet;

public class Quchong {

	public static void main(String[] args) {
		String str = "我我我....是是是...你你...大大...哥哥";
		str = str.replaceAll("\\.", "");
		String regex = "(.)\\1+";
		String newstr = str.replaceAll(regex, "$1");
		System.out.println(newstr);
		//ip地址进行排序
		text2();
	}	
	//ip地址进行排序
		public static void text2(){
			String str = "192.168.15.10  127.0.0.1  3.3.3.3  105.77.11.55";
			
			//为了让ip地址可以按照字符串顺序比较，只要让ip对每一段位数相同。
			//所以：补0，按照每一位所需做多0进行补充，每一段都先加上两个0
			str = str.replaceAll("(\\d+)", "00$1");
			System.out.println(str);
			//每一段保留数字三位
			str = str.replaceAll("0*(\\d{3})", "$1");
			System.out.println(str);
//			//1、将地址切出
			String[] ids = str.split(" +");
			TreeSet<String> ts = new TreeSet<String>();
			for(String id : ids){
				ts.add(id);	
			}
			for(String ip : ts){
				//输出的时候去除自己所添加的0
				System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
			}
	}
}

