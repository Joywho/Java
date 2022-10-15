# 软件架构
1.   c/s架构(CIient-Server)
    需要用户在本地硬盘安装一个客户端程序，例如：QQ，360，百度云盘  
    优点：  
     1.   界面可以做的很好看，用户体验好
     2.   软件的部分运算以及数据存储放在客户端完成，节约服务端资源
    缺点：
     1.  需要使用用户的磁盘空间
     2.  每次升级，需要用户下载新的版本
2. B/S架构(Browser-Server)
    有了浏览器就相当于有了一切的软件，例如：网页版微信，网页版百度云盘  
    优点：
     1.  用户无需在本地硬盘安装应用程序，需要由浏览器即可  
     2.  用户无需关系软件升级问题，由服务端自动完成  
    缺点： 
   1. 网页做的越复杂，对网络要求越  
   2. 对服务器要求比较高，需要服务端大量的资源，增加服务端的压力
# Web资源
web：狭义来说指的一个个网页，广义来说指的是各种互联网技术  
静态资源：网页中始终不变的数据：HTML，css，JS，图片，音频等  
动态资源：由服务端的程序为浏览器生成的数据，我们访问的动态资源，本质上访问是服务器上的一段程序  
在不同的国家访司同一个页面，显示该地区语言的页面  
# 服务器概述
1. 硬件层面  
服务器指的是一台CPIJ和内存等配置很高的电脑  
2. 软件层面  
我们需要在电脑上安装服务器相关的软件，这台电脑就可以作为服务器  
# web服务器
1. JavaEE：包含一些JavaEE规范（接口），例如：servlet，jdbc，jsp，javamail等等,Javaweb服务器实现了这些规范  
2. 常见web服务器  
    Tomcat：Apache组织提供的免费开源小型服务器软件，支持servlet和JSP规范    
    WebLogic：公司一个收费大型服务器软件，支持所有的JavaEE规范    
    WebSphere：IBM公司一个收费大型服务器软件，支持JavaEE所有规范    
3. jvaweb项目和web服务器关系  
Java web项目一一部署一一>web服务器一一实现一>JavaEE规范  
# Web动态资源标准目录结构
项目名称：目录  
    静态资源：HTML，CSS，JS  
    WEB-INF：目录不能通过浏览器直接访问（必须）   
    web.xml：当前web项目中的核心配置文件(Servlet2·5规范必须由，Servlet3·0可以省略web.xml)  
    lib：目录当前web项目使用的第三方jar包（可选）  
    classes:目录Java源码编译后生成的class文件存放的位置  
# Tomcat服务器
1. Tomcat安装与配置
配置：我们需要在环境变量配置Java-Home  
安装：解压完就可以使用  
注意Tomcat版本对应的JDK版本    
2. Tomcat目录结构  
bin目录：存放了一些可执行脚本  
例如:startup.batwindows下的tomcat的启动脚本  
conf目录：存放了很多配置文件  
server.xml：核心配置文件   
tomcat-users·：用户权限配置文件  
web.xml：所有web项目通用配置文件  
lib目录：存放了很多jar包，tomcat和web项目所使用的jar包  
logs目录：存放很多日志文件，便于我们日后查看tomcat运行信息，以及错误信息  
temp目录：临时文件目录  
webapps目录：存放了很多web应用，将来可以把web项目部署到下（放在webapps下面）  
work目录：tomcat处理JSP的工作目录  

## 将Tomcat整合到IDEA中
1. 解压一份新的tomcat  
2. 在IDEA中配置tomcat  
## 在工DEA中新建web项目
1. web项目目录结构
src：存放我们将来写的java代码（服务端程序）  
web：虚拟的目录，将来将web项目部署到时候是不存在这个目录的，，，js，jsp都放在web下面  
WEB—INF  
lib：需要手动创建   
classes：这个无需创建，将来我们把项目部署到。上的时候，会自动创建目录，并且把整个项目编译的文件存放到该目录下  
web.xml：自动生成
2. 将这个web项目部署到Tomcat上  
   1. 部署细节  
    在输出日志中UsingCATALINA-BASE对应的路径下，将我们tomcat配置拷贝一份放在这个路径下
    一个项目对应一个tomcat配置   
    在CATALINA_BASE/conf/CataIina/localhost下会新建一个day@8—web·xml的配置
    里面就有虚拟路径和真实路径映射  
    <Contextpath="/day@8—web"docBase=t'F：\OneDrive..> 
# http 
1. HTTP协议概述  
http是一个简单的请求一响应协议，它通常运行在TCP之上。它指定了客户端可能发送给服务器什么
2. HTTP协议作用  
HTTP协议规定了客户端（浏览器）和服务端之间传输数据的规范  
3. HTTP协议的特点
   1. 基于请求一响应的模型
   2. 先请求后响应并且一个请求对应一个响应
   3. HTTP协议默认的端口号：80，可以省略
4. HTTP协议版本  
HTTP/1.0：默认采用短连接模式，每次响应完立马关闭连接    
HTTP/I.1：默认采用长连接模式，每次响应完，并不是立刻关闭，而是等待一段时间后，再关闭连接    
5. HTTP协议组成  
HTTP请求部分：请求行，请求头，请求体  
HTTP响部分：响应行，响应头，响应体

