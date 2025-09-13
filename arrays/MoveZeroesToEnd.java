public class MoveZeroesToEnd {

    public static void moveZeroes(int arr[], int n){
        int res =0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[res] = arr[i];
                res++;
            }
        }

        while (res<n) {
            arr[res]=0;
            res++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = arr.length;
        moveZeroes(arr, n);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
