#v3.0 常用注解 - RequestParam

***作用：***
把请求中指定名称的参数给控制器中的形参赋值

***赋值：***

value:请求参数中的名称
required:请求参数中是否必须提供此参数。默认值：true。表示必须提供，如果不提供将报错


> 即：jsp的url地址传来的参数是username.但是后台接受的名称叫做uname,这个时候怎么办？就要用@RequestParam注解。