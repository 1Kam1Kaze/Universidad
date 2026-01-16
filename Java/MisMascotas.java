
public class MisMascotas {
    public static class Perro {
      String nombre;
      String raza;
      int edad;

      public void ladrar() {
          System.out.println("¡Guau, guau!");
      }

      public void comer(String comida) {
          System.out.println(nombre + " está comiendo " + comida + ".");
      }

      public void dormir() {
          System.out.println(nombre + " está durmiendo zzz...");
      }
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();

        miPerro.nombre = "Firulais";
        miPerro.raza = "Golden Retriever";
        miPerro.edad = 3;

        System.out.println("Mi perro se llama " + miPerro.nombre + " y tiene " + miPerro.edad + " años.");
        miPerro.ladrar();
        miPerro.comer("croquetas");
        miPerro.dormir();

        System.out.println("\n--- Otro Perro ---");

        Perro tuPerro = new Perro();
        tuPerro.nombre = "Max";
        tuPerro.raza = "Pastor Alemán";
        tuPerro.edad = 5;

        System.out.println("Tu perro se llama " + tuPerro.nombre + " y tiene " + tuPerro.edad + " años.");
        tuPerro.ladrar();
        tuPerro.comer("huesos");
    }
}
