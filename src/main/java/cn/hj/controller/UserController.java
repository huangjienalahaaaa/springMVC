package cn.hj.controller;


import cn.hj.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}
