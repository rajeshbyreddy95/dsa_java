package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void remove(int ar[]){
        int n = ar.length;
        int res[] = new int[n];
        res[0] = ar[0];
        int ind = 1;

        for(int i=1;i<n;i++){ 
            if(res[ind-1] != ar[i]){
                res[ind] = ar[i];
                ind++;
            }
        }

        for(int item: res){
            System.out.println(item);
        }

    }

    public static void removeV2(int ar[]){
        Set<Integer> temp = Arrays.stream(ar).boxed().collect(Collectors.toSet());

        for(Integer item : temp){
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,30};
        // remove(arr);
        removeV2(arr);
    }
}