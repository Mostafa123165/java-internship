import java.util.InputMismatchException;
import java.util.Scanner;


public class SumNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true ;
        int input1 = 0, input2 = 0;
        while (flag) {
            boolean isError = false ;
            try {
                input1 = sc.nextInt() ;
                input2 = sc.nextInt() ;
            } catch (InputMismatchException e) {
                isError = true ;
            }
            if(!isError) flag = false ;
            else {
                System.out.println("Invalid input. Enter integers only.");
                sc.nextLine(); // Clear the input buffer
            }
        }

        System.out.println("sum : " + (input1+input2));

        sc.close();
    }
}