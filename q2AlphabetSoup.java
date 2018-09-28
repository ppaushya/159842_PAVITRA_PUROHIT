

public class q2AlphabetSoup {

char[] c;
char temp;
int i,j;
int k;

	public void AlphabetSoup(String s) {
		k=s.length();
		c=new char[k];
		for(i = 0;i<s.length();i++) {
			c[i]=s.charAt(i);
			System.out.println(c[i]);
		}
		for(i=0;i<s.length();i++) {
			for(j=i+1;j<s.length();j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println();
		for(i = 0;i<s.length();i++) {
			
			System.out.print(c[i]);
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2AlphabetSoup obj=new q2AlphabetSoup();
		obj.AlphabetSoup("pavitra");
		

	}

}
