package cn.hj.controllor;

import cn.hj.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/params")
public class ParamController {
//    请求参数绑定，把数据封装到javaBean的类中
    @RequestMapping("/saveAccount")
    public  String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
}
