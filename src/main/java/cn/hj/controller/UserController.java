package cn.hj.controller;


import cn.hj.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 返回值类型是void
 *
 * 1. 请求转发和重定向的区别：
 *      1. 请求转发：是一次请求，不用编写项目的名称
 *      2. 重定向： 是2次请求，所以要写项目的名字
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{

// 1.编写请求转发的程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);


// 2. 重定向(相当于重新发送了一个请求)，但是请求转发程序可以直接访问/WEB-INF/下的文件，但是重定向不可以、
//       response.sendRedirect(request.getContextPath()+"/WEB-INF/pages/success.jsp"); x
//       response.sendRedirect(request.getContextPath()+"/index.jsp");

/* 3. 直接进行响应（
 上面都是：直接跳到jsp，然后通过tomcat服务器帮你生成html文件，最终响应给用户。
    但是现在又这么一个需求：
    通过输出流，直接把数据响应给浏览器
）
 */
// 设置中文乱码
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    response.getWriter().print("hello");

     return; //不想让后面的代码执行
    }
}
