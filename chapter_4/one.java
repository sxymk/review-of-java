package chapter_4;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class one {
    public static void main(String[] args) {
//        System.out.println(new Date());  //对象
////         String a =new Date().toString();
//        Date a = new Date();
//        System.out.println(a);
//        Date startTime; //对象变量，要想使用必须初始化
////        startTime = new Date();
//        startTime = a; //对象变量引用同一个对象

//        LocalDate b = LocalDate.now();  //不需要使用new来构造，直接使用.now
//        System.out.println(b);
//        System.out.println(LocalDate.of(2002,2,1));
//        int year =b.getYear();
//        //var可以有效避免重复写类型名; 但是var只能用于方法中的局部变量，参数和字段的类型必须声明。
//        var c = LocalDate.of(1998,1,1);

//        LocalDate a;
//        a = null;
////        System.out.println(a.toString());  定义一个类最好清楚哪些字段为null（不用担心基本数据类型）
//        Objects.requireNonNull(a,"拒绝null");

        // ！！！其实每个方法都会带有隐式字段this，其实可以使用只是你看不见p111

        Employee a = new Employee(1,12);
        Employee b =new Employee(1,12);
        System.out.println(a==b);
//        a.
        int m =-2;

        System.out.println(Math.abs(m));
//        System.out.println(7);

//        for (int i = 10; i >1 ; ) {
//            i--;
//        }
        
    }
}
