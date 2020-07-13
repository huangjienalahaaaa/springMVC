package cn.hj.controllor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="user")

public class HelloController {
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "success";
    }
    @RequestMapping(path="/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("测试testRequestMapping注解");
        return "success";
    }
}
