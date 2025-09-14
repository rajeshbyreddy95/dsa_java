import java.util.HashMap;
import java.util.Map;

public class LongestSubArrWithSumK {

    public static void maxLen(int nums[], int n, int k){
        int prefixSum =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen =0;
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];

            if(map.containsKey(prefixSum-k)){
                maxLen = Math.max(maxLen, i - map.get(prefixSum-k));
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
            }
        }

        System.out.println(maxLen);
        
    }
    public static void main(String[] args) {
        int nums[] = {1, -1, 5, -2, 3};
        int n = nums.length;
        int k =3;
        maxLen(nums, n, k);
    }
}