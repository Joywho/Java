# mysql

### mysql语句
登陆mysql
`mysql -u root -p`
退出  
`exit`
1. 库
   1. 显示所有的库  
   `show databases;`
// mysql命令以;结束
   2. 创建一个新的库    
    `create database a;`
   3. 删除一个库  
    `drop database a;`
   4. 选择一个仓库  
    `use a;`
2. 表  
// 最基本单元
行，row 数据
列，column 字段
   1. 查看一个库中的所有表  
    `show tables;`
   2. 导入表到库  
    `source + .sql文件`
## sql语句
### 执行顺序
1. from
2. where
3. group by
4. select
5. order by

### 总分类
DQL：查询语言(select)  
DML：操作语言  
insert 增  
delete 删  
update 改  
操作表中的数据

DDL：定义语言  
create +  
drop -  
alter c  
操作表的结构  

DCL：事务控制语言  
提交 commit  
回滚 rollback  

DCL：数据控制语言  
授权 grant  
撤销权限 revoke  

#### DQL
##### 简单查询
1. 查看表中数据  
    `selsect * from 表名;`
2. 不看数据 看结构和数据类型（varchar) = java中的String  
    `desc 表名`
3. 查询一个字段  
    `select 字段名 from 表名`
4. 查询多个字段  
    `select 字段名,字段名 from 表名`
5. 查询所有字段  
    `select * from table`
    实际开发中不要用 自己可以玩玩  
    1. 效率低
    2. 可读性性差
6. 给查询的列起别名  
    `select 字段名 (as) xxx from table;`  
    别名有空格可以用单引号 'x x x'
```
select deptno,dname from dept;
+--------+------------+
| deptno | dname      |
+--------+------------+
|     10 | ACCOUNTING |
|     20 | RESEARCH   |
|     30 | SALES      |
|     40 | OPERATIONS |
+--------+------------+
select deptno as xxx,dname as 'x x x' from dept;  
+-----+------------+
| xxx | x x x      |
+-----+------------+
|  10 | ACCOUNTING |
|  20 | RESEARCH   |
|  30 | SALES      |
|  40 | OPERATIONS |
+-----+------------+
```
7. 字段可以使用数学表达式  
    `select 字段名*2 (as) xxx from table;`

##### 条件查询
   `select 字段名 from table where 条件;`  
   1. <>= 和 !=  
   `select empno eplname sal from emp where sal <= 3000 ;`
   2. is (not) null,or,and,not,in,like    
      1. and和or and优先级高 

        `where sal >2500 and deptno = 10 or deptno `  
        `// 先找出工资大于2500 并且 部门编号=10 再找 部门编号=20的所有员工  `   
        ` where sal >2500 and (deptno = 10 or deptno = 20);`  
        `  // sal>2500是前提 部门编号是10或者20都行  `  

      1. in 不是一个区间 是具体值  
        `where sal = 2500 or sal = 3000;`  
        `where sal in (2500,3000);`    

      2. like模糊搜索 % 匹配多个字符 _ 匹配一个字符 
    
```
        where name like '%0%';
        // 名字里有o 的
        where name like '%t';
        //名字以o结尾
        where name like 'k%';
        //名字以k开头的
        where name like '_a%';
        //名字第二个字母是a
        where name like '__a%';
        //名字第三个字母是a
        where name like '%\_%';
        //名字中含有'_'的
```
#### 排序
    select 字段名 from table order by 字段名;
    //默认升序 上高下地 
    order by 字段名 aso;  // 升序
    order by 字段名 desc;  // 降序
##### 多个字段排序
    order by sal asc, ename desc;
    //先按照工资升序排 工资相等 再按照名字降序排
### 数据处理函数
#### 单行处理函数
    函数(字段名)
    substr(name,1,1)
一个输入对应一个输出
1. lower 转小写
2. upper 转大写
3. substr(1,n) 取子串
4. length 取长度
5. trim 去空格
6. strt_to_date 字符串转换日期
7. date_format 格式化日期
8. concat 拼接字符串
9. round 四舍五入  
    `select round(123.456,n) `  
    `//+n为保留几位小数 -n表示保留几位整数`
10. rand() 生成随机数
11. ifnull null参与运算 结果是null
`ifnull(数据，被当作哪个值)`
12. case when than when than else end(不修改数据库，只修改查询结果)

select ename,job,  
(case job when 'manager' than sal*1.1 when 'salesaman' than sal*1.5 else sal end)  
#### 多行处理函数
`多行处理函数(列名)`
输入多行 输出一行
1. count 计数  
count(具体字段)：该字段所有不为null 的元素总数  
count(*): 每有一行 count++  
2. sum 求和
3. avg 平均值
4. max 最大值
5. min 最小值
>使用时必须进行分组 才能使用  如果没分组 整张表默认为一组  
分组函数自动忽略null  
分组函数不能用在where后面

### 分组查询
`select . from . group by .` 
selcet   后面只能写 group by 后面的 +分组函数
举例：

    select job,sum(sal)
    from emp
    goup by job;
```
+-----------+----------+
| job       | sum(sal) |
+-----------+----------+
| ANALYST   |  6000.00 |
| CLERK     |  4150.00 |
| MANAGER   |  8275.00 |
| PRESIDENT |  5000.00 |
| SALESMAN  |  5600.00 |
+-----------+----------+
```
#### having
having 在group by后使用 
不能单独使用
只有where 不能完成的 才使用having

#### distinct 去重
`select distinct . from . group by .`  

### 连接查询
1.  内连接
    1.  等值连接
    2.  非等值连接
    3.  自连接
2.  外连接
    1.  左外连接
    2.  右外连接














        

        





