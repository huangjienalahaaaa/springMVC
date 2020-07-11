package cn.hj.controllor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller
@RequestMapping(path="user") /*
RequestMapping属性解说：
1. = @RequestMapping(value="user") =@RequestMapping("user")
2. method（请求方式）：
    @RequestMapping(path="user",method={RequestMethod.POST})
3. params(限制请求参数的条件。它支持简单的表达式-> 要求请求参数的key和value必须和配置一模一样)。
    例如：
        params = {"accountName"},表示请求参数必须有accountName
        params = {"accountName=123"},表示请求参数accountName必须要有，且必须等于123
        params = {"money!100"},表示请求参数中money不能是100
4. headers（限制请求头的条件）：
    例如：
    headers={"Accept"}  表示，请求头headers中必须要有Accept属性
注意：
以上四个属性只要出现2个或以上时，他们的关系是与的关系。
*/
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
