package org.cap.demo;

import java.util.Scanner;

public class array2d {
	int r,c,i,j,temp;
	int[][]arr;
	
	public void getData() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter rows:");
		r=scan.nextInt();
		System.out.print("Enter columns:");
		c=scan.nextInt();
		
		arr=new int[r][c];
		if(r!=c) {
			System.out.print("ONLY SQUARE MATRIX ALLOWED");
			System.exit(0);
		}
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
	
	public void UpperTriangle() {
		System.out.print("Upper triangle:\n");
		for(i=0;i<r;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void LowerTriangle() {
		System.out.print("Lower triangle:\n");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				if(i<=j)
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	public void Transpose() {
		System.out.println("TRANSPOSE\n");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) {
		
		array2d obj=new array2d();
		obj.getData();
		obj.printData();
		obj.UpperTriangle();
		obj.LowerTriangle();
		obj.Transpose();
		
		
		
	

}
}
