
public class HolaMundo {

    public static void main(String args[]) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        
        System.out.println("resultado  resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 = 3D/ b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado = " + resultado);
        
        
        if(a % 2 ==0)
            System.out.println("Es número par");
        else
            System.out.println("Es número impar");

    }
}
