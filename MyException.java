package test_9;

public class MyException extends Exception{
    public MyException(String s){
        super(s); //调用父类的构造方法
    }
    public MyException(){
        this("");
    }
}
