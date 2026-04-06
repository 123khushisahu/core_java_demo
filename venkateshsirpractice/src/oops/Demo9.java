package oops;

import java.io.*;

public class Demo9 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(args[0]);
		int	n=fis.available();
	byte[] b=new byte[n];
	fis.read();
	String s=new String(b);
	System.out.println(s);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fis.close();
			}catch(Exception e)
			{
				System.err.println(e);
			}
		}

	}

}
