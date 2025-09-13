import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Union {
    public static void findUnion(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        HashSet<Integer> sol = new HashSet<>();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(a[i] <= b[j]){
                sol.add(a[i]);
                i++;
            }else{
                sol.add(b[j]);
                j++;
            }
        }

        while(i<m){
            sol.add(a[i]);
            i++;
        }
        while(j<n){
            sol.add(b[j]);
            j++;
        }

        for(Integer x: sol){
            System.out.print(x+" ");
        }


    }



    public static ArrayList<Integer> findUnionV2(int a[], int b[]){
        TreeSet<Integer> sol = new TreeSet<>();
        for(int x:a) sol.add(x);
        for(int x:b) sol.add(x);

        return new ArrayList<>(sol);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {2,3,4,4,5};

        int a1[] = {1,2,3,4,5,6,7,8,9,10};
        int b1[] = {2,3,4,4,5,11,12};
        findUnion(a, b);
        System.out.println();
        findUnion(a1, b1);
    }
}
