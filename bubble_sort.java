import java.util.Arrays;
import java.util.Scanner;
public class bubble_sort{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a =  sc.nextInt();
    int n[]=new int[a];
    for(int i=0;i<n.length;i++){
      n[i]=sc.nextInt();


    }
    bubble1(n);
    System.out.println(Arrays.toString(n));

  }
  public static void  bubble1(int a[]){
    boolean flag;
    int temp;
    for(int i=1;i<a.length-1;i++){
      flag=true;
      for(int j=i;j<a.length;j++){
 if(a[j-1]>a[j]){
  flag=false;
  temp=a[j];
  a[j]=a[j-1];
  a[j-1]=temp;

 }

      }
      if(flag==true){
        break;
      }
    }

  }
}