package chapter_3;
import chapter_4.*;
import java.math.BigDecimal;

import static java.lang.Math.*; //可以不用加Math

public class one {
    public static final double iu = 1.12; //类常量 使用public其他类也可以使用： one.iu
    public static void main(String[] args) {
        final int PLO = 12; //final 关键字表示常量
        double x =1.98;
        int b =10;
        String a ="sxy";
        if(Double.isNaN(b)){
            System.out.println(123);
        }
        double rr = 2.0-1.1;
        System.out.println(rr);
//        System.out.println(2.0-1.);
        System.out.printf("%.1f\n",rr);
        BigDecimal reallyBig = BigDecimal.valueOf(2.000);
        BigDecimal reallyBig1 = BigDecimal.valueOf(1.11);
        System.out.println(reallyBig.subtract(reallyBig1));
        System.out.println(2.0-1.1); //二进制无法精确表示1/10
        System.out.println('\u005D');  //转义字符
        System.out.println("\u005D");
        System.out.println("u"+"005D");
        var abc ="sss";
        var sx = 12;
        enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}; //枚举类型
        Size z = Size.MEDIUM;
        System.out.println(z);
        double w = Math.pow(10,2);
        double u = Math.sqrt(4);
        System.out.println(w+" "+u);
        System.out.println(sqrt(100));
        System.out.println(-1%4);
        System.out.println(floorMod(-1,4));  //保证负数取余为正
      //  System.out.println(multiplyExact(1000000000,3));  //可以保证捕获异常，防止整数溢出
//        System.out.println(1000000000*3);
        System.out.println(1.23+12);  //二元运算符的转换
        //条件运算符 : condition? expression1:expression2
        //x<y?x:y

        //关于switch的用法，参照p42

        String we = "sxy";
        we = "lyh";
        System.out.println(we);
        System.out.println(we.codePointCount(0,we.length()));
        System.out.println(we.charAt(2));

        StringBuilder wsx = new StringBuilder();
        wsx.append(12);
        wsx.append("sx");
        System.out.println(wsx+"\n");

        //文本块实现换行  
        String greeting = """ 
                Hello
                World""";
        System.out.println(greeting);
//       Employee sui = new Employee()


    }
}
