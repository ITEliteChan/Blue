package aom.rf.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exp {

	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			System.out.println(arr[2]);
		} catch (Exception e) {
			PrintWriter fw = null;
			try {
				Date da = new Date();
				SimpleDateFormat sdm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String time = sdm.format(da);
				fw = new PrintWriter("/Users/admin/Documents/workspace/blue/src/aom/rf/io/tete2.txt");
				fw.write(time+"\n");
				e.printStackTrace(fw);
				fw.flush();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				System.out.println("这里是你要处理");
			} finally {
				if (fw == null)
					fw.close();
			}
			System.out.println("走丢");
		}
	}
}
