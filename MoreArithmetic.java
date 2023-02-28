import java.util.Scanner;
public class MoreArithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int product;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter second integer: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        average = (number1 + number2 + number3) / 3;
        product = number1 * number2 * number3;

        System.out.printf("\nA soma é %d\n", sum);
        System.out.printf("A média é %d%n", average);
        System.out.printf("O produto é %d\n", product);


        if ( number1 > number2 && number1>number3)
            System.out.printf("%d é o maior número, %d e %d são os menores números\n", number1, number2, number3);

        if ( number2 > number1 && number2 > number3)
            System.out.printf("%d é o maior número, %d e %d são os menores números\n", number2, number1, number3);

        if ( number3 > number1 && number3 > number2)
            System.out.printf("%d é o maior número, %d e %d são os menores números\n", number3, number1, number2);
    }
}
