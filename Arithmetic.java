import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;
        int product;
        int ratio;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        ratio = number1/number2;

        System.out.printf("A soma é %d%n", sum);
        System.out.printf("O produto é %d%n", product);
        System.out.printf("A razão entre os números é %n%d", ratio);
    }
}
