
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el mes");

        var mes = Integer.parseInt(teclado.nextLine());
        var estacion = "Estación desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otonio";
                break;
        }

        System.out.println("estacion = " + estacion);

    }
}
