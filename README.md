# v4.4 响应json数据之过滤静态资源

DispatcherServlet会拦截到所有的资源，导致一个问题就是静态资源（img、css、js）也会被拦截到，从而 不能被使用。解决问题就是需要配置静态资源不进行拦截，在springmvc.xml配置文件添加如下配置 

1. mvc:resources标签配置不过滤 ：
    1. location元素表示webapp目录下的包下的所有文件
    2. mapping元素表示以/static开头的所有请求路径，如/static/a 或者static/a/b
    
    
 ```java
 <mvc:resources location="/css/" mapping="/css/**"/>  <!-- 样式 -->
 <mvc:resources location="/images/" mapping="/images/**"/>  <!-- 图片 --> 
 <mvc:resources location="/js/" mapping="/js/**"/>  <!-- javascript -->
```

2. 使用@RequestBody获取请求体数据

```java
// 页面加载
 // 页面加载
```
3. 使用@RequestBody注解把json的字符串转换成JavaBean的对

```java
// 页面加载
 // 页面加载
```


4. 使用@ResponseBody注解把JavaBean对象转换成json字符串，直接响应 
    1. 要求方法需要返回JavaBean的对象
    ```java
    // 页面加载
     // 页面加载
    ```
    2. json字符串和JavaBean对象互相转换的过程中，需要使用jackson的jar包
    
    ```java
    // 页面加载
     // 页面加载
    ```