# JSON  
1. JSON概述
JSON是一种轻量级的数据交换格式。  
采用完全独立于编程浯言的文本格式来存储和表示数据（不单单ava编程浯言可以使用jSON，其它编程浯言也可以使用jSON）。  
JSON具有简洁和清晰的层次结构易于人阅读和编写。  
同时也易于机器解析和生成，并有效地提升网络传输效率。  
我们常用前端和后端的数据交换格式：HTML，XML，JSON。  
2. JSON格式  
   {犍：值，犍：值}
   {"key1"：valuel，"key2"：vaIue2，"key3"：vaIue3}
4. JSON的key和value的数据类型
   1. JSON的key的类型固定为String类型
   2. JSON的value类型可以是JS中已有的数据类型
Number：数字字1，2，3  
String:字符串"abc"'def'  
BooIean:true/false  
undefined：变量未定义/未初始化  
null：引用变量未指向任何对象  
对象：数组对象，JSON对象(JSON嵌套JSON），new0bject()  
1. 常见的JSON数据格式  
   1. JSON中只含有基本的值对  
    {"name"："张二,"age"：13，t'isMarriedtt：false，"email":undefined,"address"：nuII,"Obj"：newObject()}  
    通过JSON对象，key的方式来取出对应的value值