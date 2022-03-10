package lv.professer;

/**
 * call factorial
 * @parama num
 * @return
 */
public class Recursion {
    public int factorial(int num){
        if (num == 0){
            return 1;
        }
        return (num)*factorial(num-1);
    }
//    public long factorialloops(int num){
//        long fact = num;
//        for (int i = num-1;i>0,i--){
//
//        }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int result = recursion.factorial(10);
        System.out.println("Factorial = "+result);

    }
}
