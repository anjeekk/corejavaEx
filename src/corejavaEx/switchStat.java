package corejavaEx;

import java.util.Scanner;

public class switchStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter any (+,-,*,% )");
		char op=sc.next().charAt(0);
		switch(op) {
		case '+':
			
			System.out.println(" sum of (a+b) is:"+(a+b));
case '-':
			
			System.out.println(" sub of (a+b) is:"+(a-b));
case '*':
	
	System.out.println(" mul of (a+b) is:"+(a*b));
case '%':
	
	System.out.println(" remai of (a+b) is:"+(a%b));
		
		}
		
	}

}
