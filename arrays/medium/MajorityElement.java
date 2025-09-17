package medium;

import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }

        return -1;
    }

    public static int majorityElementV2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}