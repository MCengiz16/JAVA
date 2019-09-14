package EmployeeInfo;

public class EmployeeInfoCall {
    public static void main(String[] args) {
        EmployeeInfo myEmployee=new EmployeeInfo();
        myEmployee.employeeInfo();
        System.out.println("Weekly Payment: "+myEmployee.weeklyPayment());
        System.out.println("Biweekly Payment: "+myEmployee.biWeeklyPayment());
        System.out.println("-----------------------------------------");

        EmployeeInfo myEmployee2=new EmployeeInfo(6789,50000,"John","Finance","Hourly");
        myEmployee2.employeeInfo();
        System.out.println("Weekly Payment: "+myEmployee2.weeklyPayment());
        System.out.println("Biweekly Payment: "+myEmployee2.biWeeklyPayment());

    }
}
