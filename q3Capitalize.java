
public class q3Capitalize {

	char[] c;
	int i,j=i+1;
	int k;
	public void LetterCapitalize(String str) {
		k=str.length();
		c=new char[k];
		for(i =0;i<str.length();i++) {
			c[i]=str.charAt(i);
			System.out.print(c[i]);
		}
		
		for(i=0;i<c.length;i++) {
			if(i==0) {
				c[i]=(char)((int)c[i]-32);
				continue;
			}
			else if(c[i]==' '&&c[i+1]==' ') {
				System.out.println("NOT ALLOWED");
				System.exit(0);
			}
			else if(c[i]==' '&&c[i+1]!=' ') {
				 c[i+1]=(char)((int)c[i+1]-32);
			}
			
		
		}
	    
		System.out.println();
		for(i = 0;i<c.length;i++) {
			
			System.out.print(c[i]);
		}
		
		
	}
	public static void main(String[] args) {
		q3Capitalize obj=new q3Capitalize();
		obj.LetterCapitalize("that monkey is funny");
		

		
	}

}
