import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n) {
        int sum = 0;
        int value = n;

        while(value >= 1){
            if(n % value == 0){
                sum += value;
            }
            value--;
        }

        return sum;
    }
}

class Calculator {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(calculator.divisor_sum(n) + "\n");
        sc.close();
    }
}
