import calculate.Calculator; //Importing user defined package (calculate) which contains 'Calculator' class 
import java.util.Scanner;

public class DemoApp{
    public static void main(String ar[]){
        System.out.println("Hello World from Java....");
        System.out.println(".....................................................");
        DemoApp obj=new DemoApp();
        obj.sayHello();
        System.out.println(".....................................................");
        obj.letsAdd();
        System.out.println(".....................................................");
        sayBye();

    }
    public void sayHello(){
        System.out.println("Hello... Please follow the given steps");
    }
    public static void sayBye(){
        System.out.println("Bye Everybody..");
    }
    public void letsAdd(){
        int a, b;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = myObj.nextInt();
        System.out.println("Enter a number: ");
        b = myObj.nextInt();
        Calculator obj = new Calculator();
        System.out.println("The Sum is: "+obj.add(a,b));
    } 
}