package org.cap.demo;

public class PrimeNumbers {
	int i,j,count;
	public void printNumbers() {
		for(i=1;i<=1000;i++) {
			count=0;
			for(j=1;j<=1000;j++) {
				if(i%j==0) 
					count++;
				
			}
			if(count==2)
				System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		PrimeNumbers obj=new PrimeNumbers();
		obj.printNumbers();

	}

}
