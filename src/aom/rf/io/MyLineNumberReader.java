package aom.rf.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class MyLineNumberReader {

	private FileReader fr;
	private int LineNumber;
	public MyLineNumberReader(FileReader fr) {
		this.fr = fr;
	}

	public String myReadLine() throws IOException {
		LineNumber++;
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fr.read()) != -1) {
			if (ch == '\r') {
				continue;
			}
			if (ch == '\n') {
				return sb.toString();
			}
			sb.append((char) ch);
		}
		if (sb.length() != 0) {
			return sb.toString();
		}
		return null;

	}
	public int getLineNumber() {
		return LineNumber;
	}
	public void setLineNumber(int lineNumber) {
		LineNumber = lineNumber;
	}
}
