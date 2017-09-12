package aom.rf.io;

import java.io.File;

public class DuquJavawenjian {

	public static void main(String[] args) {
		File fu = new File("/Users/admin/Documents/workspace/blue");
		Galaxy(fu,1);
	}
	public static void Galaxy(File mk ,int index){
		File[] pl = mk.listFiles();
		for (File ok : pl) {
			if (ok.isFile()) {
				for (int i = 0; i < index; i++) {
					System.out.print("-");
				}
				System.out.println(ok.getName());
			}
			if(ok.isDirectory()){
				for(int i = 0;i<index;i++){
					System.out.print("=");
				}
				System.out.println(ok.getName());
				Galaxy(ok,index+1);
			}
			}
		}
}
