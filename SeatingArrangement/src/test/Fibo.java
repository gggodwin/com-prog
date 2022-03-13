package test;

public class Fibo {

    public static int f(int n){
        if (n <= 1)
            return n;
            return f(n-1) + f(n-2);
    }


    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i < n; i++)
            System.out.println(f(i));
    }
}
