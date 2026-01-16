
public class PruebaAnimales {
  public static void main(String[] args) {
    Animal miAnimal = new Animal("Fido",5);

    miAnimal.mostrarInformacion();
    miAnimal.hacerSonido();

    Perro miPerro = new Perro("Buddy", 3, "Labrador");
    miPerro.mostrarInformacion();
    miPerro.hacerSonido();
    miPerro.morder();
  }
}
