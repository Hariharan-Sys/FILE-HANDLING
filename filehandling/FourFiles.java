package filehandling;
import java.io.*;
import java.util.*;
public class FourFiles {

		public static void main(String[] args) {
			try {
				File f1=new File("D:\\21cs028\\A.java");
				FileInputStream fin1=new FileInputStream(f1);
				File f2=new File("D:\\21cs028\\Array.java");
				FileInputStream fin2=new FileInputStream(f2);
				File f3=new File("D:\\21cs028\\Check.java");
				FileInputStream fin3=new FileInputStream(f3);
				File f4=new File("D:\\21cs028\\Count.java");
				FileInputStream fin4=new FileInputStream(f4);
				
				Vector<FileInputStream> v=new Vector<>();
				v.add(fin1);
				v.add(fin2);
				v.add(fin3);
				v.add(fin4);
				Enumeration<FileInputStream> e=v.elements();
				
				SequenceInputStream sin=new SequenceInputStream(e);
				int count=1;
				int x;
				while((x=sin.read())!=-1){
					char ch=(char)x;
					System.out.print(ch);
				}
				fin4.close();
				fin3.close();
				fin2.close();
				fin1.close();
				}
			catch(Exception obj){
				obj.printStackTrace();
			}

		}

}

