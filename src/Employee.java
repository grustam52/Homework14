public class Employee {
    private final Integer id;
    private String FullName;
    private Integer salary;
    private Integer departmentId;

    private static Integer idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departmentId) {
        this.id = idCounter++;
        FullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return FullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", FullName='" + FullName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }




}

