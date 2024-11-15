package chapter7;

/**
 * @author dongmei.gao
 */
public class CifClientImpl implements CifClient {
    /**
     * 查询用户
     * @param userId
     * @return 用户信息
     */
    public UserInf userQuery(String userId) {
        //call  other system service

        return new UserInf("2088XXX","gaodongmei",18);
    }
}
