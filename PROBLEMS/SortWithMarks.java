import java.util.*;

class Student {
    String name;
    int ds;
    int da;

    // Constructor
    Student(String name, int ds, int da) {
        this.name = name;
        this.ds = ds;
        this.da = da;
    }

    // To display student details
    public String toString() {
        return name + " (DS: " + ds + ", DA: " + da + ")";
    }
}

public class SortWithMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student[] students = new Student[n];

        // Taking input
        System.out.println("Enter student details in format: name ds_marks da_marks");
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int ds = Integer.parseInt(input[1]);
            int da = Integer.parseInt(input[2]);
            students[i] = new Student(name, ds, da);
        }

        // Sorting using in-place Merge Sort
        mergeSort(students, 0, n - 1);

        // Display sorted students
        System.out.println("\nSorted Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }

    // In-place Merge Sort
    public static void mergeSort(Student[] students, int low, int high) {
        if (low >= high) return; // Base Case

        int mid = (low + high) / 2;
        mergeSort(students, low, mid);
        mergeSort(students, mid + 1, high);
        merge(students, low, mid, high);
    }

    // In-place Merge Function
    public static void merge(Student[] students, int low, int mid, int high) {
        int start = low;
        int midstart = mid + 1;

        while (start <= mid && midstart <= high) {
            // If the current left element is already sorted, move forward
            if (students[start].ds < students[midstart].ds || 
               (students[start].ds == students[midstart].ds && students[start].da <= students[midstart].da)) {
                start++;
            } else {
                // Shift students[midstart] to its correct position
                Student temp = students[midstart];
                int index = midstart;

                while (index > start) {
                    students[index] = students[index - 1]; // Shift left elements to the right
                    index--;
                }

                students[start] = temp; // Place the element in correct position

                // Update pointers
                start++;
                mid++;
                midstart++;
            }
        }
    }
}
