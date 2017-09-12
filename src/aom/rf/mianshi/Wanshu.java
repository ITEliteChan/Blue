package aom.rf.mianshi;

public class Wanshu {
public static void main(String[] args) {
	for(int i = 1;i<=6;i++) {
		int a = (int)((Math.random()*33)+1);
		System.out.print(a+",");
	}
	for(int s = 1;s == 1;s++) {
		int b = (int)((Math.random()*16)+1);
		System.out.print(b);
	}
	//完数
//	for (int a = 1; a <= 10000; a++) {
//		int num = 0;
//		for (int b = 1; b < a; b++) {
//			if (a % b == 0) {
//				num = num + b;
//			}
//		}
//		if (num == a) {
//			System.out.println(a);
//		}
//	}	
//	digui(1,1);
//	digui1(9,9);
}
public static void digui(int a,int b){
	if(b!=10) {
	if(b >= a) {
		System.out.print(a+"x"+b+"="+a*b+"\t");
		digui(a+1,b);
	}else{
		System.out.println();
		digui(1,b+1);
	}
	}
}

public static void digui1(int i,int s) {
	if(i>0) {
		if(s >0 ) {
			System.out.print(i+"x"+s+"="+i*s+"\t");
			digui1(i,s-1);
		}else {
			System.out.println();
			s=i-1;	
			i=i-1;
			digui1(i,s);
		}
	}
}
}
