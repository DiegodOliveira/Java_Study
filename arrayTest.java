import java.util.Scanner;
public class arrayTest {
    public static void main(String[] args) {
        //Definindo o tamanho do array.
        /*int notas[] = new int[20];

        notas[0] = 1;//definindo o índice 0 como número 1.
        System.out.println(notas[0]);*///Retorna o número 1 pois está no índice 0.

        /*int notas[] = {10,9,8,2};//Define um array com 4 espaços, tendo os seus respectivos valores

        System.out.println(notas[2]);*/
        /*int notas[] = new int[]{10,9,8,2};//O mesmo principio da anterior, diferenciando pela adição de new.


        System.out.println(notas[1]);*/

        Scanner sc = new Scanner(System.in);

        float notas[] = new float[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite a nota do aluno: ");
            notas[i] = sc.nextFloat();
        }
        sc.close();

        float totalNotas = 0;
        for(int i = 0; i < notas.length; i++){
            totalNotas = totalNotas + notas[i];
        }
        float mediaNotas = totalNotas/notas.length;
        System.out.println("A média de notas foi: " + mediaNotas);
    }
}
