import java.util.Scanner;
class Employee{
    public static String companyName;
    int empNo;
    String empName;
    //initialize static variable, gets executed when class is loaded in the memory
    static{
        Scanner sc=new Scanner(System.in);
        companyName=sc.nextLine();
    }
    Employee(int empNo,String empName){
        this.empNo=empNo;
        this.empName=empName;
    }
    //Instance method can also access the static variable
    public void printEmp(){
        System.out.println("Emp No " + empNo + " Name " +empName +" works for " + companyName);
    }
    public static void printCompany(){
        //can access static variable
        System.out.println("Company Name " + companyName);
        //Try accessing instance variable
        //System.out.println("Employee details " +empNo+ " " +empName);
    }
}
public class StaticBlockDemo{
    public static void main(String ar[]){
        System.out.println("Employee Details Application..");
        //Can access static varible without object
        //System.out.println(Employee.companyName);
        //call static method using the class name
        Employee.printCompany();
        Employee empObj=new Employee(100,"Taylor");
        //System.out.println(empObj.companyName);
        empObj.printEmp();
    }
}