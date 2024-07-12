package filehandling;
import java.io.*;
public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			
			File f=new File("D:\\21cs028\\A.java");
			FileInputStream fin=new FileInputStream(f);
			int x;
			while((x=fin.read())!=-1){
				char ch=(char)x;
				System.out.print(ch);
			}
			fin.close();
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}

}
