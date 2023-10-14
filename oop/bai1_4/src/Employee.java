
public class Employee {
    private
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getid() {
        return id;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return "firstName lastName";
    }
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int RaiseSalary(int percent){
        return salary * percent;
    }
    public String toString(){
        return "Employee[id="+id+", Name= "+
                firstName+ lastName + ", Salary= "+salary+ "]";
    }
}


