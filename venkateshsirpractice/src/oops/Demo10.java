package oops;

import java.io.*;

public class Demo10 {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fis=new FileInputStream(args[0]); 
				byte[] b=new byte[fis.available()];
						
				fis.read(b);
				System.out.println(new String(b));
				
			
					
		}

	}

}
