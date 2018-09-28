import java.util.Scanner;

public class q8Anagram {
	int i,j,count;
	char[] c1;
	char[] c2;
	boolean c;
	public boolean isAnagram(String str1,String str2) {
		c1=new char[str1.length()];
		c2=new char[str2.length()];
		
		
		
		
		if(str1.length()!=str2.length()) {
			System.out.println("NOT ANAGRAM");
			System.exit(0);
		}
		for(i = 0;i<str1.length();i++) {
			c1[i]=str1.charAt(i);
			System.out.print(c1[i]);
		}
		System.out.print(" ");
		for(i = 0;i<str2.length();i++) {
			c2[i]=str2.charAt(i);
			System.out.print(c2[i]);
		}
		for(i=0;i<str1.length();i++) {
			for(j=0;j<str2.length();j++) {
				if(c1[i]==c2[j]) {
					count++;
				}
			}
		}
		if(count==str1.length())
			c=true;
		else
			c=false;
		
		System.out.println();
		
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		q8Anagram obj=new q8Anagram();
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE STRING1:");
		str1=scan.nextLine();
		System.out.println("ENTER THE STRING2:");
		str2=scan.nextLine();
		scan.close();
		System.out.print(obj.isAnagram(str1,str2));

	}

}
