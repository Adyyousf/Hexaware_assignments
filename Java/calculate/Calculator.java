package calculate;

public class Calculator{
    public int add (int a , int b){
        return a+b;
    }

    public int sub (int a, int b){
        return a-b;
    }
    
    public void getmax(int num1, int num2){
        if(num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }

}
