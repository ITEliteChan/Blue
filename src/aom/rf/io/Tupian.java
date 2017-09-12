package aom.rf.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Tupian {

	public static void main(String[] args) throws IOException {
		FileInputStream fn = new FileInputStream("/Users/admin/Documents/workspace/blue/src/aom/rf/io/1,1080.jpg");//建立读取文件的流
		FileOutputStream fi = new FileOutputStream("/Users/admin/Documents/workspace/blue/src/aom/rf/io/110.jpg");
		int a = fn.available();//文件的最大值；
	    byte[] by = new byte[a];
	    fn.read(by);//读取文件的内容装到数组里面
	    fi.write(by);
	    	
	}
}
