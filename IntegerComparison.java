import java.util.Scanner;
public class IntegerComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.println("These numbers are equal");

        if (number1 > number2)
            System.out.printf("%d is larger", number1);

        if (number2 > number1)
            System.out.printf("%d is larger", number2);

    }
}
