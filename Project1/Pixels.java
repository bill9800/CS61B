public class Pixels{
	private short red;
	private short green;
	private short blue;
	public void Pixels(){
		this.red = (short) 0;
		this.green = (short) 0;
		this.blue = (short) 0;
	}
	public void setRed(short intensity){
		this.red = intensity;
	}
	public void setGreen(short intensity){
		this.green = intensity;
	}
	public void setBlue(short intensity){
		this.blue = intensity;
	}
	public short getRed(){
		return this.red;
	}
	public short getGreen(){
		return this.green;
	}
	public short getBlue(){
		return this.blue;
	}

}