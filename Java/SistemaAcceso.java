
public class SistemaAcceso {
  public static void main(String[] args) {
    int ConservarContrasena = 1234;
    int ContrasenaIngresada =   5678;
    if (ContrasenaIngresada == ConservarContrasena) {
      System.out.println("Contrasena Correcta"); }
    else if (ContrasenaIngresada < 1000 ) {
      System.out.println("Contrasena incorrecta, debe tener al menos 4 digitos"); }
    else {
      System.out.println("Contrasena Incorrecta");
    }
  }
}
