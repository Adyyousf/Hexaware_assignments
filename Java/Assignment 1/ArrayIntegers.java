import java.util.Scanner;

public class ArrayIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int n = input.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                System.out.println("Enter element " + (i+1) );
                arr[i] = input.nextInt();
            }

            System.out.println("Sum is : "+ Sum(arr));

            System.out.println("Average = " + Avg(Sum(arr), n));
            System.out.println("Elements less than Average are :  ");
            int count = 0;
            for(int a:arr){
                if (a < Avg(Sum(arr), n)){      
                    count++;
                    System.out.println(".... "+ a);
                }
            }
            System.out.println("Number of elements less than Average are: "+ count);
        input.close();

    }
    public static int Sum(int arr[]){
        int sum = 0;
        for(int a:arr){
            sum = sum + a;
        }
        return sum;
    }

    public static float Avg(int sum, int n) {
        float avg = sum / n;
        return avg;
    }
      
    
}