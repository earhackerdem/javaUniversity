
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {

        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
               continue;
            }
             System.out.println("contador = " + contador);
        }

//        for (var contador = 0; contador < 3; contador++) {
//            if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }
    }
}
