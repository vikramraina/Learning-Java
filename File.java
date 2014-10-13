import java.io.*;
import java.lang.Exception;

public class File {
	
	public static void main (String [] args) throws IOException {
		
		FileReader in = new FileReader("/Users/vraina/Raina/eclipse/WorkSpace/Learning Java/src/input.txt");
		FileWriter out = new FileWriter("/Users/vraina/Raina/eclipse/WorkSpace/Learning Java/src/output.txt");
		
		int c; int d=0;
		// Throwing an exception, Put d=0 to check
		if (d==1) throw new IOException();
		
		try {
			while ((c=in.read()) != -1) {
				out.write(c);
			}
			int [] arr = {1,2};
			System.out.println("Array out of bound::" + arr[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Hurray Caught Exception::" +e);
		}finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}
}
