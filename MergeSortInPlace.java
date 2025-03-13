import java.util.Arrays;
import java.util.Scanner;

public class MergeSortInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int a = sc.nextInt();
        int n[] = new int[a];

        System.out.println("Enter " + a + " elements:");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        // Call merge sort function
        mergeSort(n, 0, n.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(n));
        sc.close();
    }

    // Merge Sort Function (Recursive)
    public static void mergeSort(int[] n, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            
            // Recursively sort left half
            mergeSort(n, low, mid);
            
            // Recursively sort right half
            mergeSort(n, mid + 1, high);
            
            // Merge sorted halves without extra arrays
            mergeInPlace(n, low, mid, high);
        }
    }

    // In-Place Merge Function (Without Extra Arrays)
    public static void mergeInPlace(int[] n, int low, int mid, int high) {
        int start = low, midStart = mid + 1;

        while (start <= mid && midStart <= high) {
            // If element at left half is already sorted, move ahead
            if (n[start] <= n[midStart]) {
                start++;
            } else {
                // Shift the right element into correct position
                int value = n[midStart];
                int index = midStart;

                // Shift all elements to the right
                while (index > start) {
                    n[index] = n[index - 1];
                    index--;
                }
                n[start] = value;

                // Update pointers
                
             
                midStart++;
              
            }
        }
    }
}
