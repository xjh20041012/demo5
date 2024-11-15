package chapter7;

import java.io.Serializable;

/**
 * @author dongmei.gao
 */
public class UserInf implements Serializable{

    private  long serialVersionUID = 185894756693583992L;
    /**用户id*/
    public String userId ;
    /**用户名字*/
    public String name ;
    /**用户年龄*/
    public int age ;


    @Override
    public String toString() {
        return "UserInf{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age) {
        this.age = age;
    }

    /**
     * 构造体
     * @param userId 用户id
     * @param name  姓名
     * @param age 年龄
     */
    public UserInf( String userId,  String name,  int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
}
