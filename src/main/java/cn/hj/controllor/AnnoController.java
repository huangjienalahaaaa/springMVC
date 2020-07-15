package cn.hj.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("testRequestParam")
    public String testRequestParam(@RequestParam(name="username") String uname){
        System.out.println(uname);
        return  "success";
    }
}
