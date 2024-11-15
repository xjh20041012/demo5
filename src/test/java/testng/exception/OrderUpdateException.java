package testng.exception;
public class OrderUpdateException extends Exception {
    //异常信息
    private String message;
    //构造函数
    public OrderUpdateException(String message){
        super(message);
        this.message=message;
        System.out.println(message);
    }
}
