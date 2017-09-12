package aom.rf.io;

import java.io.FileInputStream;
import java.io.IOException;
//重写Read方法；
public class MyBufferedStream {
	private FileInputStream in;
	private byte[] bt = new byte[1024];
	private int count;
	private int index;

public MyBufferedStream(FileInputStream in) {
		super();
		this.in = in;
	}

public int myread() throws IOException {
		if (count == 0) {
			count = in.read(bt);// 读到的字节个数
			if (count < 0) {
				return -1;
			}
			index = 0;
			count--;
			return bt[index++] & 255;
		} else if (count > 0) {
			count--;
			return bt[index++] & 255;
		}
		return -1;
	}
	public void myclose() throws IOException {
		in.close();
	}

}
