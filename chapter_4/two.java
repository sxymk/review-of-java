package chapter_4;

import java.util.Random;

public class two {
    public static void main(String[] args) {
        int a = 0;   //方法中局部变量必须初始化
        System.out.println(a);
        range b = new range(3,4);
        System.out.println(b.distanceFromOrigin());
    }
}


//record申明的类，具备这些特点：
//
//        它是一个final类
//        自动实现equals、hashCode、toString函数
//        成员变量均为public属性
record range(int x, int y){
    public range(){

        this(0,0);
        System.out.println(11);
    }
    public double distanceFromOrigin(){
        return Math.hypot(x,y);
    }


}