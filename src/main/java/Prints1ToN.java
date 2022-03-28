public class Prints1ToN {
    public static void main(String[] args) {

        printNumberToN(11);
        unableToDivideTo3And7(12);
    }
    public static void printNumberToN(int N){

        System.out.println("All numbers before " + N + " are:");

        for (int i = 0; i < N; i++) {
            System.out.println(i);
        }
    }
    public static void unableToDivideTo3And7(int N){

        System.out.println("The following numbers cannot be divided into 3 and 7:");

        for (int i = 0; i < N; i++) {
            if (i % 3 != 0){
                if (i % 7 != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
