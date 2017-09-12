package com.rf.ch.bagezuoye;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Riqishijian {

	public static void main(String[] args) {
         Date date = new Date();
         SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E 第 W 周 这是今年的第D天");
         String time = sf.format(date);
         System.out.println(time);
         
         
         
	}
}
