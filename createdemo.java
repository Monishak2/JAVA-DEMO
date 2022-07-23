package filehandlingdemo;

import java.io.File;
import java.io.IOException;
public class createdemo {

	public static void main(String[] args) {
		
		File myfile=new File("E:\\demo1.txt");
		try {
			if(myfile.createNewFile())
			{
				System.out.println("File is Successfully Created");
			}
			else {
				System.out.println("File is not Successfully Created");
			}
		} catch (IOException e) {
			
			System.out.println("File is not Successfully Created");
		}
		
		
	}

}