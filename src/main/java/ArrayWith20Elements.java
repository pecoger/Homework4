public class ArrayWith20Elements {
    static int [] myArray = new int[20];

    public static void main(String[] args) {
        fillArray();
        averageValueOfArray();
    }

    public static void fillArray() {

        System.out.println("Your array has " + myArray.length + " elements.");
        System.out.println("-------------");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 5;
            System.out.printf("Element at index %d : %d%n", i, myArray[i]);
        }

    }

    public static void averageValueOfArray(){

        double sum = 0;
        double average = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 5;
            sum += myArray[i];
            average = sum / myArray.length;
        }
        System.out.println("-------------");
        System.out.println("The average value of all elements of the array is: " + average);

    }
}




