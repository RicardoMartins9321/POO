package ExerciciosTreino.GerenciamentoFuncionários;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();

        int choice = 0;

        while (choice != 6) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Print All Employees");
            System.out.println("5. Calculate Average Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(id, name, age, salary);
                    employeeManager.addEmployee(employee);
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    int removeId = scanner.nextInt();
                    employeeManager.removeEmployee(removeId);
                    System.out.println("Employee removed successfully!");
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int searchId = scanner.nextInt();
                    Employee searchEmployee = employeeManager.searchEmployee(searchId);
                    if (searchEmployee != null) {
                        System.out.println("Employee found:");
                        System.out.println("ID: " + searchEmployee.getId());
                        System.out.println("Name: " + searchEmployee.getName());
                        System.out.println("Age: " + searchEmployee.getAge());
                        System.out.println("Salary: " + searchEmployee.getSalary());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.println("All Employees:");
                    employeeManager.printAllEmployees();
                    break;
                case 5:
                    double averageSalary = employeeManager.calculateAverageSalary();
                    System.out.println("Average Salary: " + averageSalary);
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}

