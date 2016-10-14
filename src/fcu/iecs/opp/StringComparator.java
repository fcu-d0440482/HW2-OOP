package fcu.iecs.opp;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入字串1");
		str1 = sc.nextLine();
		System.out.println("請輸入字串2");
		str2 = sc.nextLine();
		if (str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("一樣");
		} 
		else 
		{
			System.out.println("不一樣");
		}

		sc.close();

	}

}
