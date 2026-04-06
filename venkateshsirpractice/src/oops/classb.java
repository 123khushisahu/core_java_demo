package oops;

import java.io.FileInputStream;

public class classb {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream(args[0]);
			int n=fis.available();
			byte[] b=new byte[n];
			fis.read();
			String s=new String(b);
			System.out.println(s);
			fis.close();			
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
