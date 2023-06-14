import java.time.LocalTime;


public class HourTeller {
    public static void main(String[] args) {
        LocalTime horaExata = LocalTime.now();
        int hora = horaExata.getHour();

        switch(hora){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Ainda está de madrugada! Bom dia\n" +
                        "A hora exata é: " + horaExata);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("É de manhã! Bom dia\n" +
                        "A hora exata é: " + horaExata);
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Está de tarde! Boa Tarde\n" +
                        "A hora exata é: " + horaExata);
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("Está de noite! Boa Noite\n" +
                        "A hora exata é: " + horaExata);
        }
    }
}
