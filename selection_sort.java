import java.util.Arrays;
import java.util.Scanner;
public class selection_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int n[]=new int[a];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        selection_sort(n);
        System.out.println(Arrays.toString(n));

    }
    public static void selection_sort(int a[] ){
        boolean flag;
        int temp;
        for(int i=1;i<a.length;i++){
            flag=true;
            int min =i;
            for(int j=i;j<a.length;j++){
                if(a[j-1]>a[j]){
                    min =j;
                    flag=false;


                }
            }
            if(flag==true){
                break;
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }

    }

    }
