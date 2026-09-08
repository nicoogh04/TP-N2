// La clase Producto representa un producto con sus atributos básicos.

public class Producto {
    // Atributos del producto: nombre, precio y stock.
    private String nombre;
    private double precio;
    private int stock;

    public void setPrecio(double precio) {
    if (precio >= 0) {
        this.precio = precio;
    } else {
        System.out.println("El precio no puede ser negativo.");
    }
}

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // Constructor: inicializa los valores del producto cuando se crea un objeto.
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre; // Asigna el nombre recibido al atributo nombre.
        this.precio = precio; // Asigna el precio recibido al atributo precio.
        this.stock = stock; // Asigna el stock recibido al atributo stock.
    }

    // Método getter para obtener el nombre del producto.
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener el precio del producto.
    public double getPrecio() {
        return precio;
    }

    // Método getter para obtener la cantidad de stock del producto.
    public int getStock() {
        return stock;
    }

    // Método que devuelve una cadena con los datos del producto formateados.
    public String mostrarInformacion() {
        return "Producto: " + nombre +
               "\nPrecio: $" + precio +
               "\nStock: " + stock +
               "\n¿Hay stock?: " + (tieneStock() ? "Sí" : "No"); // Agrega la información sobre si hay stock disponible.
    }
    // Método que verifica si el producto tiene stock disponible.
    public boolean tieneStock(){
        return stock > 0;
    }
}