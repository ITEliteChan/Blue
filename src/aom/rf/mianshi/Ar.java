package aom.rf.mianshi;

public class Ar {
	public static void main(String[] args) {
//		int num = 0;
//		for (int a = 100; a <= 200; a++) {
//			for (int b = 2; b <= a/2+1; b++) {
//				if (a % b == 0) {
//					break;
//				} else if (b >= a/2+1) {
//					System.out.println(a + "是素数");
//					num+=a;
//					break;
//				}
//			}
//		}
//		System.out.println(num);
		for (int a = 1; a <= 10000; a++) {
//			System.out.println("asfasfadsfsadf"+a);
			int num = 0;
			for (int b = 1; b < a; b++) {
				if (a % b == 0) {
					num = num + b;
//					 System.out.println(b);
				}
			}
			if (num == a) {
				// System.out.println(num-a);减去的是他本身；
				System.out.println(a);
			}
		}
	}
}
