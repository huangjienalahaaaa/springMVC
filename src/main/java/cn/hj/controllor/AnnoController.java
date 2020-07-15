package cn.hj.controllor;

import cn.hj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println(user);
        return "success";
    }


/* 该方法会先执行
*  有返回值
*/
    @ModelAttribute
    public User showUser(String uname){
        System.out.println("showUser方法执行了");

        //通过用户查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        return user;
    }
}
