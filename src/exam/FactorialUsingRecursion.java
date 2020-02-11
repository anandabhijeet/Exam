package exam;

public class FactorialUsingRecursion {
    public static void main(String[] args) {

        int n = 12;
        long fact = multi(n);
        System.out.println("factorial of n is : "+ fact);

    }
    public static long multi(int n){
        if(n>1){
            return n*multi(n-1);
        }else
            return 1;
    }
}
