package test_6;

public class A {
	public void f(){
		int i,j;
		char x='A';
		for(j=0;j<2;j++){
			for(i=x;i<x+26;i++){
				System.out.printf("%c ", (char)i);
				if(i==x+25)
					System.out.println();
								}
			x='a';
			}
	}
}