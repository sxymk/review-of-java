package chapter_4;

import java.util.Random;


/**
 * @author sxy
 * @version 19
 */
public class Employee {
        private static int nextId;

        private int id;
        private  String name = "";
        private double salary;
        Employee(int id, double salary){
            this.id = id;
            this.salary=salary;
        }
        private static Random generator = new Random();

        // static initialization block  类加载时隐式调用
        static
        {
            nextId = generator.nextInt(1000);
        }

        //object initialization block   创建对象时隐式调用
        {
            id = nextId;
            nextId++;
        }


}
