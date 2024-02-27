public class Main {

    public static final Employee[] employees = {
            new Employee("Иванов Иван Иванович", 1000, 1),
            new Employee("Семенов Семен Семенович", 2000, 2),
            new Employee("Степанов Степан Степанович", 10000, 3),
            new Employee("Федоров Федор Федорович", 5000, 1),
            new Employee("Максимов Максим Максимович", 6000, 4)

    };
    public static void main(String[] args) {
        printEmployees();
        System.out.println("------------------");
        System.out.println(calculateTotalSalary());
        System.out.println("------------------");
        System.out.println(findEmployeeWithMinSalary());
        System.out.println("------------------");
        System.out.println(findEmployeeWithMaxSalary());
        System.out.println("------------------");
        System.out.println(calculateAverageSalary());
        System.out.println("------------------");
        printEmployeeNames();
        System.out.println("------------------");

    }

    private static void printEmployees() {
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }

    private static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee: employees){
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary(){
        Employee result = employees[0];

        for (Employee employee: employees){
            if (employee.getSalary() < result.getSalary()){
                result = employee;
            }
        }
        return result;
    }
    private static Employee findEmployeeWithMaxSalary(){
        Employee result = employees[0];

        for (Employee employee: employees){
            if (employee.getSalary() > result.getSalary()){
                result = employee;
            }
        }
        return result;
    }

    private  static float calculateAverageSalary(){
        return calculateTotalSalary() / (float) employees.length;
    }
    private static void printEmployeeNames() {
        for (Employee employee: employees){
            System.out.println(employee.getFullName());
        }
    }


}
