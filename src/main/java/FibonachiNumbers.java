public class FibonachiNumbers {
    public static void main(String[] args) {

        printsFirstMembersOfFibonachi(6);

    }

    public static void printsFirstMembersOfFibonachi(int N){

        int [] fibonachiNumbers = new int[N];
        int firstFibonachiNumber = 0;
        int secondFibonachiNumber = 1;

        for (int i = 0; i < fibonachiNumbers.length; i++) {
            fibonachiNumbers[i] = firstFibonachiNumber + secondFibonachiNumber;
            System.out.println(i);

        }

    }

}
