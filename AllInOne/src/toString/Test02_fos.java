package toString;

import java.io.FileOutputStream;

import java.io.IOException;

public class Test02_fos {

    public static void main(String[] args) {

        try {
            // file se connection
            FileOutputStream fos = new FileOutputStream("C:\\Users\\KKHUSHBU\\OneDrive\\Desktop\\ac.txt");

            // int value (byte) write
            //fos.write(65);      // A
            fos.write(66);      // B
            fos.write(67);      // C

            // char write
            fos.write('D');

            // String write (convert to byte array)
            String name = " khus";
            fos.write(name.getBytes());

            System.out.println("Data saved successfully");

            // connection close
            fos.close();

        } catch (IOException e) 
        {
        	
            System.out.println("Error : " + e.getMessage());
        }
    }
}
