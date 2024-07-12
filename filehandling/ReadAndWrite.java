package filehandling;
import java.io.*;
public class ReadAndWrite {

	public static void main(String[] args) {
try {
			
			File f=new File("D:\\21cs028\\A.java");
			FileInputStream fin=new FileInputStream(f);
			File f1=new File("D:\\21cs028\\Hari.txt");
			FileOutputStream fout=new FileOutputStream(f1);
			int x;
			while((x=fin.read())!=-1){
				char ch=(char)x;
				fout.write(x);
			}
			fin.close();
			System.out.println("Success...");
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}

	}

}
