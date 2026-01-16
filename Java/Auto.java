
public class Auto {
  String marca;
  String modelo;
  int year;
  String color;
  public static void main(String[] args) {

    Auto miAuto = new Auto();

    miAuto.marca = "Dodge";
    miAuto.modelo = "Challenger";
    miAuto.year = 1969;
    miAuto.color = "Black";

    System.out.println("Mi coche ideal es marca: " + miAuto.marca);
    System.out.println("Mi modelo ideal es: " + miAuto.modelo);
    System.out.println("El year de mi coche es: " + miAuto.year);
    System.out.println("El color de mi coche es: " + miAuto.color);


  }
}
