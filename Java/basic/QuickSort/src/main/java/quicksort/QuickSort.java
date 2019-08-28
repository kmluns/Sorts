package quicksort;

/**
 * created by kmluns 28.08.2019
 **/
public class QuickSort {

    public static void sort(int[] arr, int minIndex, int highIndex) {
        if (minIndex < highIndex) {
            int pivot = highIndex - 1;

            int swapIndex = 0;
            for (int i = 0; i < pivot; i++) {
                if (arr[i] < arr[pivot]) {
                    //swap
                    int temp = arr[swapIndex];
                    arr[swapIndex] = arr[i];
                    arr[i] = temp;
                    swapIndex++;
                }
            }

            // fixed pivot position
            int temp = arr[pivot];
            arr[pivot] = arr[swapIndex];
            arr[swapIndex] = temp;

            sort(arr, minIndex, swapIndex);
            sort(arr, swapIndex + 1, highIndex);
        }
    }
}
