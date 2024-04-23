//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,4,7,9,45};

        System.out.println("The position is : " + SearchNumber.Find(arr,7));
        System.out.println("The sum is : " + MathematicalOperation.sum(arr));
        System.out.println("The average is : " + MathematicalOperation.average(arr));

    }
}