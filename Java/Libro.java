
public class Libro {

  private String titulo;
  private String autor;
  private String ISBN;
  private int paginas;
  private double precio;

  public Libro() throws InvalidISBNException {
    this.setTitulo("Sin titulo");
    this.setAutor("Sin autor");
    this.setISBN("Sin codigo de barra");
    this.setPaginas(0);
    this.setPrecio(0.0);
    System.out.println("¡Un nuevo libro generico ha sido creado!");
  }

  public Libro(String titulo, String autor, String ISBN, int paginas, double precio) throws InvalidISBNException {
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setISBN(ISBN);
    this.setPaginas(paginas);
    this.setPrecio(precio);
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public String getISBN() {
    return this.ISBN;
  }

  public int getPaginas() {
    return this.paginas;
  }
 
  public double getPrecio() {
    return this.precio;
  }

  public void setTitulo(String titulo) {
    if (titulo != null && !titulo.trim().isEmpty()) {
      this.titulo = titulo;
    } else {
      System.out.println("Error: El título no puede estar vacío.");
      this.titulo = "TITULO DESCONOCIDO";
    }
  }

  public void setAutor(String autor) {
    if (autor != null && !autor.trim().isEmpty()) {
      this.autor = autor;
    } else {
      System.out.println("Error: El autor no puede estar vacio. ");
      this.autor = "DESCONOCIDO";
    }
  }

  public void setISBN(String ISBN) throws InvalidISBNException {
    if (ISBN != null && !ISBN.trim().isEmpty()) {
      this.ISBN = ISBN;
    } else {
      throw new InvalidISBNException("El ISBN no puede ser nulo o vacio");
    }
  }

  public void setPaginas(int paginas) {
    if (paginas > 0 ) {
      this.paginas = paginas;
    } else {
      System.out.println("No se encontro cantidad de paginas");
      this.paginas = 0;
    }
  }
  
  public void setPrecio(double precio) {
    if (precio >= 0.0 ) {
      this.precio = precio;
    } else {
      System.out.println("Precio negativo");
      this.precio = 0.0;
    }
  }

  public void nombrar() {
    System.out.println("El libro se llama " + titulo + ", lo escribio " + autor + ", el codigo de barra es " + ISBN + ", tiene esta cantidad de paginas " + paginas + ", y su precio es " + precio + ".");
  }

  public void mostrarInfo() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("ISBN: " + this.ISBN);
    System.out.println("Páginas: " + this.paginas);
    System.out.println("Precio: $" + this.precio);
  }

  public static void main(String[] args) {
    System.out.println("----Manejo de Excepciones----");
    try {
      System.out.println("\nIntentando crear libroValido con ISBN valido...");
      Libro libroValido = new Libro("Cien años de soledad", "Gabo", "978-84-376-0494-7", 496, 25.99);
      libroValido.mostrarInfo();
    } catch (InvalidISBNException e) {
      System.out.println("¡Error al crear libroValido! " + e.getMessage());
    }

    try {
        System.out.println("\nIntentando crear libroInvalido con ISBN INVÁLIDO...");
        Libro libroInvalido = new Libro("Título X", "Autor Y", "", 100, 10.0);
        libroInvalido.mostrarInfo();
    } catch (InvalidISBNException e) {
        System.out.println("¡Excepción capturada al crear libroInvalido! Mensaje: " + e.getMessage());
    }

    System.out.println("\nIntentando modificar ISBN de un libro existente...");
    Libro libroExistente = null;
    try {
         libroExistente = new Libro("Libro Existente", "Autor", "123-456", 200, 15.0);
         System.out.println("ISBN actual: " + libroExistente.getISBN());

         libroExistente.setISBN(null);
         System.out.println("ISBN después de setear inválido: " + libroExistente.getISBN());
    } catch (InvalidISBNException e) {
        System.out.println("¡Excepción capturada al modificar ISBN! Mensaje: " + e.getMessage());
        if (libroExistente != null) {
          System.out.println("ISBN de libroExistente sigue siendo: " + libroExistente.getISBN());
      }
    }
  }
}
