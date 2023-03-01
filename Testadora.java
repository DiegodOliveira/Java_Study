public class Testadora {
    public static void main(String[] args){
        String nome = "Diego de Oliveira";
        double altura = 1.77;
        double peso = 99.7;
        boolean fumante = false;

        boolean praticaAtividade = true;
        int atividadeSemana = 4;

        boolean dorSentida = true;
        int intensidadeDor = 8;

        if (praticaAtividade == true){
            System.out.println("O paciente pratica atividade física");

            if(atividadeSemana > 3){
                System.out.println("Boa quantidade de endorfina");
            }else{
                System.out.println("Precisa melhorar");
            }
        }

        if (dorSentida == true){
            System.out.println("O paciente sente dor");
            if(intensidadeDor > 5){
                System.out.println("Sente uma dor muito forte!");
            }else{
                System.out.println("Vamos tratar com medicamento");
            }
        }
    }
}
