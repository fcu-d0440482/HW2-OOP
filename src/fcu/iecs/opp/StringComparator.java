package fcu.iecs.opp;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�r��1");
		str1 = sc.nextLine();
		System.out.println("�п�J�r��2");
		str2 = sc.nextLine();
		if (str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("�@��");
		} 
		else 
		{
			System.out.println("���@��");
		}

		sc.close();

	}

}
