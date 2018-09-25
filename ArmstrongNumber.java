package org.cap.demo;

public class ArmstrongNumber {
	int number,i=number,d1,d2,d3,scube=0;
	public void printArmstrong() {
		 while (number <= 999)
		    {
		        d1 = number - ((number / 10) * 10);
		        d2 = (number / 10) - ((number / 100) * 10);
		        d3 = (number / 100) - ((number / 1000) * 10);
		        scube = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);
		        if (scube == number)
		        {
		           System.out.print(scube+" ");
		        }
		        number++;
		    }
		}
		
	

	public static void main(String[] args) {
		ArmstrongNumber obj=new ArmstrongNumber();
		obj.printArmstrong();

	}

}
