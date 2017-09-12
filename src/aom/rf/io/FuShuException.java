package aom.rf.io;

public class FuShuException extends Exception{

	private int num;
	public FuShuException(String msg){
	super(msg);
	this.num =num;
	}
	public int getNum() {
		return num;
	}
}
