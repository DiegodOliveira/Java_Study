import java.util.Scanner;
public class opcao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String opcao;

        do{
            System.out.println("Digite um número: ");
            int n1 = sc.nextInt();
            System.out.println("Digite um número: ");
            int n2 = sc.nextInt();
            int soma = n1 + n2;
            System.out.printf("A soma é %d\n", soma);
            System.out.println("Deseja fazer outra soma?");
            opcao = sc.next();
        }while(opcao.equals("S"));
        sc.close();
    }
}
