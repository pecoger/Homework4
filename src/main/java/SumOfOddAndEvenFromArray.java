import java.util.Scanner;

public class SumOfOddAndEvenFromArray {
    public static void main(String[] args) {
        System.out.println("Enter the elements of the array one by one");
        Scanner scanner = new Scanner(System.in);

        int [] array = new int[6];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0){
                evenSum = evenSum + array[i];
            }else if (array[i] % 2 !=0){
                oddSum = oddSum + array[i];
            }
        }
        System.out.println("The sum of even numbers is " + evenSum + " and the sum of odd number is " + oddSum + ".");
    }
}
