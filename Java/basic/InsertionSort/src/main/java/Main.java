import insertion.InsertionSort;

/**
 * created by kmluns 28.08.2019
 **/
public class Main {
    public static void main(String args[]){
        int[] arr = new int[]{5,3,1,2,21,0};

        System.out.println("Initial Array");
        printArray(arr);

        InsertionSort.sort(arr);

        System.out.println("Sorted Array");
        printArray(arr);
    }

    private static void printArray(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            System.out.print("arr["+ j + "] : " + arr[j] + ", ");
        }
        System.out.println();
    }
}
