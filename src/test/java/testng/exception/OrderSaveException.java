package testng.exception;

public class OrderSaveException extends Exception {
    //异常信息
    private String message;
    //构造函数
    public OrderSaveException(String message){
        super(message);
        this.message=message;
        System.out.println(message);
    }
}
