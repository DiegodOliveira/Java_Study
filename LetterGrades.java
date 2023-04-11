import java.util.Scanner;
public class LetterGrades {
    public static void main(String[] args) {
        int total = 0; // Soma as notas
        int gradeCounter = 0; // Números de notas inseridas
        int aCount = 0; // Contagem de notas A
        int bCount = 0; // Contagem de notas B
        int cCount = 0; // Contagem de notas C
        int dCount = 0; // Contagem de notas D
        int fCount = 0; // Contagem de notas F

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s %n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        //  Faz "loop" até o usuário inserir o indicador do fim do arquivo
        while(input.hasNext()){
            int grade = input.nextInt(); // Lê a nota
            total += grade; // Adiciona nota ao total
            ++gradeCounter; // Incrementa o número de notas

            // Incrementa o contador de letras de nota adequado
            switch (grade / 10){
                case 9: // A nota estava entre 90
                case 10: // e 100, inclusivo
                    ++aCount;
                    break; // Sai do switch

                case  8: // Nota esteve entre 90 e 89
                    ++bCount;
                    break;

                case 7: // Nota esteve entre 70 e 79
                    ++cCount;
                    break; // Sai do switch

                case 6: // Nota esteve entre 60 e 69
                    ++dCount;
                    break; // Sai do switch

                default: // Nota foi menor que 6
                    ++fCount;
                    break; // Opcional; fecha o switch de qualquer maneira

            }

            // Exibe o reltório da nota
            System.out.printf("%nGrade Report:%n");

            // Se o usuário inseriu pelo menos uma nota...
            if (gradeCounter != 0){
                // Calcula a média de todas as notas inseridas
                double average = (double)total / gradeCounter;

                // Gera a saída de resumo dos resultados
                System.out.printf("Total of %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class average is %.2f%n", average);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                        "Number of students that received each grade:",
                        "A: ", aCount, // Exibe número de notas A
                        "B: ", bCount, // Exibe número de notas B
                        "C: ", cCount, // Exibe número de notas C
                        "D: ", dCount, // Exibe número de notas D
                        "F:  ", fCount); // Exibe número de notas F
            }else
                System.out.println("No grades were entered"); // Caso nenhuma nota tenha sido inserida
        }
    }
}
