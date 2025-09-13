public class BubbleSort {
    public static void bubbleSort(int ar[], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j+1];
                    ar[j+1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for(int x:ar){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int ar[] = {7, 4, 1, 5, 3};
        bubbleSort(ar, ar.length);

    }
}
