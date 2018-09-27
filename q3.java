package org.cap.demo;

import java.util.Scanner;

public class q3 {
	int i,j,k,r,c,temp;
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
	public void sortData() {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				for(k=i+1;k<c;k++) {
					if(arr[i][j]>arr[k][j]) {
						temp=arr[i][j];
						arr[i][j]=arr[k][j];
						arr[k][j]=temp;
					}
				}
		
			}
		}
	}
	
	public int[] minMissingElem(int r, int c)
	{
		int[] result=new int[r];
			int x=0,flag=0;
			for(int k=0;k<r;k++)
			{
				flag=0;
				for(int i=1;i<c;i++)
				{
				if(arr[k][i]-arr[k][i-1]>1)
					{
					x=i-1;
					
					result[k]=arr[k][x]+1;
					flag=1;
					break;
					}
			}
			if(flag==1)
					continue;
			result[k]=arr[k][c-1]+1;
			}
		return result;
	}

	public void printData() {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	



	public static void main(String[] args) {
		int m = 0,n=0;
		q3 obj=new q3();
		obj.getData();
		obj.sortData();
		obj.printData();
		System.out.println("The minimum missing elements are:");
		for(int i=0;i<obj.minMissingElem(m,n).length;i++)
			System.out.print(obj.minMissingElem(m,n)[i]+" ");
		
		

	}

}
