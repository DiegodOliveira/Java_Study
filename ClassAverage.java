import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10){
            System.out.println("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }

        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);*/

        //Nesse código em vez de usar contadores e inicializadores será usado um valor sentinela.

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("Enter grade or -1 to quit");
        int grade = input.nextInt();
        // Enquanto o valor for diferente de -1, o programa acumula a nota em total.
        while(grade != -1){
            total += grade;
            gradeCounter++;

            System.out.println("Enter grade or -1 to quit");
            grade = input.nextInt();
        }
        // Se a quantidade de notas for diferente de 0, será feito a média das notas.
        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }else{
            System.out.println("No grades were entered");
        }
    }
}
