package cn.hj.controller;


import cn.hj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();

        //模拟从数据库中查询User对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);

    // 把user对象存储到对象中，也会把user对象存入到request对象
        mv.addObject("user",user);
        mv.setViewName("success");


        return mv;
    }
}
