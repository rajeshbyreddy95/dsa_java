public class FindMaxConsecutiveOne {

    public static void findMaxConsecutiveOnes(int[] nums){
       int n = nums.length;
       int count =0;
       int max = Integer.MIN_VALUE;
       
       for(int i=0;i<n;i++){
        if(nums[i] == 1){
            count++;
            max = Math.max(max, count);
        }else{
            count =0;
            max = Math.max(max, count);
        }
       }

       System.out.println(max);
    }
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(nums);
    }
}