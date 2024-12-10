package OOP;

// there must be only one public class in one java file

// class defination
class Employee {
    // properties
    int id;
    String name;
    int salary = 4332;
    // methods
    public void printDetail() {
        System.out.println("My Id : "+id);
        System.out.println("My Name : "+name);
        System.out.println("My Salary : "+salary);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
} 

public class p1_CustomeClass {
    public static void main(String[] args) {
        Employee rahul = new Employee(); // object instantiated
        rahul.id = 14; // setting object property
        rahul.name = "Rahul Baraiya";
        // rahul.printDetail();
        Employee jhon = new Employee();
        jhon.id = 12;
        jhon.name = "Jhon Patel";
        jhon.salary = 345;
        // jhon.printDetail();
        int salary = jhon.getSalary();
        // System.out.println(salary);
        jhon.setName("Jhon Rajput");
        System.out.println(rahul.getName());
    }
}
