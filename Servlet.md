# Servlet
1. ServIet概述  
servlet是JavaEE规范其中之一，它是运行在web服务端的小型Java程序，本质上就是我们自己编写的Java类   
2. servlet作用  
servlet可以用来处理客户端（浏览器）请求，响应给浏览器动态资源  
3. 编写servlet步骤
    1. 在工程或模块中引入相关的jar包，该jar包叫servlet-api.jar    
    当配置完tomcat的时候，会自动新建一个库，这个库中包含两个j包：，相关的jar包    
    每次创建Javaweb工程的时候会自动引入这个库  
    2. 定义一个j类，这个类需要实现jar接口，实现这个接口中的方法  
    在service方法中书写代码   
    3. 在web.xml中注册这个service
