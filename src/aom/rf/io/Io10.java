package aom.rf.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Io10 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("/Users/admin/eclipse-workspace/Blue/src/aom/rf/io/tete.txt");
		FileOutputStream fo = new FileOutputStream("/Users/admin/eclipse-workspace/Blue/src/aom/rf/io/tete3.txt");//创建一个文件
		BufferedInputStream bi = new BufferedInputStream(fi);//读取的缓冲区
		BufferedOutputStream bo = new BufferedOutputStream(fo);//写入的缓冲区                                                                                                                                               );
		int ch ;
		while((ch=bi.read())!=-1) {//读的缓冲区，read：读
//			fo.write(ch);//进行读的操作
			bo.write(ch);//写的缓冲区
		}
		
	}
}
