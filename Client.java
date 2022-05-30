import java.lang.*;
import java.net.*;
import java.io.*;

public class Client 
{
	 
 
	public static void main(String args[]) throws Exception
	{
		System.out.println("Client application is running...");
		String s1=null,s2=null;
		BufferedReader brk=null,br=null;
	    PrintStream ps=null;
	    Socket s=null;

		try
		{
		 s=new Socket("Localhost",1100);
		  brk=new BufferedReader(new InputStreamReader(System.in));
	  br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
	  ps=new PrintStream(s.getOutputStream());
		while(!(s1=brk.readLine()).equals("Good Night"))
			
		{
			ps.println(s1);
			s2=br.readLine();
			System.out.println("Server says:"+s2);
			System.out.println("Enter message for server:");
		}
		}
		catch (Exception obj)
		{
			
		}
		try
		{
			s.close();
			ps.close();
			brk.close();
			 br.close();
		}
		catch(Exception obj)
		{
			
		}
	}

}
