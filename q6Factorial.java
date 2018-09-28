import java.util.Scanner;

public class q6Factorial {
int i,fact=1;

public int getFactorial(int num) {
	for(i=num;i>0;i--) {
		fact=fact*i;
	}
    System.out.println("FACTORIAL IS");
	return fact;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		q6Factorial obj=new q6Factorial();
		Scanner scan=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
		num=scan.nextInt();
		scan.close();
		System.out.print(obj.getFactorial(num));

	}

}
