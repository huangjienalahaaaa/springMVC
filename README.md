# v3.1 常用的注解-> RequestBody注解：

***作用***

用于获取请求体内容。直接使用得到是key=value&key=value...结构的数据。
get请求方式不使用（也就是get方式没有请求体，post方式有请求体。）
    
 ***属性***  
 
* required:
是否必须有请求体。默认是:true.
当取值为true时，get请求方式会报错。如果取值为false,get请求得到是Null。