package fcu.iecs.opp;
import java.util.Scanner;
public class CheckOddEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i ;
		i = sc.nextInt();
		if( i % 2 == 0 )
		{
			System.out.println("這是偶數");
		}
		else
		{
			System.out.println("這是奇數");
		}
		sc.close();
	}
	
	
}
