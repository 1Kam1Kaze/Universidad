
public class Animal {
  private String nombre;
  private int edad;

  public Animal(String nombre, int edad) {
    this.nombre = nombre ;
    this.edad = edad;
    System.out.println("Se hace creado un animal: " + nombre);
  }

  public void hacerSonido() {
    System.out.println("El animal hace un sonido...");
  }

  public void mostrarInformacion() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Edad: " + this.edad + " años");
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }
}
