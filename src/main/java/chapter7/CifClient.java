package chapter7;

/**
 * @author dongmei.gao
 */
public interface CifClient {
    /**
     * 查询用户
     * @param userId
     * @return 用户信息
     */
    UserInf userQuery(String userId);
}
