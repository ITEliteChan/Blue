package ao.zhengzebiaoda;

public class One {

	public static void main(String[] args) {
//		String a= "18009";
//		chenQQ2(a);
		
//		String b = "18990924128";
//		shouji(b);	
		
//		String str = "zhang  san  zao  shang  hao";
//		sqit1(str);
		
//		String str1 = "zhang87777777sanyyyyyyyyyy";
//		sqit2(str1);
		
		String phone = "18990924128";
		shouji1(phone);
	}
	//替换手机号
	public static void shouji1(String stt){
		String regex = "(1[3,4,5,7,8]\\d{1})(\\d{4})(\\d{4})";
		String newstr = stt.replaceAll(regex, "$1****$2");
		System.out.println(newstr);
	}
	
	
	//捕获组，切割相同的字符
	public static void sqit2(String str1){
		String regex = "(.)\\1+";
		String newstr = str1.replaceAll(regex, "$1");//使用美元符号取一个组，一个方法里面，第一个参数里面用到了正则的话，第二个想用里面的参数用$符号，"$1"表示获取前一个参数中的第一组
		System.out.println(newstr);
	}
	
	//切割
	public static void sqit1(String str){
		String[] strs = str.split(" ");//加个“+”号可以调节空格，打再多空格也不会出错
		for(String s:strs){
			System.out.println(s);
		}
	}
		
	//正则手机号
	public static void shouji(String sj){
		String regex = "1[3,4,5,7,8][0-9]{9}";//括号取一位可以不要括号 可以不加逗号，加逗号便于阅读
		if(sj.matches(regex)){
			System.out.println("你输入的手机号正确"+sj);
		}else{
			System.out.println("此手机号不存在");
		}
	}
	
	//正则
	public static void chenQQ2(String qqnum){
		String regex = "[1-9][0-9]{4,12}";//第一个是取值1到9之间的数字，第二位是取值0到9之间的数字，{4，12}是取4个到12个数；
		if(qqnum.matches(regex)){
			System.out.println("QQ格式输入正确："+qqnum);
		}else{
			System.out.println("输入不正确");
		}
	}
	
//异常QQ
	public static void chenQQ1(String qqnum) {
		int len = qqnum.length();
		if (len >= 5 && len <= 13) {
			if (!(qqnum.startsWith("0"))) {
				try {
					long lo = Long.parseLong(qqnum);
					System.out.println("输入正确"+qqnum);
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("含有非法字符");
				}
			} else {
				System.out.println("不能以0开头");
			}
		} else {
			System.out.println("你输入的长度有误");
		}
	}
	
//QQ输入
	public static void chenQQ(String qqnum) {
		int len = qqnum.length();
		if (len >= 5 && len <= 13) {
			if (!(qqnum.startsWith("0"))) {
				char[] arr = qqnum.toCharArray();
				for (char a : arr) {
					if (!(a >= '0' & a <= '9')) {
						System.out.println("输入错误，含有特殊字符");
						return;
					}
				}			
				System.out.println("你输入的QQ正确,你输入的是" + qqnum);
			} else {
				System.out.println("不能以0开头");
			}
		} else {
			System.out.println("你输入的长度有误");
		}
	}
}
