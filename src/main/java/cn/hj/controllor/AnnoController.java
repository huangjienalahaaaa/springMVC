package cn.hj.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(){
        System.out.println("testModelAttribute执行了");
        return  "success";
    }

    //放在方法上，会先执行下面这个方法。再执行上面的testModelAttribute()方法
    @ModelAttribute
    public void showUser(){
        System.out.println("showUser方法执行了");
    }

}
