package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencai {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Mike";
        System.out.println("personal nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }

    public static void cambiarValor(Persona persona) {
        persona.nombre = "Herminio";
    }
}
