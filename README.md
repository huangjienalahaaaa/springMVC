# v2.4 自定义类型转换器

1.  表单提交的任何数据类型全部都是字符串类型，但是后台定义Integer类型，数据也可以封装上，说明 Spring框架内部会默认进行数据类型转换。 

2. 背景：

传来的2008/11/11，springMVC是可以转换成Date类型的。
但是如果传来的是2008-11-11的话，springMVC是不可能自己转换成Date类型的：

所以现在来讲解-> <font color="red">自定义类型转换器</font>：

3. 步骤：

、1. 在cn.hj.utils.StringToDateConverter编写转换规则
  2. 在resources/springmvc.xml文件中配置自定义类型转换器（将自己写的cn.hj.utils.StringToDateConverter定义进去）