import java.util.*;

public class solRev2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String cmpName = sc.nextLine();

        System.out.print("Enter number of employees: ");
        int numEmp = sc.nextInt();
        sc.nextLine(); // consume leftover newline after nextInt()

        System.out.println("Enter employee details:");
        Employee[] empDetails = new Employee[numEmp];

        for (int i = 0; i < numEmp; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Enter id: ");
            int a = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String b = sc.nextLine();

            System.out.print("Enter designation: ");
            String c = sc.nextLine();

            System.out.print("Enter salary: ");
            double d = sc.nextDouble();
            sc.nextLine(); // ✅ consume leftover newline after nextDouble()

            empDetails[i] = new Employee(a, b, c, d);
        }

        Company cn = new Company(cmpName, empDetails, numEmp);

        System.out.println("Average salary: " + cn.getAverageSalary(empDetails));
        System.out.println("Max salary: " + cn.getMaxSalary(empDetails));

        System.out.print("Employees with designation: ");
        String desi = sc.nextLine(); // ✅ now correctly waits for input

        Employee[] ans = cn.getEmployeesByDesignation(empDetails, desi);
        

        if (ans != null) {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(
                    "ID: " + ans[i].getId() +
                    ", Name: " + ans[i].getName() +
                    ", Designation: " + ans[i].getDesignation() +
                    ", Salary: " + ans[i].getSalary()
                );
            }
        } else {
            System.out.println("No employee found");
        }

        sc.close();
    }
}

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}

class Company {
    private String companyName;
    private Employee[] employees;
    private int numEmployees;

    public Company(String cmpName, Employee[] emp, int numEmp) {
        this.companyName = cmpName;
        this.employees = emp;
        this.numEmployees = numEmp;
    }

    public double getAverageSalary(Employee[] e) {
        double sum = 0;

        for (int i = 0; i < e.length; i++) {
            sum += e[i].getSalary();
        }

        return sum / e.length;
    }

    public double getMaxSalary(Employee[] e) {
        double max = e[0].getSalary();

        for (int i = 1; i < e.length; i++) {
            if (e[i].getSalary() > max) {
                max = e[i].getSalary();
            }
        }

        return max;
    }

    public Employee[] getEmployeesByDesignation(Employee[] e, String d) {
        int count = 0;

        for (Employee emp : e) {
            if (emp.getDesignation().equalsIgnoreCase(d)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Employee[] result = new Employee[count];
        int index = 0;

        for (Employee emp : e) {
            if (emp.getDesignation().equalsIgnoreCase(d)) {
                result[index++] = emp;
            }
        }

        return result;
    }
}