package medium;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int arr[], int n, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    public static int[] twoSumV2(int arr[], int n, int target){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;
        System.out.println(twoSum(arr, n, target));
        System.out.println(twoSumV2(arr, n, target));
    }
}
