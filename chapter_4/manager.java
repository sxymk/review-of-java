package chapter_4;

public class manager extends Employee{
    private double bonus;

    manager(int id, double salary) {
        super(id, salary);
    }

    public double get_salary(){
        return bonus;
    }
}
