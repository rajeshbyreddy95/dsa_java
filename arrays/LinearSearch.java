public class LinearSearch {

    public static int linearsearch(int arr[], int n, int target){
        for(int i =0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={ 1, 2, 3, 4, 5};
        int n = arr.length;
        int target = 3;
        linearsearch(arr, n, target);
        System.out.println(linearsearch(arr, n, target));
    }
}
