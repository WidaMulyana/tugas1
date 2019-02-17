public class Employee {
    private String name;
    private String address;
    private Long Salary;

    public Employee(String name, String address, Long Salary) {
        this.name = name;
        this.address = address;
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long Salary) {
        this.Salary = Salary;
    }
    
}
