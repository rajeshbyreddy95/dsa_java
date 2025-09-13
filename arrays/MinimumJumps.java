public class MinimumJumps {
    
    public static int minimumJumps(int arr[]){
        int n= arr.length;
        int count =0;
        if(arr[0] == 0){
            return 1;
        }
        if(arr[0] == -1){
            return -1;
        }
        int i=0;
        int j=0;
        while (i<n-1) {
            count+=1;
            j = arr[i];
            i+=j;
        }
        return count;
    }

    public static void main(String[] args) {
        int ar[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int ar2[] = {1, 4, 3, 2, 6, 7};
        System.out.println(minimumJumps(ar));
        System.out.println(minimumJumps(ar2));
    }
}