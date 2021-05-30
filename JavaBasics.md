#数据类型

##基本类型

###数值类型

####整数类型
+ byte 1个字节(range: -128,127) (1byte占用4个bit位)
+ short 2个字节(-32768, 32767)
+ int 4个字节(default)
+ long 8个字节(一般在尾部加上‘L’)
####浮点型
+ float 4个字节
+ double 8个字节(default)
####字符类型
+ char 2个字节
###boolean类型
+ boolean 1个bit位(true, false)

###引用类型
+ Class
+ Interface
+ Array

##类型转换
###转换方向
+ 低----->----->----->----->高 
+ byte,short,char -> int -> long -> float -> double
+ 注意：
    + 不能对bool类型转换
    + 不能把对象类型转换为不相干的类型
    + 高容量->低容量时，需要强制转换
    + 转换可能存在内存溢出，或精度问题
  
##变量、常量、作用域
##基本运算符
##JavaDoc生成文档
+ 命令：javadoc
###参数信息
+ @author 作者名
+ @version  版本号
+ @since 指明需要最早使用的jdk版本
+ @param 参数名
+ @return 返回值情况
+ @throws 异常抛出
####书写规范
+ idea中，在方法上方敲出 /** 后回车即可自动生成

#JAVA流程控制
##Scanner对象
##For循环

