package chapter7;

/**
 * @author dongmei.gao
 */
public interface PayInterface {
    /**
     * 支付
     * @param userId 用户id
     * @return  返回是否支付成功
     */
     boolean pay(String userId);
}
