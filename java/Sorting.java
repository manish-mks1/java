public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("Sorted by bubbleSort: ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        DisplayArray(arr);
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Sorted by selectionsort: ");
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        DisplayArray(arr);
    }    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Sorted by insertionSort: ");
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        DisplayArray(arr);
    }
    public static void DisplayArray(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 3, 1, 9};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
    }
}
