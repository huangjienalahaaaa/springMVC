package cn.hj.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//请求参数绑定
@Controller
@RequestMapping("/params")
public class ParamController {
    @RequestMapping("/testParam")
    public  String testParam(String username,String password){
//        一般情况下，零散的属性是可以这样子做的，但是如果如果url跟的参数比较多的话，一般都是封装成java Bean来做的,请看v2-1
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
}
