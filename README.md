# v3.3 常用的注解-> HideentHttpMethodFilter：

只需要了解，不需要去写。
***作用***

由于浏览器值支持get和post请求，而delete，put,等method并不支持。Spring3.0添加一个过滤器，可以将浏览器请求改为指定的请求方式，发送给我们的控制器方法，使得支持get,post,pur与delete请求。
    
 ***使用方法***  
 
 第一步：在web.xml中配置该过滤器
 第二步：请求方式必须使用post请求
 第三步：按照要求提供_method请求参数，该参数的取值就是我们需要的请求方式。
