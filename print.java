package org.cap.demo;

import java.util.Scanner;

public class print {
 int num;
 int i=1,l=1,a=2,b=1;
 
	
	public void getNumber() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("ENTER NUMBER:");
		num=scanner.nextInt();		
		
		scanner.close();
	}
	public void printNumber() {
		for(l=1;l<=num;l++) {
		for(;i<=3;i++) {
			if(b>=num)
				System.exit(0);
			System.out.print(b+" ");
			b+=2;
		}
		for(int j=1;j<=3;j++) {
			
			if(a>=num)
				System.exit(0);
			System.out.print(a+" ");
			a+=2;
		}
		}
		
		
		
	}
	public static void main(String[] args) {
		print obj=new print();
		obj.getNumber();
		obj.printNumber();

	}

}
