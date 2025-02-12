import java.util.*;

class Employee {
    private final String name;
    private final int age;
    private final String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return "{ Name: " + name + ", Age: " + age + ", Designation: " + designation + " }";
    }
}

public class SolutionQ3 {
    public static void main(String[] args) {
        Map<Employee, Double> employeeSalaryMap = new HashMap<>();
        employeeSalaryMap.put(new Employee("Alice", 30, "Manager"), 70000.0);
        employeeSalaryMap.put(new Employee("Bob", 25, "Developer"), 50000.0);
        employeeSalaryMap.put(new Employee("Charlie", 28, "Analyst"), 60000.0);
        employeeSalaryMap.put(new Employee("David", 35, "HR"), 55000.0);

        List<Map.Entry<Employee, Double>> entryList = new ArrayList<>(employeeSalaryMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Employees sorted by Salary (Descending Order):");
        for (Map.Entry<Employee, Double> entry : entryList) {
            System.out.println(entry.getKey() + " -> Salary: " + entry.getValue());
        }
    }
}
