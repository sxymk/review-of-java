package chapter_3;

import java.io.Console;
import java.lang.System;
import java.math.*;
import static java.lang.Math.*; //可以不用加Math

import java.util.Arrays;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //读取密码用Console类
//        Console cons = System.console();
//        String username = cons.readLine("User name: ");
//        char [] password = cons.readPassword("Password: ");

        //打印的问题
//        double a = 10000000.0/3.0;
////        System.out.println(a);
//        System.out.printf("%7.2f\n",a);  //字符宽度为7，保留两位小数,延用了c语言的输出
//        System.out.printf("%,.2f\n",a);
//        int x = in.nextInt();
//        //代码更清晰
//        if(x<=0){if(x==0) System.out.println(123);else System.out.println(456);}else System.out.println(789);

        //大数  (处理不同数组的精度问题）

//        BigInteger reallyBig = BigInteger.valueOf(10330);   //普通数转换为大数
//        int we = 100;
//        System.out.println(reallyBig);
//        BigInteger r = new BigInteger("12768638976572991727389172930182873893423411332");
////        BigInteger c = r.add(we);  不可以
//        BigInteger c = r.add(reallyBig);
//        System.out.println(r);
//        System.out.println(c);

        //数组一经创建就不可以改变它的大小
//        int [] a ={1,2,3,4,5,6,7};
//        int [] b =a;  //数组拷贝，数组b指向同一位置 p82
//        b[4]=8;
//        System.out.println(a[4]);
//        //数组值拷贝
//        int []c = Arrays.copyOf(a,a.length);
//        System.out.println(Arrays.toString(c));

//        if(args.length==0||args[0].equals("-h"))
//            System.out.println("Hello!");
//        else if(args[0].equals("-g"))
//            System.out.println("Goodbye");
//        // print the other command-line arguments
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(" "+args[i]);
//        }
//        System.out.println("!");
//
//       int a =  (int)(random()*10);

        String a ="sxw";
        String b =a;
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        
    }
}
