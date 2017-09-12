package aom.rf.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rehuanhang {

	public static void main(String[] args) throws IOException {
		FileReader fe;
		try {
			fe = new FileReader("/Users/admin/Documents/workspace/blue/src/aom/rf/io/tete.txt");
			Rdss br = new Rdss(fe);
			System.out.print(br.myreadLine());
			System.out.print(br.myreadLine());
			System.out.print(br.myreadLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
