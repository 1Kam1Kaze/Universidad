public class PruebaPerros {

  public static class Perro {
    String nombre;
    String raza;
    int edad;

    public Perro() {
      this.nombre = "Sin nombre";
      this.raza = "Desconocida";
      this.edad = 0;
      System.out.println("¡Un perrito generico ha sido creado!");
    }

    public Perro(String nombrePerro, String razaPerro, int edadPerro) {
      this.nombre = nombrePerro;
      this.raza = razaPerro;
      this.edad = edadPerro;
      System.out.println("¡Un perrito llamado " + this.nombre + " ha sido creado.");
    }

    public void ladrar() {
      System.out.println(this.nombre + "dice: ¡Guau,Guau!");
    }

    public String obtenerDescripcion() {
      return this.nombre + " es un " + this.raza + " de " + this.edad + " años.";
    }
  }

  public static void main(String[] args) {
    System.out.println("-------------- Prueba Perro --------------");

    System.out.println("\nIntentando crear perro 1 con constructor vacio");
    Perro perro1 = new Perro();
    System.out.println("Información de Perro1: " + perro1.obtenerDescripcion());
    perro1.ladrar();

    System.out.println("\nIntentando crear perro2 con constructor con parámetros...");
    Perro perro2 = new Perro("Buddy", "Labrador", 2); // Creamos la instancia con datos iniciales
    System.out.println("Información de Perro2: " + perro2.obtenerDescripcion());
    perro2.ladrar();
  }
}
