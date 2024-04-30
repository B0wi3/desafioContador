import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The second parameter must be greater then the first, otherwise the program will throw an exception.");

        System.out.println("Enter a integer: ");
        int inputOne = scanner.nextInt();

        System.out.println("Enter another integer: ");
        int inputTwo = scanner.nextInt();

        try {
            count(inputOne, inputTwo);
        } catch (invalidParamsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void count(int inOne, int inTwo) throws invalidParamsException {
        if (inOne >= inTwo) {
            throw new invalidParamsException("The second parameter must be greater than the first.");
        }

        int counter = inTwo - inOne;
        for (int i = 0; i < counter; i++) {
            System.out.println("Printing number " + (i + 1));
        }
    }
}
