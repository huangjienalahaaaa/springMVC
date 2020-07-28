package cn.hj.exception;


import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.handler.HandlerResolver;

/**
 * 异常处理器
 *
 * 1. implements HandlerExceptionResolver 继承这个类的时候，要实现它里面的方法。这个时候鼠标移到这句话上，然后，ctrl+Enter 就出来提示了
 */
public class SysExceptionResolver implements HandlerExceptionResolver {


    /**
     * 处理异常业务逻辑
     * @param request   ： 请求
     * @param response   ： 响应
     * @param handler    ：当前处理器这个对象，我们用的很少
     * @param ex          ：这个很重要，当前抛出的异常对象。就是UserController中的    throw  new SysException("查询所有用户出现错误了..."); 中的SysException对象
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//       获取到异常对象
       SysException e = null;
       if(ex instanceof  SysException){
           e = (SysException)ex;
       }else{
           e = new SysException("系统正在维护...");
       }

//       创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
       mv.addObject("errorMsg",e.getMessage()); //e.getMessage() ->  就是获取UserController中的    throw  new SysException("查询所有用户出现错误了..."); 中的”查询所有用户出现错误了...“这几个信息文字
        mv.setViewName("error"); //跳到error页面

        return null;
    }
}
