package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class leadersInArray {

    public static void leader(Integer ar[]){
        int n = ar.length;
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(ar));

        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int max = Collections.max(temp.subList(i,n-1));

            if(temp.get(i) >= max){
                sol.add(temp.get(i));
            }

        }

        sol.add(temp.get(n-1));

        for(Integer i : sol){
            System.out.println(i);
        }

    }

    static void leaderV2(Integer ar[]){
        int n = ar.length;
        ArrayList<Integer> sol = new ArrayList<>();
        int maxFromRight = ar[n-1];
        sol.add(maxFromRight);

        for(int i=n-2;i>=0;i--){
            if(ar[i] > maxFromRight){
                maxFromRight = ar[i];
                sol.add(maxFromRight);
            }
        }

        for(Integer i: sol){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer ar[] ={16,17,4,3,5,2};
        // leader(ar);
        leaderV2(ar);
    }
}