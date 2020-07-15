package cn.hj.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

//获取Cookie的值
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(name="JSESSSIONID") String cookieValue){
        System.out.println(cookieValue);
        return  "success";
    }
}
