package systemInOut;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OutputStream os = System.out;
		
		for(byte b = 48; b < 58; b++) {
			os.write(b);
		}
		
		os.write(10);
		
		for(byte b = 97; b < 123; b++) {
			os.write(b);
		}
		
		os.write(10);
		
		String hangle= "가나다라마바사아자차카타파하";
		byte[] hangleBytes = hangle.getBytes();
		os.write(hangleBytes);
		
		os.flush();

	}

}
