import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static ListaProducto lista = new ListaProducto();

    static void main(String[] args) throws Exception {
        // Cargar productos iniciales
        Producto album1 = new Producto("Sgt. Pepper's Lonely Hearts Club Band", 10077.1f, "Rock", "1967", 10);
        Producto album2 = new Producto("Thriller", 19635.0f, "Pop", "1982", 15);
        Producto album3 = new Producto("Nevermind", 7052.5f, "Grunge", "1991", 20);

        album1.setListaImagenes("../img/sgtpepperslonelyheartsclubband_front.jpg");
        album1.setListaImagenes("../img/sgtpepperslonelyheartsclubband_back.jpg");

        album2.setListaImagenes("../img/thriller_front.jpg");
        album2.setListaImagenes("../img/thriller_back.jpg");

        album3.setListaImagenes("../img/nevermind_front.jpg");
        album3.setListaImagenes("../img/nevermind_back.jpg");

        lista.insertarProductoInicio(album1);
        lista.insertarProductoInicio(album2);
        lista.insertarProductoInicio(album3);

        int opcion;
        do {
            out.println("\n---- MENÚ DE GESTIÓN DE INVENTARIO ----");
            out.println("1. Agregar producto al inicio");
            out.println("2. Agregar producto al final");
            out.println("3. Mostrar lista de productos");
            out.println("4. Imprimir reporte de costos");
            out.println("5. Modificar producto existente");
            out.println("6. Agregar imagen a un producto");
            out.println("0. Salir");
            out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(in.readLine());

            switch (opcion) {
                case 1 -> agregarProductoInicio();
                case 2 -> agregarProductoFinal();
                case 3 -> lista.mostrarLista();
                case 4 -> lista.imprimirReporte();
                case 5 -> modificarProducto();
                case 6 -> agregarImagen();
                case 0 -> out.println("Saliendo del sistema...");
                default -> out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    static void agregarProductoInicio() throws Exception {
        out.print("Ingrese el título del producto: ");
        String titulo = in.readLine();
        out.print("Ingrese el precio: ");
        float precio = Float.parseFloat(in.readLine());
        out.print("Ingrese la categoría: ");
        String categoria = in.readLine();
        out.print("Ingrese la fecha de lanzamiento o vencimiento: ");
        String fecha = in.readLine();
        out.print("Ingrese la cantidad: ");
        int cantidad = Integer.parseInt(in.readLine());

        lista.insertarProductoInicio(titulo, precio, categoria, fecha, cantidad);
        out.println("Producto agregado al inicio exitosamente.");
    }

    static void agregarProductoFinal() throws Exception {
        out.print("Ingrese el título del producto: ");
        String titulo = in.readLine();
        out.print("Ingrese el precio: ");
        float precio = Float.parseFloat(in.readLine());
        out.print("Ingrese la categoría: ");
        String categoria = in.readLine();
        out.print("Ingrese la fecha de lanzamiento o vencimiento: ");
        String fecha = in.readLine();
        out.print("Ingrese la cantidad: ");
        int cantidad = Integer.parseInt(in.readLine());

        lista.insertarProductoFinal(titulo, precio, categoria, fecha, cantidad);
        out.println("Producto agregado al final exitosamente.");
    }

    static void modificarProducto() throws Exception {
        if (lista.getPrimero() == null) {
            out.println("No hay productos en la lista.");
            return;
        }

        out.print("Ingrese el título del producto que desea modificar: ");
        String tituloBuscar = in.readLine();

        Producto actual = lista.getPrimero();
        while (actual != null && !actual.getTitulo().equalsIgnoreCase(tituloBuscar)) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            out.println("No se encontró el producto.");
            return;
        }

        out.println("Producto encontrado. Ingrese nuevos datos (deje vacío para mantener el valor actual):");
        out.print("Nuevo título: ");
        String nuevoTitulo = in.readLine();
        if (!nuevoTitulo.isEmpty()) actual.setTitulo(nuevoTitulo);

        out.print("Nuevo precio: ");
        String nuevoPrecio = in.readLine();
        if (!nuevoPrecio.isEmpty()) actual.setPrecio(Float.parseFloat(nuevoPrecio));

        out.print("Nueva categoría: ");
        String nuevoGenero = in.readLine();
        if (!nuevoGenero.isEmpty()) actual.setGenero(nuevoGenero);

        out.print("Nueva fecha: ");
        String nuevaFecha = in.readLine();
        if (!nuevaFecha.isEmpty()) actual.setFechaLanzamiento(nuevaFecha);

        out.print("Nueva cantidad: ");
        String nuevaCantidad = in.readLine();
        if (!nuevaCantidad.isEmpty()) actual.setCantidad(Integer.parseInt(nuevaCantidad));

        out.println("Producto modificado exitosamente.");
    }

    static void agregarImagen() throws Exception {
        if (lista.getPrimero() == null) {
            out.println("No hay productos en la lista.");
            return;
        }

        out.print("Ingrese el título del producto al que desea añadir una imagen: ");
        String titulo = in.readLine();

        Producto actual = lista.getPrimero();
        while (actual != null && !actual.getTitulo().equalsIgnoreCase(titulo)) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            out.println("No se encontró el producto.");
            return;
        }

        out.print("Ingrese la ruta de la imagen (ej: img/album1.jpg): ");
        String ruta = in.readLine();
        actual.setListaImagenes(ruta);
        out.println("Imagen añadida correctamente al producto.");
    }
}