package lv.tsi.Ex2;
// Exercise 2

public class FactorialCalculator {


    static int factorialCase1(int N){
        int a = 1;

        for (int i = 1; i < (N+1); i++) {
                a = a *i;
            }
        return a;
    }

    static int factorialCase2(int N){
        if (N == 1)
            return 1;
        else
            return(N * factorialCase2(N-1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is (with case1): "+factorialCase1(5));
        System.out.println("Factorial of 5 is (with case2): "+factorialCase2(5));
    }
}

