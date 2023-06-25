import java.util.*;
import java.lang.String;
public class StringBuilder
{
	public static void main (String []args){
		
		
		//class 
		  StringBuilder sb= new StringBuilder("shafin");
		
		 System.out.println("name : "+sb);
		 
		 sb.append("islam");
		 System.out.println("plus"+sb);
		 
		 sb.reverse();
		 
		 System.out.println("reverse: "+sb);
		 
		 sb.delete(0,5);
		 
		 System.out.println(sb);
		 
	}
	
}