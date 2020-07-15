package cn.hj.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/anno")
@SessionAttributes(value={"msg"})
/*
* 1. @SessionAttribute只能作用在对象上
* 2. @SessionAttributes(value={"msg"}) 表示：把msg=妹妹存入到session域对象中（下面是把msg=妹妹存入到request域对象中）
*/
public class AnnoController {
    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
    //需求：在这个地方，向request域对象传值，当你存完了，再跳转到成功页面.然后在成功页面中，在request中将值取出来。

//        model会将值存储到request域对象中
        model.addAttribute("msg","妹妹");

        //然后可以去success.jsp去取值了
        return "success";
    }



    //上面实现了将msg存入到session中，而session是用来实现：方法之间的参数共享的，所以写了下面这个方法（把msg从session中取出来）
    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap){

        String msg = (String)modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }


    //再写一个方法，为了删掉session值
    @RequestMapping("/deleteSessionAttribute")
    public String deleteSessionAttribute(SessionStatus status){
       status.setComplete();
        return "success";
    }

}
