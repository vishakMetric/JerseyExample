package mtvttoapalab01.corp.intuit;

import java.io.File;
import java.io.FileNotFoundException;;

public class UserMainCode {
	
	public static void main(String[]args) {
		
		try {
			File file = new File("C:\\Text.txt");
			System.out.println("file exists::"+file.exists());
			System.out.println(file.getCanonicalPath());
		} catch(Exception exe) {
			exe.printStackTrace();
		} 
		/*catch(FileNotFoundException ixe) {
			ixe.printStackTrace();
		}*/ 
	}
}
