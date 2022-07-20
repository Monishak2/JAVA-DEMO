package practiceproject2;

import java.util.ArrayList;
import java.util.Scanner;
public class emailid 
{
	public static void valid(ArrayList<String>list) 
	{
		System.out.println("Enter the organization  mail ID: ");
		Scanner input = new Scanner(System.in);
	      String sc=input.next();
	      int count=0;
		for(String element:list) 
		{
	    	  if(element.equals(sc)) 
	    	  {
	    		  count=1;
	    		  break;
	    	  }
	      }
		if(count==1)
		{
			System.out.println("Mail ID is valid");
		}
		else
		{
			System.out.println("The given mailId is not valid in the organization");
		}
	}
	public static void main(String[] args) 
	{
		ArrayList <String> list=new ArrayList<String>();
		  for(int i=0;i<250;i++)
		  {
			  list.add("simplilearn"+i+"@gmail.com");
		  }
		  emailid.valid(list);
	    
	     
	}
}