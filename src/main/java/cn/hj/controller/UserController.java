package cn.hj.controller;


import cn.hj.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("testException")
    public String testException() throws Exception{
        /**
         * 1. 对某些语句写if,if...else,do/while,try...catch等话：选中这段话，然后ctrl+alt+t
         */

        //模拟异常
        try {
            int a = 10/0;
        } catch (Exception e) {
            //下一行代码表示，在控制台打印异常信息
            e.printStackTrace();

            //向上抛出自定义异常信息
            throw  new SysException("查询所有用户出现错误了...");
        }

        return "success";
    }
}
