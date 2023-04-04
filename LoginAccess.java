package Login.exercicio;
import java.util.Scanner;
public class LoginAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu usario: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        LoginServer login = new LoginServer(usuario, senha);

        
    }
}
