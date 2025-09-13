package step1.lec5;

public class ReverseArray {
    public static void reverse(int arr[], int n){
        if(n==0){
            return;
        }
        System.out.println(arr[n-1]);
        reverse(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,4,2};
        int n = arr.length;
        reverse(arr, n);
    }
}
