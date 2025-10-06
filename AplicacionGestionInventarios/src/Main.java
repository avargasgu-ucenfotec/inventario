import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
        menu(); // Adiccion del menu
    }

    public static void menu() throws Exception {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        // Carga inicial de productos
        Producto album1 = new Producto(
                "Sgt. Pepper's Lonely Hearts Club Band",
                10077.1f,
                "Rock",
                "1967",
                10
        );

        Producto album2 = new Producto(
                "Thriller",
                19635.0f,
                "Pop",
                "1982",
                15
        );

        Producto album3 = new Producto(
                "Nevermind",
                7052.5f,
                "Grunge",
                "1991",
                20
        );

        listaProductos.add(album1);
        listaProductos.add(album2);
        listaProductos.add(album3);

        int opcion;

        do {
            out.println("\n===== MENÚ PRINCIPAL =====");
            out.println("1. Agregar producto");
            out.println("2. Mostrar lista de productos");
            out.println("3. Imprimir reporte");
            out.println("4. Modificar producto");
            out.println("5. Eliminar producto");
            out.println("6. Agregar imagen a un producto");
            out.println("0. Salir");
            out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(in.readLine());
            out.println();

            switch (opcion) {
                case 1:
                    out.println("Ingrese el nombre del producto:");
                    String titulo = in.readLine();

                    out.println("Ingrese el precio:");
                    float precio = Float.parseFloat(in.readLine());

                    out.println("Ingrese el género:");
                    String genero = in.readLine();

                    out.println("Ingrese la fecha de lanzamiento:");
                    String fechaLanzamiento = in.readLine();

                    out.println("Ingrese la cantidad disponible:");
                    int cantidad = Integer.parseInt(in.readLine());

                    Producto nuevo = new Producto(titulo, precio, genero, fechaLanzamiento, cantidad);
                    listaProductos.add(nuevo);
                    out.println("Producto agregado exitosamente.\n");
                    break;

                case 2:
                    out.println("===== LISTA DE PRODUCTOS =====");
                    for (Producto p : listaProductos) {
                        out.println(p.toString());
                    }
                    break;

                case 3:
                    out.println("===== REPORTE GENERAL =====");
                    float total = 0;
                    for (Producto p : listaProductos) {
                        total += p.getPrecio();
                        out.println(p.toString());
                    }
                    out.println("------------------------------");
                    out.println("Total acumulado: $" + total);
                    break;

                case 4:
                    out.println("Ingrese el título del producto a modificar:");
                    String tituloModificar = in.readLine();
                    boolean encontrado = false;
                    for (Producto p : listaProductos) {
                        if (p.getTitulo().equalsIgnoreCase(tituloModificar)) {
                            out.println("Ingrese el nuevo precio:");
                            p.setPrecio(Float.parseFloat(in.readLine()));
                            out.println("Ingrese el nuevo género:");
                            p.setGenero(in.readLine());
                            out.println("Ingrese la nueva fecha de lanzamiento:");
                            p.setFechaLanzamiento(in.readLine());
                            out.println("Ingrese la nueva cantidad disponible:");
                            p.setCantidad(Integer.parseInt(in.readLine()));
                            out.println("Producto modificado exitosamente.\n");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        out.println("No se encontró el producto indicado.\n");
                    }
                    break;

                case 5:
                    out.println("Ingrese el título del producto a eliminar:");
                    String tituloEliminar = in.readLine();
                    Producto productoEliminar = null;
                    for (Producto p : listaProductos) {
                        if (p.getTitulo().equalsIgnoreCase(tituloEliminar)) {
                            productoEliminar = p;
                            break;
                        }
                    }
                    if (productoEliminar != null) {
                        listaProductos.remove(productoEliminar);
                        out.println("Producto eliminado exitosamente.\n");
                    } else {
                        out.println("No se encontró el producto indicado.\n");
                    }
                    break;

                case 6:
                    out.println("Ingrese el título del producto al que desea agregar una imagen:");
                    String tituloImagen = in.readLine();
                    boolean encontradoImg = false;
                    for (Producto p : listaProductos) {
                        if (p.getTitulo().equalsIgnoreCase(tituloImagen)) {
                            out.println("Ingrese la ruta de la imagen (ej: .../img/album1.jpg):");
                            String ruta = in.readLine();
                            p.setListaImagenes(ruta);
                            out.println("Imagen agregada exitosamente.\n");
                            encontradoImg = true;
                            break;
                        }
                    }
                    if (!encontradoImg) {
                        out.println("No se encontró el producto indicado.\n");
                    }
                    break;

                case 0:
                    out.println("Saliendo del sistema...");
                    break;

                default:
                    out.println("Opción no válida. Intente de nuevo.\n");
            }

        } while (opcion != 0);
    }
}