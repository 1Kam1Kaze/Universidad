
public class PrecioFinalProducto {
  public static void main(String[] args) {
    double PrecioBase = 150.75;
    double descuentoProcentaje = 0.10;
    double ImpuestoIVA = 0.19;
    double MontoDescuento = PrecioBase * descuentoProcentaje;
    double precioConDescuento = PrecioBase - MontoDescuento;
    double montoImpuesto = precioConDescuento * ImpuestoIVA;
    double PrecioFinal = precioConDescuento + montoImpuesto;

    System.out.println("PrecioBase: " + PrecioBase);
    System.out.println("Monto con descuento: " + MontoDescuento);
    System.out.println("Precio con descuento: " + precioConDescuento);
    System.out.println("Monto del impuesto: " + montoImpuesto);
    System.out.println("Precio Final: " + PrecioFinal);
  }  
}
