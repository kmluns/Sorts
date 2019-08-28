package insertion;

/**
 * created by kmluns 28.08.2019
 **/
public class InsertionSort {

    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int sortedArrIndex = i-1;
            while(sortedArrIndex >= 0 && arr[sortedArrIndex] > arr[sortedArrIndex+1]){
                int temp = arr[sortedArrIndex+1];
                arr[sortedArrIndex+1] = arr[sortedArrIndex];
                arr[sortedArrIndex] = temp;
                sortedArrIndex --;
            }
        }
    }
}
