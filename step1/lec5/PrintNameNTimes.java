package step1.lec5;

public class PrintNameNTimes {

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Rajesh");
        print(n-1);
    }
    public static void main(String[] args) {
        print(10);
    }
}
