package fcu.iecs.opp;
import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		float b,sum;
		String name;
		System.out.println("�п�J���:");
		i = sc.nextInt();
		System.out.println("�п�J�B�I��:");
		b = sc.nextFloat();
		System.out.println("�п�J�W�r:");
		name = sc.next();
		sum=i*b;
		System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e.",name,i,b,sum);
		sc.close();
	}
	

}
