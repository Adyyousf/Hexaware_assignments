import java.util.Scanner;

public class Even {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter range: ");
    int num = input.nextInt();

        for(int i = 1; i<= num; i++){
            if(i%2 == 0){
                System.out.println(".... "+i);
            }

        }

        
    }
}