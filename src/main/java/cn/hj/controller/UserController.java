package cn.hj.controller;


import cn.hj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){

        System.out.println("testString执行了...");

//        模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("妹妹");
        user.setPassword("123");
        user.setAge(30);

    //使用model对象存储数据
        model.addAttribute("user",user);

    //去success.jsp将值取出来
        return "success";
    }
}
