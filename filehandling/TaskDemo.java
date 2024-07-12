package filehandling;
import java.io.*;
import java.util.*;
public class TaskDemo {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			File f=new File("D:\\21cs028\\Task.txt");
			FileOutputStream fout=new FileOutputStream(f);
			String msg="645dtf@#$%^djkdbHDJUS4KG3ks5";
			StringBuilder lower=new StringBuilder();
			StringBuilder upper=new StringBuilder();
			StringBuilder num=new StringBuilder();
			StringBuilder splc=new StringBuilder();
			System.out.print("Enter your option 1.lowercase 2.uppercase 3.numbers 4.Special characters: ");
			int option=sc.nextInt();
			for(int i=0;i<msg.length();i++)
			{
				char ch=msg.charAt(i);
				if(Character.isLowerCase(ch))
				{
					lower.append(ch);
				}
				else if(Character.isUpperCase(ch))
				{
					upper.append(ch);
				}
				else if(Character.isDigit(ch))
				{
					num.append(ch);
				}
				else
				{
					splc.append(ch);
				}
			}
			String lower1=lower.toString();
			String upper1=upper.toString();
			String num1=num.toString();
			String splc1=splc.toString();
			if(option>0 && option<5)
			{
			if(option==1)
			{
				byte[] by=lower1.getBytes();
				fout.write(by);
			}
			else if(option==2)
			{
				byte[] by=upper1.getBytes();
				fout.write(by);
			}
			else if(option==3)
			{
				byte[] by=num1.getBytes();
				fout.write(by);
			}
			else
			{
				byte[] by=splc1.getBytes();
				fout.write(by);
			}
			}
			System.out.println("Success...");
			
			
		}
		catch(Exception obj)
		{
			obj.printStackTrace();
		}

	}

}
