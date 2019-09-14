package EmployeeInfo;

public class EmployeeInfo {
    int id;
    double salary;
    String name;
    String department;
    String contract;


    public EmployeeInfo(int id, double salary, String name, String department, String contract) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.contract = contract;
    }

    public EmployeeInfo() {
        this.id = 12345;
        this.salary = 100000;
        this.name = "Ali";
        this.department = "IT";
        this.contract = "Fulltime";


    }
    public double weeklyPayment(){
        double weeklyPayment= this.salary/52;
        return weeklyPayment;

    }
    public double biWeeklyPayment(){
        double biWeeklyPayment= this.salary/26;
        return biWeeklyPayment;
    }
    public void employeeInfo(){
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Department: "+this.department);
        System.out.println("Employee Contract: "+this.contract);

    }
}