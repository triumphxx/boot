package com.example.boot.entity;

/**
 * Created by wang on 2018/12/23.
 */
public class TestMech {

    public void test(String name){
        System.out.println("你好"+name);
    }
    private void test1(int age){
        System.out.println("今年"+age+"了");
    }

    //---------------构造方法-------------------
    //（默认的构造方法）
    TestMech(String str){
        System.out.println("(默认)的构造方法 s = " + str);
    }

    //无参构造方法
    public TestMech(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public TestMech(char name){
        System.out.println("姓名：" + name);
    }

    //有多个参数的构造方法
    public TestMech(String name ,int age){
        System.out.println("姓名："+name+"年龄："+ age);//这的执行效率有问题，以后解决。
    }

    //受保护的构造方法
    protected TestMech(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private TestMech(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }
}
