package com.cpucode.java.getting.started;

/**
 * 题目描述
 * KiKi学会了printf在屏幕输出信息，他想输出一架小飞机。请帮他编写程序输出这架小飞机。
 * 输入描述:
 * 无
 * 输出描述:
 *       **
 *       **
 *  ************
 *  ************
 *      *  *
 *      *  *
 *
 * @author : cpucode
 * @Date : 2021/1/8
 * @Time : 19:25
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Bc6 {
    public static void main(String[] args){
        test1();

        //test2(2);
    }

    private static void test1(){
        System.out.println("     **     ");
        System.out.println("     **     ");
        System.out.println("************");
        System.out.println("************");
        System.out.println("    *  *");
        System.out.println("    *  *");
    }

    private static void test2(int num){
        int i;

        for(i = 0; i < num; i++){
            System.out.println("     **     ");
        }
        for(i = 0; i < num; i++){
            System.out.println("************");
        }

        for(i = 0; i < num; i++){
            System.out.println("    *  *    ");
        }
    }
}
