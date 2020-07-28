package cn.hj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 *
 * 1. implements HandlerInterceptor：一般implements一个类，都有实现它里面的额一个或几个方法，但是这里这个不需要，因为是jdk1的新特性（方法的最前面加了default）
 *      但是我们这里要重写它的方法，改怎么办呢 -> ctrl + o:
 *
 *      然后会出来三方法：
 *          1. preHandle(预处理)
 *          2. postHandle(后处理)
 *          3. afterCompletion(页面走完再走的)
 *
 */
public class MyInterceptor1 implements HandlerInterceptor {

    /**
     * 预处理：controller方法执行前执行这个方法
     * @param request
     * @param response
     * @param handler
     * @return -> return true: 放行，执行下一个拦截器。如果没有下一个拦截器了，则执行controller中的方法。
     *         -> return false: 不放行。可以使用方法中的request,response跳到别的页面。
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle拦截器执行了...");
        return false;
    }
}
