
public class HolaMundo {

    public static void main(String args[]) {

        var a = 3;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= valorMinimo && a <= valorMaximo;
        if (resultado) {
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = true;
        var diaDeDescanso = false;
        
        if(vacaciones || diaDeDescanso){
            System.out.println("Padre puede asistir al juego de su hijo");
        }else{
            System.out.println("El padre esta ocupado");
        }

    }
}
