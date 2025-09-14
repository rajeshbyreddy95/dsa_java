public class FindMissingNumber {
    public static void missingNumber(int ar[], int n){
        int sum =0;
        int total = (n*(n+1))/2;
        for(int x:ar){
            sum+=x;
        }

        System.out.println(total-sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = arr.length;
        missingNumber(arr, n);
    }
}