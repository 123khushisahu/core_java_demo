package practice;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\KKHUSHBU\\OneDrive\\Desktop\\aaaaa");
		if(f.createNewFile())
		{
		System.out.println("FILE SUCCESSFULLY CREATED");	
		}
		else
		{
			System.out.println("FILE ALREADY EXIST");
		}
	}

}
