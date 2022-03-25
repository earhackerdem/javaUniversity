//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 10;

        
        if(edad >= 18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor de edad");
        

    }
}
