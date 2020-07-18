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
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){

    //1. 请求转发(使用关键字的方式，这种方式不能使用视图解析器)，下面是固定格式
    //return "forward:/WEB-INF/pages/success.jsp";

    //2. 重定向(还是一样的问题，重定向不能访问/WEB-INF目录以及下面的所有文件，但是可以访问webapp/index.jsp文件)
        return "redirect:/index.jsp";
    }
}
