package com.ThurstdayLabTest;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Nazeer\\Desktop\\hello.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(97);
			dout.writeChar('N');
			dout.flush();
			dout.close();
			fout.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		try
		{
			FileInputStream fin =new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello.txt");
			DataInputStream din = new DataInputStream(fin);
			int count=din.available();
			byte[] b=new byte[count];
			din.read(b);
			for(byte bt:b)
			{
				System.out.println((char)bt);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

