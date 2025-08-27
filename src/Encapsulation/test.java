package Encapsulation;
class employee
{
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class student
{
    private double  marks;
    private double id;

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}


public class test {
    public static void main(String[] args) {
        System.out.println("Hello");
        employee first=new employee();
        first.setName("Shaswat Mishra");
        first.setSalary(40000);
        student child=new student();
        child.setId(17);
        child.setMarks(95.4);
        System.out.printf("%s %.1f %.1f %.2f\n",first.getName(),first.getSalary(),child.getId(),child.getMarks());
        System.out.println("Salary"+first.getSalary());
    }
}
