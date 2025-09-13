import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySubset {
    public static boolean isSubset(int a[], int b[]){
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        for(int x: a){
            list.add(x);
        }
        for(int x: b){
            list2.add(x);
        }
        list.contains(list2);
        for(int i=0;i<b.length;i++){
            if(!list.contains(b[i])){
                return false;
            }
            list.remove((Integer)b[i]);
            System.out.println(list);
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int b[] = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a, b));
    }
}
