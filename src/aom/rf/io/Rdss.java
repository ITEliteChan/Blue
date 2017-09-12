package aom.rf.io;

import java.io.FileReader;
import java.io.IOException;

public class Rdss {

	FileReader fr;

	public Rdss(FileReader fr) {
		this.fr = fr;
	}

	public String myreadLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fr.read()) != -1) {
			if (ch == '\r') {
//				return sb.toString()+"\r";
				continue;
			}
			if (ch == '\n') {
				return sb.toString()+"\n";
			}
			sb.append((char) ch);
		}
		if (sb.length() != 0) {
			return sb.toString()+"\n";
		}
		return null;
	}
	public void close() throws IOException{
		fr.close();
	}
}
