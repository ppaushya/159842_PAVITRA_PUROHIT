package org.cap.demo;

public class StringCharacters {
	String sample="hello";
	int i,j;
	char c;
	public void getPattern() {
		for(i=0;i<sample.length();i++) {
			
		  for(j=0;j<=i;j++) {
				char c=sample.charAt(j);
				System.out.print(c+" ");
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
        StringCharacters obj=new StringCharacters();
        obj.getPattern();

	}

}
