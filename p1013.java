package patyiji;

import java.util.Scanner;

public class p1013 {

	public static void main(String[] args) {
		int count=0;
		int m,n,num=2;
		Scanner in = new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
		while(count<n){
			if(isprime(num)){
				count ++;
				System.out.print(num);
				if(count % 10 !=0)System.out.print(" ");
				else System.out.println();
			}
		}

	}

	private static boolean isprime(int num) {
		
		return false;
	}

}
