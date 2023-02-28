//Programa de adição que insere dois numeros, então exibe a soma deles.
import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Cria um Scanner para obter entrada a partir da janela de comando
        int number1;//Primeiro número a somar.
        int number2;//Segundo número a somar.
        int sum;//Soma de number1 e number2.

        System.out.print("Enter first integer: ");//Prompt
        number1 = input.nextInt();//Lê o primeiro número fornecido pelo usuário.

        System.out.print("Enter second integer: ");//Prompt
        number2 = input.nextInt();//Lê o segundo número fornecido pelo usuário.

        sum = number1 + number2;//Soma os números, depois armazena o total em sum.

        System.out.printf("Sum is %d%n", sum);//Exibe a soma.
    }


}
