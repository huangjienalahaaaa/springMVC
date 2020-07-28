# v6.0  springMVC的异常处理 - 分析和环境搭建：



## 1. 异常处理思路 ：

. Controller调用service，service调用dao，异常都是向上抛出的，最终有DispatcherServlet找异常处理器进 行异常的处理。 

## 2. springMVC的异常处理：


### 1. 自定义异常类：

![](img/13.jpg)



### 2. 自定义异常处理器：

![](img/14.jpg)


### 3.  配置异常处理器：

![](img/15.jpg)