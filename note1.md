### 固定开头
`public static void main(String[] args){`

### 转义字符
- \t 制表符 实现对齐
- \n 换行符
-  \ \  一个\
-  \" 一个"
-  \' 一个'
-  \r 一个回车


### 注释
// 单行注释
/*
多
行
注
释
*/

### 文档注释
/**
*name
*version
*/

### 数据类型
#### 基本
- 整数 byte[1] shor[2] int[4] long[8]
- 浮点 float[4] double[8]
- 字符 char[2]
- 布尔 boolean[1] //true false
##### 引用
- 类 class
- 接口 interface
- 数组 []

##### 转换
- byte short char三者不能互相转换
- 三者进行运算 自动转换int

### 算术运算符
% 取余  11%9     2
++ 前 先运算后取值
++ 后 先取值后运算
int k=++j 先 j=j+1 后 k=j
-- 前 先运算后取值
-- 后 先取值后运算
int i=1
i=++i 1  

int i=1
i=i++ 2

10/4  2
10.0/4  2.5
double d=10/4 2.0
a % b =a - a / b * b
10%3  1
-10%3 -1
10%-3 1


### 关系运算符
== 判断相等于 输出true false
boolean

### 逻辑运算符
a&b 逻辑与 同为真 则真 否则假
a&&b 与上相同
区别
a&&b  a为false b不再执行判断
a&b   a为false 判断执行
int a=4
int b=9
if(a<10 && ++b<50>)  b执行 b=b+1
print(a=4 b=10)
开发中 &&使用较高

a|b 逻辑或 有真 ture
a||b 短路或 同上
区别
a||b a为true b不再判断执行
a|b  a为true b会判断执行
int a=4
int b=9
if(a<10 || ++b<50>)  b执行 b=b+1
print(a=4 b=10)
开发中 ||使用较高

!^
(10>5) true
!(10>5) false

a^b  逻辑异或  a T b F or a F b T 为true 

### 赋值运算符
a+=b  a=a+b
a-=b  a=a-b

### 三元运算符
条件表达式？表达式1:表达式2；
表达式true 输出表达式1结果
表达式false 输出表达式2的结果
例子
```
int a = 10；
int b = 99；
int result = a > b ? a++ : b--;
```
### 进制转换
2转10
模2除 取余 由下到上
10转8
模8除 取余 由下到上


### java扫描器
```
import java.util.Scanner;
Scanner scannername = new Scanner(System.in);
```
### 字符串比较
`String.equals(Stringname)`

### 分支
```
if else
switch key{
case  123：
xxx
break；
}
```
### 类与对象
(对象[属性,
    行为])
class 类名{
    
}

### 封装
- 属性私有化           | private 数据类型 变量名
- 提供公共方法set方法  | public void set变量名(数据类型 参数名)
- 提供公共get方法      | public void get变量名()

### 继承
解决代码复用性
public class child extends father
#### super()
默认调用父类构造器
根据参数个数选择父类构造器

### 重写（覆盖）
子类同方法覆盖父类同方法

### 多态
方法的多态（重写和重载）

对象的多态
- 编译类型和运行类型可以不一样
- 编译类型在定义对象时确定 不能更改
- 运行类型可以变化
- = 左边 编译类型  = 右边 运行类型
Animal animal   =   new Dog();
编译类型 Animal    运行类型 Dog
animal = new cat()
运行类型从dog -> cat

#### 编译类型 运行类型
属性
属性没用重写
属性的值看编译类型

方法
表面编译类型 实际运行类型
```
animal{
    animalcry
}
dog{
    dogcry
}

- Animal animal = new dog();
animal.cry()  // dogcry

- ainmal animal = new animal();
animal.cry() // animalcry
```
#### 向上转型
感觉是继承的默认
Animal animal = new dog()
父类类型 引用名 = new 子类类型() // 本类——>父类
javac       ——>     java
能调用父类所有成员（遵守访问类型）
不能用子类特有成员

#### 向下转型
子类类型 引用名 = new 子类类型()
父类调用子类方法
```
- animal{}
cat extends animal{
    catchmouse()
}
animal{
cat cat = (cat) animal；
cat.catch animal
}
```
#### instanceof
```
class A{}
class B extends A{}
判断对象的运行类型是否为某类型或者某类型的子类型
main{
    B b = new B()
    b的运行类型（B）是否为B运行类型
    b instanceof B //true
    b的运行类型（B）是否为A运行类型的子类型
    b instanceof A //true
}
```
#### **动态绑定机制**
调用对象方法与对象运行类型绑定
调用对象属性 没用绑定机制 看编译类型
```
Animal animal   =   new Dog();
编译类型 Animal 引用名 animal = new 运行类型 Dog
class A{
    a = 1
}
class B extends A{
    a = 2
    b(){
        return a
    }
}

main{
    B b= new A() 
    b.b() // 属性无绑定 看编译类型 A {a = 1} ->B {return a}
}
```


### == 与 equals 
== 比较运算符
判断基本类型的值是否相等 `int a = 10, double b = 10.0, a == b;`
判断引用类型的物理地址是否相等 
equals 是object类中的方法 只能判断引用类型
String（判断字符串相等不） 和 Integer判断里面的数值是否相等 会重写equals
    a.Integer（1）.epuals(b.Integer(1)) //ture
    a.name.equals(p2.name) // ture


### hashCode()
哈希值 同一个对象哈希值相同 每一个不同对象都有不同哈希值（10进制）
```
AA aa1 = new AA();
AA aa2 = new AA();
AA aa3 = aa1;
aa1.hashcode() != aa2.hashcode();
aa1.hashcode() = aa3.hashcode(); 
```
### toString()
```
main(){
    System.out.println(A.toString()+monster.hashCode());
    // 输出 A类所在的包和A的类名A和16进制的哈希码 + 10进制哈希码
    System.out.println(A)
    // 输出A类所在的包和A的类名A和16进制的哈希码
}
class A{
    name
    id
}
```
对toString()重写  输出你想返回的属性
```
public String toString(){
    return "A{"+"name="+name+"id="+id+"}";
}
```
### finalize()
垃圾回收时自动调用finalize()
对象没有任何引用 垃圾回收器会回收对象

    main(){
        Car car = new Car();
        car = null;     //car对象没有任何引用 垃圾回收器会回收对象 回收finalize()
    }
    class Car{
        name    
    }

重写finalize
```
@override
    public void finalize() throws Throwable {
        System.out.print("这不是默认finalize()方法")
    }
    System.gc();    //主动调用垃圾回收器
    // 输出 这不是默认finalize()方法
```


### date
    date = new date();
    simpledate sd = new simpledate("yyyy-mm-dd")

### 访问修饰符
|         | 本类  | 同包  | 子类  | 不同包 |
| :-----: | :---: | :---: | :---: | :----: |
| public  |   ✔   |   ✔   |   ✔   |   ✔    |
| protect |   ✔   |   ✔   |   ✔   |        |
| default |   ✔   |   ✔   |       |        |
| private |   ✔   |       |       |        |
>default 子类与本类在同包之内可以访问 不同包不能够访问

### 分层模式
view 界面
service 业务层
domain 数据层
utility 工具类
App main(){程序入口

1. 先准备在utils类里写需要的工具类  
>后续可以继续往里加入工具类
2. 明确功能->思路分析—>代码实现
   1. 先实现界面菜单menu
      1. mainmenu方法显示界面
      2. 在app.java 调用mainmenu方法
      3. listhouse方法显示房屋列表界面
      4. 
### static 
static本类中所有对象共享（访问时得到同一个值，修改时 修改的同一个变量）。
![](/img/note1/2022-06-18-11-41-28.png)
jkd8以及之前 static放在方法区中的静态域 jdk8以后放在堆中(class对象) 
类变量是类加载时生成类的class对象。没有创建对象实列也可以访问。
```
main(){
    // 两种方式访问
    // 类名.类变量名
    A.name1; // a  recommend;
    A.name2; // err!
    A.name3; // err!
    // 对象名.类变量名
    A a = new A();
    a.name1; // a;
    a.name2; // b;
    a.name3; // err!
}
class A{
    public static String name1 = "a";
    private static String name3 = "c";
    // 静态变量也需要遵守访问修饰符 public——>static 会访问不到类变量
    public String name2 = "b";
    // 非静态通过对象实列访问
}
```
>静态类方法与上面类似（静态方法= 类方法）
>静态方法不能使用this. 普通方法默认隐藏this super.也一样
>静态方法 只能访问静态变量和静态方法

### main()
1. main()虚拟机调用
2. java虚拟机和main()不同类
   1. 虚拟机调用main() 访问权限必须是public
   2. 虚拟机执行main() 必须是static
3. 代码理解main() String
```
public class test {}
public static void main(String args[]){
    // 传入 arg[] 数组参数
    for(int i = 0;i < args.length;i++){
            print(arg[i])
    }
}
javac test.java &&java test a b c
// abc
```
4. mian()属于静态方法 
   1. 可以访问本类中的静态变量和静态方法
   2. 访问非静态变量和方法，需要要创建和调用对象

### 代码块
1. {}  
2. [修饰符 = static]{}
不同构造器中重复代码可以写入代码块
构造器调用时，优先调用代码块中的内容

#### 类的加载
1. 创建对象实列(new)
2. 创建子类对象实例，父类也会被加载
3. 使用类的静态成员(静态属性 静态方法)
4. 创建一个对象，在一个类调用顺序是
   1. 先调用静态代码块和静态属性初始化 多个时按照定义的顺序调用
   2. 后调用普通代码块和普通属性初始化 多个时按照定义的顺序调用
   3. 调用构造方法
```
main1(){
    A a = new A();
    //get
    //B代码块被a执行 父类优先被加载
    //A代码块被a执行
    //普通A代码块被a执行
    A b = new A();
    //普通A代码块被b执行
    println(A.a1) 
    //123
    println(a.a1) 
    // 123
    // static 代码块类加载时加载 只加载一次
    // 普通代码块 调用几次加载几次 但使用静态成员时 不会执行普通代码块
}
main2(){
    A a = new A(){

    }
}

class A extends B{
    public static a1 = geta1();
    static {
        public static int a1 = 123;
        print(A代码块被a执行);
    }

    {
        print(普通A代码块被a执行);
    }
    public static int geta1(){
        print(geta1被执行)
        return 123;
    }
}
class B {
    static {
        print(B代码块被a执行)
    }
}

