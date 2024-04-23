public class MathematicalOperation {

    static int sum(int[] arr) {

        int result = 0 ;

        for(int i =0 ;i<arr.length;i++)
            result += arr[i] ;
        return result;
    }

    static double average(int[] arr) {
        return  (double)sum(arr) / (double)arr.length;
    }
}
