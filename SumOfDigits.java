package org.cap.demo;

import java.util.Scanner;

public class SumOfDigits {
	int num,temp,sum=0;
	
	public void getNumber() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("ENTER NUMBER:");
		num=scanner.nextInt();
		scanner.close();
		
	}
	public int getSum() {
		while(num!=0) {
			temp=num%10;
			sum+=temp;
			num=num/10;
		}
			System.out.println("The sum of the digits of number is "+sum);
			return sum;
			
		
		
	}

		public static void main(String[] args) {
		  SumOfDigits obj=new SumOfDigits();
		  obj.getNumber();
		  obj.getSum();

	}

}
