package oops;

import java.io.FileInputStream;
import java.util.Properties;

public class Collection8 {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream(".p2.properties");
			Properties p=new Properties();
			p.load(fis);
			String s=p.getProperty(args[0]);
			System.out.println(s);
			
		}catch (Exception e) {
			System.err.println(e);
		}
	}

}
