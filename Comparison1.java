import java.util.Scanner;
public class Comparison1 {
    public static void main(String[] args){
        //Cria Scanner para obter a entrada através da linha de comando.
        Scanner input = new Scanner(System.in);

        int number1; //Primeiro número a comparar.
        int number2; //Segundo número a comparar.

        System.out.print("Enter first integer: ");//Prompt
        number1 = input.nextInt();//Lê primeiro número fornecido pelo usuário.

        System.out.print("Enter second integer: ");//Prompt
        number2 = input.nextInt();//Lê o segundo número fornecido pelo usuário.

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
    }
}
