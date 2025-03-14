import java.util.Scanner;
import java.util.collections;
class COUNT_INVERSION{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int  n = sc.nextInt();
int a[]=new int[n];
for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt(); // ✅ Taking input for the array
    ArrayList<Integer> l=new ArrayList<>();
}

    }
    public static void merge(int a[],int low,int high){
        int mid = (low+high)/2;
        merge(a[],low,mid);
        merge(a[],mid+1,high);
        merge_s(a[],low,high,mid, l);

    }
    public static void merge_s(int a[],int low,int high,int mid, ArrayList<Integer> l){
int start= low;
int midstart=mid+1;
while(start<mid && midstart<high){
    if(a[start]<a[midstrt]){
        start++;
        
    }
    else{
        l.append((i,j));
        int value=a[midStart];
        int index=midstart;
        while(index>start){
            n[index]=n[index]-1;
            index--;
        }
        n[start]=value;
        midStart++;
    }
}
    }

}