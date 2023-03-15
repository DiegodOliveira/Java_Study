package App;

public class AppSOO {
    public static void main(String[] args) {
        double xa = 3.0,
                xb = 4.0,
                xc = 5.0,
                ya = 7.5,
                yb = 4.5,
                yc = 4.02;

        double px = (xa + xb + xc) / 2;
        double py = (ya + yb + yc) / 2;

        double areax = Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
        double areay = Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));

        System.out.println("Área X: " + areax);
        System.out.println("Área Y: " + areay);

        if(areax > areay){
            System.out.println("A área de X é maior que a área de Y ");
        }else{
            System.out.println("A área de Y é maior que a área de X");
        }

    }
}
