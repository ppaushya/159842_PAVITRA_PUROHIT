
public class q4ChangeLetters {
int i,j;
char[] c;
public void LetterChanges(String str) {
	c=new char[str.length()];
	for(i = 0;i<str.length();i++) {
		c[i]=str.charAt(i);
		System.out.print(c[i]);
	}
	for(i = 0;i<str.length();i++) {
		if(c[i]=='z')
			c[i]='a';
		else
		c[i]=(char)((int)c[i]+1);
	}
	for(i = 0;i<str.length();i++) {
		if(c[i]=='a'||c[i]=='e'||c[i]=='o'||c[i]=='u') {
			c[i]=(char)((int)c[i]-32);
		}
	}
	System.out.println();
	for(i = 0;i<str.length();i++) {
		
		System.out.print(c[i]);
	}
	
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q4ChangeLetters obj=new q4ChangeLetters();
		obj.LetterChanges("pavitraz");
		
	}

}
