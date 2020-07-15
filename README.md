#v3.4 常用注解 - CookieValue注解

***作用：***
用于把指定cookie名称的值传入控制器方法参数

***赋值：***

value:指定cookie的名称
required:是否必须有此cookie





## 浏览器和服务器cookie和session流程：


前端发送请求  ------------------------------------------>   服务器端生成session的空间
            ---------------JSESSSIONID------------------------  服务器以cookie的形式将生成的session发送过去