//Define the Employee entity
class Employee{
    int empNo;
    String empName;
    Employee(int empNo,String empName){
        this.empNo=empNo;
        this.empName=empName;
    }
    public void printEmp(){
        System.out.println("Employee id: " +empNo + " Employee Name " + empName);
    }
}

 

//Define Manager entity
class Manager extends Employee{
    int reportees;
    Manager(int empNo,String empName,int reportees){
        //Call to the base class constructor
        super(empNo,empName);
        this.reportees=reportees;

 

    }
    public void printManager(){
        System.out.print(reportees + " employees are reporting to ");
        printEmp();
    }
}

//Implementation class
public class InheritDemo{
    public static void main(String ar[]){
        Manager mgrObj=new Manager(10,"John",3);
        mgrObj.printManager();
    }
}