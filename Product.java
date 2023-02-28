import java.util.Scanner;//Programa utiliza Scanner

public class Product {
      public static void main(String[] args){
          //Cria Scanner para obter entrada a partir da janela de comando.
          Scanner input = new Scanner(System.in);

          int x;//Primeiro número dado pelo usuário.
          int y;//Segundo número dado pelo usuário.
          int z;//Terceiro número dado pelo usuário.
          int result;//Produto dos números.

          System.out.print("Enter first integer: ");//Solicita entrada.
          x = input.nextInt();//Lê o primeiro número.

          System.out.print("Enter second integer: ");//Solicita entrada.
          y = input.nextInt();//Lê o segundo número.

          System.out.print("Enter third integer: ");//Solicita entrada.
          z = input.nextInt();//Lê o terceiro número.

          result = x * y * z;//Calcula o produto dos números

          System.out.printf("Result is %d%n", result);
      }
}
