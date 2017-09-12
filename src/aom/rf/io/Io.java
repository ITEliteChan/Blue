package aom.rf.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;

public class Io {

	public static void main(String[] args) throws IOException  {
	
		FileReader fr = new FileReader("/Users/admin/Documents/workspace/blue/src/aom/rf/io/tete.txt");
		MyLineNumberReader ln = new MyLineNumberReader(fr);
//		LineNumberReader ln = new LineNumberReader(fr);
//		System.out.println(str);
//		ln.setLineNumber(100);
		String str;
		while((str = ln.myReadLine()) !=null){
//			System.out.println(str);
			System.out.println(ln.getLineNumber()+":"+str);
		}
		
			
  
		
		
		
		
//		FileReader fr = new FileReader("/Users/admin/Documents/workspace/blue/src/aom/rf/io/Io.java");
//		FileWriter fw = new FileWriter("/Users/admin/Documents/workspace/blue/src/aom/rf/io/copy.java");
//		char[] ca = new char[1024];
//		int num;
//		while((num = fr.read(ca)) != -1){
////			System.out.println(new String(ca,0,num));
//			fw.write(new String(ca,0,num));
//		}
//		fw.close();
	}
	}
	