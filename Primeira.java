public class Primeira {
    public static void main(String[] args){

        ContaLogin cl1 = new ContaLogin();
        ContaLogin cl2 = new ContaLogin();
        ContaLogin cl3 = new ContaLogin();

        cl1.setNome("Diego", 10);

        System.out.print("Cl1 "+ cl1.getNome());


    }
}
