package test_9_2;

public class DangerException extends Exception{ 
 	String message; 
 	public DangerException(){ 
message="Σ��Ʒ��";
} 
 	public void toShow(){ 
System.out.print(message+""); 
 	} 
} 
