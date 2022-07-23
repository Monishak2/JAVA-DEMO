package filehandlingdemo;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readdemo {

	public static void main(String[] args) throws IOException {
		 char[] demo1=new char[31];
		 
		 try {
			FileReader input= new FileReader("E:\\demo1.txt");
			input.read(demo1);
			System.out.println("Demo1 is Read Successfully.");
			System.out.println(demo1);
		} catch (FileNotFoundException e) {
			
			System.out.println("Error in the Read File.");
		}

	}

}