import java.util.Arrays;

public class reverseArrayUsingRecursion {
    public static void printArray(int arr[],int n){
        System.out.println("reversed array is : \n");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int arr[],int start,int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverseArray(arr,start+1,end-1);
        }
    }

    public static void main(String[] args) {
           int n=5;
           int arr[]={6,3,7,8,9};
           reverseArray(arr,0,n-1);
           printArray(arr,n);
    }
}
