package test_9;

public class MyException extends Exception{
    public MyException(String s){
        super(s); //���ø���Ĺ��췽��
    }
    public MyException(){
        this("");
    }
}
