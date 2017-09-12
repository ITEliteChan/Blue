package ao.rf.ch.di4zhou;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Wite {

	public static void main(String[] args) {

				try {
					FileWriter fw= new FileWriter("/Users/admin/Documents/workspace/blue/src/aom/rf/io/tete.txt");
					fw.write("文字");
					fw.flush();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	
	
		
	}
}
