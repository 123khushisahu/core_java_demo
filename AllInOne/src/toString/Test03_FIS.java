package toString;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03_FIS {

	/**
	 * 21. Develop a program to read data from a file abc.txt               
	 *     by using FileInputStream.read()
	 *//**
	 * 21. Develop a program to read data from a file abc.txt               
	 *     by using FileInputStream.read()
	 */
	
		
		
			public static void main(String[] args) throws FileNotFoundException, IOException {
				
				//connection is established to the abc.txt file for reading
				FileInputStream fis = new FileInputStream("C:\\Users\\KKHUSHBU\\OneDrive\\Desktop\\ccc.txt");
				
				//reading data from abc.txt file
//				int data1 = fis.read();
//				int data2 = fis.read();
//				int data3 = fis.read();
//				int data4 = fis.read();
//				int data5 = fis.read();
//				int data6 = fis.read();
//				
//				System.out.println(data1+"  " + (char)data1);
//				System.out.println(data2+"  " + (char)data2);
//				System.out.println(data3+"  " + (char)data3);
//				System.out.println(data4+"  " + (char)data4);
//				System.out.println(data5+"  " + (char)data5);
//				System.out.println(data6+"  " + (char)data6);
				
				DataInputStream dis = new DataInputStream();
				int number =100;
			
				int data;
				while((data = fis.read()) != -1) {
					System.out.print(data + "\t");
					System.out.println((char)data);
				}


				fis.close();
			
		}
}
	


