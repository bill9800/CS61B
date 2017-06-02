public class Run{
	private int red;
	private int blue;
	private int green;
	private int runLength;
	private Run next;
	private Run prev;

	public Run(int red,int green,int blue,int runLength){
		this.red = red;
		this.blue= blue;
		this.green = green;
		this.runLength = runLength;
	}

	public int getRed(){
		return red;
	}
	public int getGreen(){
		return green;
	}
	public int getBlue(){
		return blue;
	}
	public int getRunLength(){
		return runLength;
	}
 	
 	public void setRunLength(int l){
 		this.runLength = l;
 	}
	public void setNext(Run next){
		this.next = next;
	}
	public void setPrev(Run prev){
		this.prev = prev;
	}
	public Run getNext(){
		return next;
	}
	public Run getPrev(){
		return prev;
	}


}