import java.util.UUID;

public class Features {
    public static void main(String[] args) {
        System.out.println("Inheritance testing....");
        Programmer programmer = new Programmer();
        System.out.println(programmer.id);
        System.out.println(programmer.salary);
        System.out.println(programmer.bonus);
    }
}

/**
 * Parent class
 */
class Employee {
    protected int salary = 10000;
}

/**
 * Sub class
 */
class Programmer extends Employee {
    protected String id = UUID.randomUUID().toString();
    protected int bonus = 1000;
}
