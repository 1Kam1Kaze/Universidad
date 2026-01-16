public class Perro extends Animal {
  private String raza;

  public Perro(String nombre, int edad, String raza) {
    super(nombre,edad);
    this.raza = raza;
    System.out.println("Se ha creado un perro con raza: " + raza);
  }

  @Override
  public void hacerSonido() {
    System.out.println("¡Guau,guau!");
  }

  public void morder() {
    System.out.println("El perro muerde.");
  }
}
