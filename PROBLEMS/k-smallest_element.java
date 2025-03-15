
import java.util.Scanner;
class select{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int  n = sc.nextInt();
int a[]=new int[n];
for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt(); // ✅ Taking input for the array
}
int target = sc.nextInt();

    }
    public static void k_small(int a[],int low, int high,int target){
int pivot=partion(a,0,a.length,target,false);
if(pivot==0){
    System.out.print(a[target]);
    return;
    
}

else if (pivot==target){
    System.out.println((a[target]));
    return;
}
else if(target<pivot){
    k_small(a, low, pivot-1, target);
}
else{
    k_small(a, pivot, high, target);
}
        
    }
    public static int partion(int a[],int low,int high,int target,boolean flag){
        int pivot=low;
        int i= low;
        int j=high;
        int temp;
        
        if(i==a.length){
           
            return 0;

        }
        while(i<j){
            if (a[i]<=a[pivot]){
                i++;

            }
            else if(a[j]>a[pivot]){
                j--;
            }
            else{
                 temp=a[i];
                a[i]=a[j];
                a[j]=a[i];
            }
        }
        temp=a[pivot];
        a[pivot]=a[i];
        a[i]=temp;
        return pivot;


    
        
        
    }

}
////
/// /*
/// import java.util.Scanner;

class Select {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // ✅ Taking input for the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter k (1-based index for k-th smallest element): ");
        int target = sc.nextInt();

        if (target < 1 || target > n) {
            System.out.println("Invalid input! k must be between 1 and " + n);
        } else {
            // Convert 1-based index to 0-based
            int result = kSmallest(a, 0, n - 1, target - 1);
            System.out.println("The " + target + "-th smallest element is: " + result);
        }

        sc.close();
    }

    // ✅ QuickSelect Algorithm with Early Stopping
    public static int kSmallest(int a[], int low, int high, int target) {
        while (low <= high) {
            // 🔹 Early stopping: If sorted, return a[target]
            if (isSorted(a, low, high)) {
                return a[target];
            }

            int pivotIndex = partition(a, low, high);

            if (pivotIndex == target) {
                return a[pivotIndex]; // Found k-th smallest element
            } else if (target < pivotIndex) {
                high = pivotIndex - 1; // Search left
            } else {
                low = pivotIndex + 1; // Search right
            }
        }
        return -1; // Should never reach here if input is valid
    }

    // ✅ Partition function with first element as pivot
    public static int partition(int a[], int low, int high) {
        int pivot = a[low]; // 🔹 First element as pivot
        int i = low;
        int j = high;

        while (i < j) {
            while (i < high && a[i] <= pivot) i++; // Move right
            while (j > low && a[j] > pivot) j--; // Move left
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, low, j); // Place pivot in correct position
        return j;
    }

    // ✅ Swap function
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // ✅ Check if array is already sorted
    public static boolean isSorted(int[] a, int low, int high) {
        for (int i = low; i < high; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

///  */
