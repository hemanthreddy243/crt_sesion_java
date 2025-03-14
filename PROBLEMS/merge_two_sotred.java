import java.util.*;
public class merge_two_sotred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[]={5,8,6};
        int b[]={2,7,9};
        int i=0;
        int j=0;
        int k=0;
        int temp[]=new int[a.length+b.length];
        while(i<a.length && j<b.length){
           
            if(a[i]<=b[j]){
                temp[k]=a[i];
                i++;k++;
            }
            else{
                temp[k]=b[j];
                j++;k++;
            }


        }
        while(i<a.length){
            temp[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
temp[k]=b[j];
j++;
k++;
        }
        

    System.out.println(Arrays.toString(temp));
    }
}
