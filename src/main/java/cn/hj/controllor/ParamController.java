package cn.hj.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//请求参数绑定
@Controller
@RequestMapping("/params")
public class ParamController {
    @RequestMapping("/testParam")
    public  String testParam(){
        System.out.println("执行了....");
        return "success";
    }
}
