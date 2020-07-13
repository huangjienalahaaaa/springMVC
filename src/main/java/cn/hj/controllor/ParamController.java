package cn.hj.controllor;

import cn.hj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/params")

public class ParamController {

    @RequestMapping("/testServlet")
    public  String testServlet(HttpServletRequest request, HttpServletResponse response){


        System.out.println(request);

    /*
    * request.getSession()获取方式的区别:
    *
    * 1. 三种情况如下
    *       HttpSession session = request.getSession();
    *       HttpSession session = request.getSession(true);
    *       HttpSession session = request.getSession(false);
    *
    * 2. 三种情况之间的差异:
    * 这样的，前者会检测当前时候有session存在，如果不存在则创建一个，如果存在就返回当前的。
    * getSession()相当于getSession(true)，
    *
    * 参数为true时，若存在会话则返回该会话，否则新建一个会话
    * 参数为false时，若存在会话则返回该会话，否则应该返回一个NULL
    *
    * 3. 具体的使用场景:
    *   当向Session中存取登录信息时，一般建议：HttpSession session =request.getSession();
    *   当从Session中获取登录信息时，一般建议：HttpSession session =request.getSession(false);
    * */
        HttpSession session = request.getSession();
        System.out.println(session);


        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);


        System.out.println(response);
        return "success";
    }

}
