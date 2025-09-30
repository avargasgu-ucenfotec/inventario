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
            String tituloProducto,
            float precioProducto,
            String generoProducto,
            String fechaLanzamientoProducto,
            byte cantidadProducto
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
            byte cantidadProducto
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
}
