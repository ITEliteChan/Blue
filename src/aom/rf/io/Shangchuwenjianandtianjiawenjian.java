package aom.rf.io;

import java.io.File;

public class Shangchuwenjianandtianjiawenjian {

	public static void main(String[] args) {
//实现一个删除目录的方法
		File fi = new File("C:/Users/admin/Desktop/a/b/c");
		fi.mkdirs();
		File fif = new File("C:/Users/admin/Desktop/a/b/c");
	    GalaxyMe(fif);

//实现一个读取Java以下文件的方法
		File fu = new File("C:/Users/admin/workspace/Blue");
		GalaxyMy(fu,1);
}
	public void Galaxy(){
		//将/Users/admin/Documents/workspace/blue/src/aom/rf/io/abcd/目录下的ABC.TXT
		//封装成file对象，可以将已有的和未出现的文件或者文件夹封装成对象
//		File file = new File("/Users/admin/Documents/workspace/blue/src/aom/rf/io/abcd.txt");
//		System.out.println(file);
//		File file1 = new File("/Users/admin/Documents/workspace/blue/src/aom/rf/io/", "abc1.txt");
//		System.out.println(file1);
		File ff = new File("/Users/admin/Documents/workspace/blue/src/aom/rf/io/qa/");
//			System.out.println(file3.createNewFile());
//			System.out.println(file3.delete());
//			file3.deleteOnExit();//程序已结束就删除文件
		System.out.println(ff.mkdirs());//创建多个目录
//			System.out.println(file3.exists());
//			System.out.println(file3.isDirectory());//判断 file 是否是目录
//			System.out.println(file3.isFile());
	}
	
//实现一个删除目录的方法
	public static void GalaxyMe(File fi){
		System.out.println(fi);
		if(fi.exists()){//确定这个目录存不存在
		 if (fi.isDirectory()) {
			File[] fe = fi.listFiles();
			for (File ck:fe) {
				if(ck.isFile()){//判断是否是文件，如果是文件就不能删除
					continue;
				}
				GalaxyMe(ck);
				System.out.println("目录" + ck + "删除成功");
			}
		}
		fi.delete();
		}
	}
	
//实现一个读取Java文件的方法
	public static void GalaxyMy(File mk, int index){
		File[] pl = mk.listFiles();
		for(File ok:pl){
			if(ok.isFile()){
				for(int i = 0;i<index;i++){
					System.out.print("-");
				}
				System.out.println(ok.getName());
			}
			if(ok.isDirectory()){
				for(int i = 0;i<index;i++){
					System.out.print("=");
				}
				System.out.println(ok.getName());
				GalaxyMy(ok,index+1);
			}
		}
	}
//	public static void GalaxyMr(File mk, int index) {
//		File[] pl = mk.listFiles();//listFiles能够获取当前文件夹下的所有文件和文件夹
//		for (File ok : pl) {//Pl集合，数组 ,ok指的是File型的
//			if (ok.isFile()) {//使用isFile判断是不是文件,ok指的是一个文件，每次循环都在增加；
//				for (int i = 0; i < index; i++) {
//					System.out.print("-");
//				}
//				System.out.println(ok.getName());//获取文件名字
//			}
//			if (ok.isDirectory()) {//使用isDirectory判断是不是目录
//				for (int i = 0; i < index; i++) {//循环打出多少个等号
//					System.out.print("=");
//				}
//				System.out.println(ok.getName());
//				GalaxyMr(ok, index + 1);//每次循环符号+1；
//			}
//		}
//	}
}
