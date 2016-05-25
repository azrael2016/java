package test_6;

public class B extends A{
	public void g(){
		int i,j;
		char x='¦¡';
		for(j=0;j<2;j++){
			for(i=x;i<x+24;i++){
				System.out.printf("%c ", (char)i);
				if(i==x+23)
					System.out.println();
								}
			x='¦Á';
			}
	}
}
