import java.util.Scanner;
public class TestadoraHome {
    public static void main(String[] args) {
        /*double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.print(valorInt);*/
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.print("Enter integer x: ");
        x = sc.nextInt();

        System.out.print("Enter integer y: ");
        y = sc.nextInt();

        int soma = x + y;
        int subtracao =  x - y;
        int multiplicacao  = x * y;
        double divisao = x / y;
        int resto = x%y;

        System.out.println("Resultado da adição: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
        System.out.println("Resultado da divisão: " + divisao);
        System.out.println("Resultado do módulo: " + resto);

        x++;
        System.out.println("Resultado do incremento de x: " + x);

        y--;
        System.out.println("Resultado do decremento de y: " + y);

        x += 10;
        System.out.println("Atribuição aditiva de x: " + x);

        y -= 10;
        System.out.println("Atribuição subtrativa de y: " + y);

    }
}
