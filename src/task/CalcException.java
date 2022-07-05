package task;

public class CalcException extends Exception {
    public CalcException() {

    }

    public CalcException(String message){
        this();
        System.out.println(message);
    }
}