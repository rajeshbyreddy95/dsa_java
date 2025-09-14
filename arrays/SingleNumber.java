public class SingleNumber {
    public static int singleNum(int[] nums) {
        int sum =0;
        int n = nums.length;
        int total = (n*(n+1))/2;
        for(int x:nums){
            sum+=x;
        }

        return total - sum;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1};
        System.out.println(singleNum(arr));
    }
}