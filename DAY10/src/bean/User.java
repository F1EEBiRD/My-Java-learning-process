package bean;
//用户信息包含用户名，密码，登录名


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private String loginName;


}
