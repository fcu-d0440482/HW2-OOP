package fcu.iecs.opp;
import java.util.Scanner;
public class CheckOddEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i ;
		i = sc.nextInt();
		if( i % 2 == 0 )
		{
			System.out.println("�o�O����");
		}
		else
		{
			System.out.println("�o�O�_��");
		}
		sc.close();
	}
	
	
}
