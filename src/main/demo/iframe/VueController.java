package iframe;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VueController {

    @RequestMapping("/login.do")
    public String login(
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password,
            Model model
    ){
        System.out.println("username:" + username + ",password:" + password);

        //初始化
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try{
            if (username.equals("123") && password.equals("456")){
                return "index";
            }else{
                return "login";
            }
            //登陆，即身份校验，由通过spring注入的UserRealm会自动校验输入的用户名和密码在数据库中是否由对应的值
//            subject.login(token);
//            System.out.println("用户是否登陆：" + subject.isAuthenticated());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
