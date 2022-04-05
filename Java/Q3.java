import java.util.Scanner;

public class Q3{

    public static void main(String[] args){
        if(args.length==0) {

        System.out.println("No arguments are passed");
        }
        else {
            
            int num1=Integer.parseInt(args[0]);
            char operator=args[1].charAt(0);
            int num2=Integer.parseInt(args[2]);

            switch(operator) {
                case '+':
                    System.out.println("Adding "+num1+" and "+num2+" we get : "+(num1+num2));
                    break;

                case '-':
                    System.out.println("Subtracting "+num1+" from "+num2+" we get : "+(num1-num2));
                    break;

                case '*':
                    System.out.println("Multiplying "+num1+" with "+num2+" we get : "+(num1*num2));
                    break;

                case '/':
                    System.out.println("Dividing " +num1+ " by " +num2+ " we get : " +(num1/num2));
                    break;

                default:
                    System.out.println("Please Enter '+', '-', '*' & '/' operator only.");
            }
        }

    }

}