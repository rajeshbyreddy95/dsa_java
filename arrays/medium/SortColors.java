package medium;

public class SortColors {

    public static void sortColors(int nums[]){
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;


        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if (nums[mid] == 1) {
                mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
        for(int x: nums){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
    }
}
