public class TesteMain {
    public static void main(String[] args) {
        // String facu = "FIAP - A melhor faculdade de tecnologia";
        // int posicao = facu.indexOf("a");
        // System.out.println("A posição de \"a\" é a " + posicao);
        String nome = "FIAP";
        String slogan = "A melhor faculdade de programação";
        String faculdade = nome.concat(" - ").concat(slogan);
        //System.out.println(faculdade);
        //faculdade += " - ";
        //faculdade += slogan;
        System.out.println(faculdade);
        String nome2 = "fiap";
        /*if(nome.equalsIgnoreCase(nome2)){
            System.out.println("Os nomes são iguais");
        }else{
            System.out.println("Os nomes são diferentes");
        }*/
        String facu = "FIAP - A melhor faculdade de tecnologia";
        if(facu.startsWith("FIAP")){
            System.out.println("A string começa com FIAP");
        }else{
            System.out.println("A string não começa com FIAP");
        }

        if(facu.endsWith("gia")){
            System.out.println("A string termina com \"gia\"");
        }else{
            System.out.println("A string não termina com \"gia\"");
        }

        int carateres = facu.length();
        System.out.printf("A string tem %d caracteres\n", carateres);

        char caractere = facu.charAt(1);
        System.out.println(" o segundo caractere da string é " + caractere);
    }
}
