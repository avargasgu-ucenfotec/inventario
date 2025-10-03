public class ListaProducto {

    //Clase "ListaProducto" que representa una colección de álbumes de música.

    //Atributos
    private Producto primero;

    //Métodos
    //Constructor
    public ListaProducto(){
        primero = null;
    }

    //Getters
    public Producto getPrimero(){
        return primero;
    }

    //Setters
    public void setPrimero(Producto nuevoPrimero){
        primero = nuevoPrimero;
    }

    //Insertar producto al inicio de una lista enlazada simple
    public void insertarProductoInicio(
            Producto nuevoProducto
    ){
        nuevoProducto.setSiguiente(primero);
        setPrimero(nuevoProducto);
    }

    //Insertar producto al inicio de una lista enlazada simple
    public void insertarProductoInicio(
            String tituloProducto,
            float precioProducto,
            String generoProducto,
            String fechaLanzamientoProducto,
            int cantidadProducto
    ){
        Producto nuevoProducto = new Producto(
                tituloProducto,
                precioProducto,
                generoProducto,
                fechaLanzamientoProducto,
                cantidadProducto);
        nuevoProducto.setSiguiente(primero);
        setPrimero(nuevoProducto);
    }

    //Insertar producto al final de la lista enlazada simple
    public void insertarProductoFinal(
            String tituloProducto,
            float precioProducto,
            String generoProducto,
            String fechaLanzamientoProducto,
            int cantidadProducto
    ){
        Producto nuevoProducto = new Producto(
                tituloProducto,
                precioProducto,
                generoProducto,
                fechaLanzamientoProducto,
                cantidadProducto);
        if(primero == null){
            setPrimero(nuevoProducto);
            return;
        }
        Producto productoTemp = primero;
        while(productoTemp.getSiguiente() != null){
            productoTemp = productoTemp.getSiguiente();
        }
        productoTemp.setSiguiente(nuevoProducto);
    }

    //Imprimir elementos de una lista de productos
    public void mostrarLista(){
        if(primero == null){
            System.out.println("Inventario vacío.\n");
            return;
        }
        Producto productoActual = primero;
        while(productoActual != null){
            System.out.println(productoActual);
            productoActual = productoActual.getSiguiente();
        }
    }

    //Imprimir reporte de costos totales
    public void imprimirReporte(){
        String tablaSuperior = "| %-40s | %-10.1f | %-8d | %-10.1f |%n";
        String tablaSeparador = "+------------------------------------------+------------+----------+------------+%n";
        String tablaInferior = "| %-40s | %-10s | %-8s | %-10.1f |%n";
        String tablaTitulos = "| Título                                   | Precio     | Cantidad | Total      |%n";
        String tablaEncabezado = "| Reporte de costos                        |            |          |            |%n";
        System.out.format(tablaSeparador);
        System.out.format(tablaEncabezado);
        System.out.format(tablaSeparador);
        System.out.format(tablaTitulos);
        System.out.format(tablaSeparador);
        if(primero == null){
            System.out.format(tablaSuperior, "N/A", 0.0f, 0, 0.0f);
            System.out.format(tablaSeparador);
            System.out.format(tablaInferior, "", "", "", 0.0f);
            System.out.format(tablaSeparador);
            return;
        }
        float contadorProducto;
        float contadorTotal = 0.0f;
        Producto productoActual = primero;
        while(productoActual != null){
            contadorProducto = productoActual.getCantidad() * productoActual.getPrecio();
            System.out.format(
                    tablaSuperior,
                    productoActual.getTitulo(),
                    productoActual.getPrecio(),
                    productoActual.getCantidad(),
                    contadorProducto
            );
            productoActual = productoActual.getSiguiente();
            contadorTotal += contadorProducto;
        }
        System.out.format(tablaSeparador);
        System.out.format(tablaInferior, "", "", "", contadorTotal);
        System.out.format(tablaSeparador);
    }
}
