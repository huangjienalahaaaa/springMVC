package cn.hj.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    //获取到请求体的内容
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }
}
