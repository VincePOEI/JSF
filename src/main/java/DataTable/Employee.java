
package DataTable;


public class Employee {

    private String name;
    private String department;
    private Integer age;
    private Integer salary;

    public Employee() {
    }
    
    
    public Employee(String name, String department,Integer age, Integer salary){
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
}
