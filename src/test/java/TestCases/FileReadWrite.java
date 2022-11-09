package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileout= new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\TestingTestng\\Test1.txt");
		String name = "java selenium";
		byte b[] = name.getBytes();
		fileout.write(b);
        fileout.close();
        
        FileInputStream fileread = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TestingTestng\\Test1.txt");
        int s = fileread.read();
        System.out.println((char)s);
	}

}
