package com.example.demo;

/**
 * com.example.demo
 *
 * @author zhaoguang
 * @date 2018/1/23 18:37
 * @description
 */
public class Test1 {
    public void fun(){
        call();

    }
    public void call(){
        StackTraceElement stack[] = Thread.currentThread().getStackTrace();
        StackTraceElement ste = stack[2];
        System.out.println("called by "+ste.getClassName()+"."+ste.getMethodName()+"/"+ste.getFileName());
    }
    public static void main(String[] args){

    }
}
