package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Integer payDay;

    Address address;
    List<Employee> employeeList = new ArrayList<>();

    public Department() {
    }

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public double payroll() {
        double sum = 0;
        for (Employee e : employeeList) {
            sum += e.getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Departamento Vendas = R$").append(String.format("%.2f", payroll())).append("\n")
                .append("Pagamento realizado no dia "). append(payDay).append("\n\n")
                .append("Funcionários:").append("\n");

        for (Employee emp : employeeList) {
            sb.append(emp.getName()).append("\n");
        }

        sb.append("\n").append(address.toString());

        return sb.toString();
    }
}
