import java.io.*;

public class Nuke{
	public static void main (String[] args)throws IOException {
		 BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		 String input = keyboard.readLine();
		 char[] output = input.toCharArray();

		 for (int i=0;i<input.length();i++){
		 	if(i==1){
		 		continue;
		 	}
		 	System.out.printf(output[i]+"");
		 }


	}
}