public class SelectionSort {

    public static int[] selectionS(int ar[], int n){
        if(n == 0 || n==1){
            return ar;
        }

        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }

        return ar;
        
    }
    public static void main(String[] args) {
        int ar[] = {7, 4, 1, 5, 3};
        int n = ar.length;
        selectionS(ar, n);
        for(int x: ar){
            System.out.print(x+" ");
        }
    }
}