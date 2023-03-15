package App;

import Entities.TrianguloB;

public class AppBOO {
    public static void main(String[] args) {
        TrianguloB t1 = new TrianguloB();
        TrianguloB t2 = new TrianguloB();

        t1.a = 3.0;
        t1.b = 4.0;
        t1.c = 5.0;

        t2.a = 7.5;
        t2.b = 4.5;
        t2.c = 4.02;

        double px = (t1.a + t1.b + t1.c) / 2;
        double py = (t2.a + t2.b + t2.c) / 2;

        double areat1 = Math.sqrt(px * (px - t1.a) * (px - t1.b) * (px - t1.c));
        double areat2 = Math.sqrt(py * (py - t2.a) * (py - t2.b) * (py - t2.c));

        System.out.println("Área T1: " + areat1);
        System.out.println("Área T2: " + areat2);


        if(areat1 > areat2){
            System.out.println("A área T1 é maior que a área de T2");
        }else{
            System.out.println("A área de T2 é maior que área de T1");
        }
    }
}
