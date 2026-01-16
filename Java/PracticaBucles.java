
public class PracticaBucles {
  public static void main(String[] args) {
    int contador = 5;
    int suma = 0;
    System.out.println("");
    while (contador > 0) {
      System.out.println("Despegue en: " + contador);
      contador--;
      if (contador < 1) {
        System.out.println("¡Lanzamiento!");
      }
    }
    System.out.println("\nSuma con el for");
    for (int i=1; i<=10; i++) {
      suma += i;
    }
    System.out.println("La suma de los números del 1 al 10 es: " + suma + "\n");
  }
}
