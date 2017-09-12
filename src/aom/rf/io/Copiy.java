package aom.rf.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Copiy {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/admin/eclipse-workspace/Blue/src/aom/rf/io/南方姑娘.mp3");
		MyBufferedStream mbs = new MyBufferedStream(fis);
		FileOutputStream fos = new FileOutputStream("/Users/admin/eclipse-workspace/Blue/src/aom/rf/io/南方.mp3");
		long startTime = System.currentTimeMillis();
		int ch;
		while ((ch = mbs.myread()) != -1) {
			fos.write(ch);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		mbs.myclose();
		fos.close();

	}

}
//		int a = fn.available();
//		byte[] by = new byte[a];
//		fn.read(by);
//		fi.write(by);

