
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {

        var numero = 2;
        var numeroTexto = "Valor desconocido";

        numeroTexto = switch (numero) {
            case 1 -> "Numero uno";
            case 2 -> "Numero dos";
            case 3 -> "Numero tres";
            case 4 -> "Numero cuatro";
            default -> "Caso no encontrado";
        };

        System.out.println(" numero texto = " + numeroTexto);

    }
}
