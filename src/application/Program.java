package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Nome do departamento: ");
            String departmentName = sc.nextLine();
            System.out.print("Dia do pagamento: ");
            int payDay = sc.nextInt();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Telefone: ");
            String phone = sc.nextLine();

            Address address = new Address(email, phone);
            Department department = new Department(departmentName, payDay, address);

            System.out.println();
            System.out.print("Quantos funcionários tem o departamento? ");
            int n = sc.nextInt();
            sc.nextLine();

            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.printf("Dados do funcionário %d:%n", i + 1);
                System.out.print("Nome: ");
                String employyeName = sc.nextLine();
                System.out.print("Salário: ");
                double employeeSalary = sc.nextDouble();
                sc.nextLine();
                System.out.println();

                department.addEmployee(new Employee(employyeName, employeeSalary));
            }

            System.out.println();
            System.out.println("FOLHA DE PAGAMENTO: ");
            System.out.println(department);
        }
    }
}
