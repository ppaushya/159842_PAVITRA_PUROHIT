
public class q5ReverseString {
	int i,j;
	char[] c;
	char temp;
	public char[] ReverseOrder(String str) {
		c=new char[str.length()];
		for(i = 0;i<str.length();i++) {
			c[i]=str.charAt(i);
			System.out.print(c[i]);
		}
		for(i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			
		}
		System.out.println();
	//	for(i = 0;i<str.length();i++) {
			
		//	System.out.print(c[i]);
	//	}
		
		
		return c;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q5ReverseString obj=new q5ReverseString(); 
	    System.out.print(obj.ReverseOrder("HELLO WORLD"));
		

	}

}
