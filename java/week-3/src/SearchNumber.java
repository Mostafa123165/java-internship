public class SearchNumber {

    static int Find(int[] arr , int specificNumber) {
        for(int i = 5;i<arr.length;i++) {
            if(arr[i] == specificNumber) {
                return i ;
            }
        }
        return -1 ;
    }

}
