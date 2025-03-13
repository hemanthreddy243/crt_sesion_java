import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n[] = new int[a];

        // Input array elements
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        // Calling quicksort function
        quickSort(n, 0, n.length - 1);
        System.out.println(Arrays.toString(n));

        sc.close();
    }

    // Quick sort function
    public static void quickSort(int a[], int low, int high) {
        if (low < high) { // Base condition to stop recursion
            int pivot = partition(a, low, high);

            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }
    }

    // Partition function using the first element as the pivot
    public static int partition(int a[], int low, int high) {
        int pivot = a[low]; // First element as pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && a[i] <= pivot) i++; // Find element greater than pivot
            while (j >= low && a[j] > pivot) j--;   // Find element smaller than pivot

            if (i < j) { // Swap elements if needed
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Swap pivot with a[j] to place pivot at its correct position
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j; // Return new pivot position
    }
}
