package assignment2;

public class fac {
    public static int factorial(int num){
        if (num == 0)
            return 1;
        else
            return num * factorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
