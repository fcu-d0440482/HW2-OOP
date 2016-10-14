package fcu.iecs.opp;
import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		float b,sum;
		String name;
		System.out.println("請輸入整數:");
		i = sc.nextInt();
		System.out.println("請輸入浮點數:");
		b = sc.nextFloat();
		System.out.println("請輸入名字:");
		name = sc.next();
		sum=i*b;
		System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e.",name,i,b,sum);
		sc.close();
	}
	

}
