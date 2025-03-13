import java.util.Scanner;
class select{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int  n = sc.nextInt();
int a[]=new int[n];
for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt(); // ✅ Taking input for the array
}

    }
    public static void select1(int a[]){
    boolean flag;    
for(int i=0;i<a.length;i++){
 int min =i;
  flag= false;
 int j=i+1;
 for( j=i+1;j<a.length;j++){
    if(a[min]>a[j]){
        flag=true;
        min=j;
    }
 }
 if(flag!=true){
    break;
 }
 else{
 int temp=a[min];
 a[min]=a[i];
 a[i]=temp;
}

}
    }

}