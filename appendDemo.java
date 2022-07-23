package filehandlingdemo;


import java.io.FileWriter;
import java.io.IOException;

public class appendDemo {

	public static void main(String[] args) {
		String demo1="The new Text is appended to the following .txt folder";
		
		try {
			FileWriter output=new FileWriter("E:\\demo1.txt",true);
			output.write(demo1);
			System.out.println("File is Appended Successfully.");
			output.close();
		} catch (IOException e) {
			System.out.println("File Append Failed");
		}

	}
}