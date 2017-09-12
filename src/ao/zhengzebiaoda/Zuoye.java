package ao.zhengzebiaoda;

public class Zuoye {

	public static void main(String[] args) {
		String str1 = "494346394@qq.com";
		Galaxy(str1);
	}
	public static void Galaxy(String to){
		String str = "[1-9][0-9]{5,10}@qq.com";
		if(to.matches(str)){
			System.out.println("你输入的邮箱正确");
		}else{
			System.out.println("你输入的邮箱错误");
	}
}
}
