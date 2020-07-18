package cn.hj.controller;


import cn.hj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testAjax")

    //@ResponseBody注解，将User对象转成json的字符串
    public @ResponseBody User testAjax(@RequestBody User user){
    //客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
    //做响应，模拟查询数据库
        user.setUsername("haha");
        user.setAge(40);

        return user;
    }
}
