package chapter_5;

import java.util.Arrays;

public class one {
    /* final 类和方法不允许被继承
    如果一个类声明为final， 其中方法成为final类，但是不包括实例字段
     */

    /*
    instanceof的用法: 强制类型转换  //最好少使用强制类型转换
    if(staff[i] instanceof Manager boss)  //java16 新特性，跳过强制类型转换  p173
    {
      boss = (Manager) staff[i];
      ...
     }
     */

    /*
    protected类型代表受保护权限，只有子类才可以访问其方法和字段，与private不同(只能由同一个包中的类访问）
     */

    /*
    改写equals方法
    public boolean equals(Object otherObject)
    {
        if(this ==otherObject) return true;
        if(otherObject ==null) return false;
        //如果equals的语义可以在子类中改变，就使用getClass检测：
        if(getClass()!= otherObject.getClass()) return false
        ClassName other = (Classname) otherObject;
        //如果所有的子类都有相同的语义，就使用 instanceof 来检测
        if(!(otherObject instanceof Classname other) return false //如果检测成功other自动可用
        //最后比较 基本类型用== ，其他用Objects.equals来比较对象字段
        return field1 ==other.field1&& Object.equals(field2,other.field2)&&...

     */


    /*
    hashCode: 如果x和y是两个不同的对象，两者hashCode基本不会相等
    public int hashCode()
    {
        return Object.hash(name,salary,hireDay)
    }
     */

    /*
    toString:
    publicn String toString()
    {
        return getClass().getName()
            +"[name=" + name
            +",salary=" +salary
            +",hireDay=" + hireDay
            + "]";
    }
     */

    /*
    arraylist 详情请看p190
     */
    public static void main(String[] args) {
        int []a = {32,27,94,20,53,11};
        int []b= new int[6];
        int []Aux = new int[6];
        for (int i = 0; i < 6; i++) {
            Aux[i]=0;
        }
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i]<a[j]){
                    Aux[j]= Aux[j]+1;
                }else {
                    Aux[i]=Aux[i]+1;
                }
                if(i==0&&j==4){
                    System.out.println(Arrays.toString(Aux));
                }
            }
            
        }
        System.out.println(Arrays.toString(Aux));
        for (int i = 0; i <b.length ; i++) {
            b[Aux[i]] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }


}
