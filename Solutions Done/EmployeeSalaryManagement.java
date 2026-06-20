package Solutions;
import java.util.*;
public class EmployeeSalaryManagement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] e= new Employee[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            sc.nextLine();

            e[i]= new Employee(a,b,c);
        }
        int msize = sc.nextInt();
        sc.nextLine();

        Manager[] m = new Manager[msize];
        for(int i=0;i<msize;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            m[i]= new Manager(a,b,c,d);
            
        }

        Employee[] allEmployees = new Employee[n + msize];
        for(int i=0;i<n;i++){
            allEmployees[i] = e[i];
        }
        for(int i=0;i<msize;i++){
            allEmployees[n+i] = m[i];
        }

        String highestBonusEmployee = getHighestBonus(allEmployees);
        System.out.println(highestBonusEmployee);

    }
    public static String getHighestBonus(Employee[] arr){
        double bonus =0.0;
        String name = "";
        for(Employee emp: arr){
            if(emp.calculateBonus() >bonus){
                name = emp.getName();
                bonus = emp.calculateBonus();
            }
        }
        return name;
    }
    
}

class Employee{
    private int empId;
    private String empName;
    private double baseSalary;

    public Employee(int empId , String empName , double baseSalary){
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
    }

    public void setId(int id){
        this.empId = id;
    }
    public void setName(String name){
        this.empName = name;
    }
    public void setSalary(double salary){
        this.baseSalary = salary;
    }

    public int getId(){
        return this.empId;
    }
    public String getName(){
        return this.empName;
    }
    public double getSalary(){
        return this.baseSalary;
    }


    public double calculateBonus(){
        return 0.10* this.baseSalary;
    }
}


class Manager extends Employee{
    private int teamSize;

    public Manager(int empId , String empName , double baseSalary , int size){
        super(empId, empName, baseSalary);
        this.teamSize = size;
    }

    public int getTeamSize(){
        return this.teamSize;
    }
    public void setTeamSize(int size){
        this.teamSize = size;
    }

    @Override
    public double calculateBonus(){
        return 0.10*getSalary() + 500 * teamSize;
    }

}