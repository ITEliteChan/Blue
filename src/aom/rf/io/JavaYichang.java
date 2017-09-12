package aom.rf.io;

public class JavaYichang {

	public static void main(String[] args) {
		//数组越界异常和算数越界异常。
//		try {
//			int[] arr = new int[2];
//			System.out.println(arr[2]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println("数组越界");
//			e.printStackTrace();
//			run(3, 0);
//		} catch (ArithmeticException e1) {
//			// TODO: handle exception
//			System.out.println("算数异常");
//			System.out.println(e1.getMessage());
//			e1.printStackTrace();
//		} // 父类异常写在子类异常的结尾
		
		
//不同类型的异常，不同的提示信息。
//		try {
//			System.out.println(run(3, 1));
//		} catch (ArithmeticException e) {// 抛出的异常类型必须不能低于方法里声明的类型
//			// TODO: handle exception
//			System.out.println("算数异常：除数为0，除法运算中除数不能为0");
//		} catch (ArrayIndexOutOfBoundsException e) {// 抛出的异常类型必须不能低于方法里声明的类型
//			// TODO: handle exception
//			System.out.println("数组越界了");
//		}
		
		
		try {
			run1(3,-1);
		} catch (FuShuException e) {//异常的类型使用方法里面命名的异常。
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("除数是"+e.getNum());
			e.printStackTrace();
		}
	}

	public static int run(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int[] arr = new int[a];
		System.out.println(arr[a]);
		return a / b;
	}

	public static int run1(int a, int b) throws FuShuException{
		if(b<0){
		throw new FuShuException("除数为负数了"+b);	
		}
		return a / b;
	}
}
