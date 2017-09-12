package com.rf.ch.ATM;

import java.io.IOException;
import java.io.InputStream;

public class Systemoute {

	public static void main(String[] args) throws IOException {
		//键盘输入
		InputStream in = System.in;
		//int ch = in.read();阻塞式方法
		
		//对象必须申明在循环外部，申明在循环外部，会导致每次循环new一个对象，每一次只添加一个字节；
		StringBuilder sb = new StringBuilder();
		while(true){
			int ch = in.read();
			if( ch =='\r'){
				continue;
			}
			if(ch =='\n'){
				String str = sb.toString();
				if("end".equals(str)){
					break;
//					System.exit(0);
				}
				sb.delete(0, sb.length());
				System.out.println(str);
			}else{
				sb.append((char)ch);
			}
		}
	}
}
