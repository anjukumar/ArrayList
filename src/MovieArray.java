import java.util.Collections; 
import java.util.ArrayList; 
import java.util.Scanner;
public class MovieArray 
{
	public static void main(String[] args)
	{
		String res;
		ArrayList<String> movieList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Enter the name of your fav movie");
		movieList.add(sc.nextLine());
		System.out.println("Do you want to continue \"yes\" or \"no\"");
		res = sc.nextLine();
		
		}
		while (res.equalsIgnoreCase("yes"));
		sc.close();
		for (String temp:movieList) { 
		    System.out.println(temp); 
		}
		
	}
}