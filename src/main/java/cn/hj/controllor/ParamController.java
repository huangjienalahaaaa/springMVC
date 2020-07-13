package cn.hj.controllor;

import cn.hj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/params")

public class ParamController {

    @RequestMapping("/saveUser")
    public  String saveUser(User user){
        System.out.println(user);
        return "success";
    }

}
