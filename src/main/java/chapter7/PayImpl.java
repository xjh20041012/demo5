package chapter7;

/**
 * @author dongmei.gao
 */
public class PayImpl implements PayInterface {
    /**日志*/

    /**引入外部客户端*/
    public CifClient cifClient = new CifClientImpl();

    /**
     * 支付
     * @param userId 用户id
     * @return  返回是否支付成功
     */
    public boolean pay(final String userId) {
        try {
            UserInf userInf = cifClient.userQuery(userId);
            //do some biz

            return true;
        } catch (Exception e) {
            //包含案发现场信息+异常堆栈信息

        }
        return false;
    }

    public void setCifClient(CifClient cifClient) {
        this.cifClient = cifClient;
    }
}
