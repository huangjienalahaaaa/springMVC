#v3.5.2 常用注解 - ModelAttribute注解(修饰参数) - 有返回值

比如说这个项目的User类中，有三个属性：
uname,age,date

但是index.jsp中的表单只提交了了uname,age字段。
那么AnnoController会将这2个赋值给User类中的uname,age字段，但是date字段 = null。

此时我们想将date字段 = 数据库里原来的date值



***实现：***
有2种写法：
1. 有返回值
2. 没有返回值