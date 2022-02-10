public class FibonacciNumbers {
    public static void main(String[] args) {

        printsFibonacciSequence(15);

    }

    public static void printsFibonacciSequence(int N){

        System.out.println("First " + N + " Fibonacci numbers are:");

        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;

        for (int i = 0; i < N; i++) {

            int sum = firstFibonacciNumber + secondFibonacciNumber;
            System.out.println(firstFibonacciNumber+ " ");
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = sum;

        }

    }

}
