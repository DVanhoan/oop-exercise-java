public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1,"duong ","hoan",
                300);
        System.out.println(e.toString());
        System.out.println("increase the salary: " + e.RaiseSalary(3));

    }
}