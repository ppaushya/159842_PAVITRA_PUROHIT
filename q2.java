package org.cap.demo;

import java.util.Scanner;

public class q2 {
int i,j,k,r,c;
int[][] arr;
int[] sum=new int[3];



public void getData() {
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter rows:");
	r=scan.nextInt();
	System.out.print("Enter columns:");
	c=scan.nextInt();
	
	arr=new int[r][c];
	System.out.println("ENTER DATA:");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			arr[i][j]=scan.nextInt();
		}
	}
	scan.close();
	
	
}

public void printData() {
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
}


public void sum() {
	System.out.println("SUM OF THE ELEMENTS:");
	for(i=0;i<r;i++) {
		for(j=0;j<c;j++) {
			sum[i]=sum[i]+arr[i][j];
			
		}
		System.out.println(sum[i]);
	}
	
	
}
public void min_sum() {
	int min=sum[0];
	for(i=0;i<sum.length;i++) {
		
			if(sum[i]<min) {
				min=sum[i];
			}
		
	}
	System.out.println("Minimum sum is "+ min);
	
}
	public static void main(String[] args) {
		q2 obj=new q2();
		obj.getData();
		obj.printData();
		obj.sum();
		obj.min_sum();
		

	}

}
