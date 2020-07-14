# v3.2 常用的注解-> PathVaribale：

***作用***

用于绑定url中的占位符(也就是：可以获取占位符的值)。例如:请求url中/delete/<font color="red">{id}</font>,这个<font color="red">{id}</font>就是url占位符。
url支持占位符是spring3.0之后加入的。是springMVC支持rest风格URL的一个重要标志。
    
 ***属性***  
 
value:用于指定url中占位符名称
required:是否提供占位符




# Restful编程风格的URL:


```java
1. 原来的风格：

* UserController类

        path="/user/save"
        save
        
        path="/user/update"
        update

        path="/user/findAll"
        findAll

-----------------------------------

2. restful的方式：

* UserController类

    path="/user" post
    save

    path="/user" put
    update

    path="/user" get
    findAll
        -> localhost:8888/user get     


    path="/user/{id}" get
    findById(id)
        -> localhost:8888/user/10 get   

```




1. 请求路径一样，可以根据不同的请求方式去执行后台的不同方法
2. restful风格的URL优点：
    1. 结构清晰
    2. 符合标准
    3. 易于理解
    4. 扩展方便