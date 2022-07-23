package filehandlingdemo;


import java.io.FileWriter;

public class writedemo
{
	public static void main(String args[]) {
		String demo1= "Hi welcome to Java filehandling";
	
	
	try {
	FileWriter output= new FileWriter("E:\\demo1.txt");
	output.write(demo1);
	System.out.println("File Written Successfully");
	output.close();
	}
	catch(Exception e)
	{
		System.out.println("Error File: "+ e);
	}
}
}