import java.util.ArrayList;

public class Producto {

    //Clase "Producto" que representa un álbum de música.

    //Atributos
    private String titulo;                      // Título del álbum
    private float precio;                       // Precio unitario del álbum
    private String genero;                      // Género musical del álbum
    private String fechaLanzamiento;            // Año de lanzamiento del álbum
    private int cantidad;                       // Cantidad de álbumes de un mismo título presentes en el inventario
    private ArrayList<String> listaImagenes;    // Lista de rutas a las imágenes del álbum
    private Producto siguiente;                 // Siguiente producto en la lista enlazada simple de álbumes

    //Métodos
    //Constructor
    public Producto(
            String tituloObjeto,
            float precioObjeto,
            String generoObjeto,
            String fechaLanzamientoObjeto,
            int cantidadObjeto
    ){
        titulo = tituloObjeto;
        precio = precioObjeto;
        genero = generoObjeto;
        fechaLanzamiento = fechaLanzamientoObjeto;
        cantidad = cantidadObjeto;
        listaImagenes = new ArrayList<String>();
        siguiente = null;
    }

    public Producto(){}

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public float getPrecio(){
        return precio;
    }

    public String getGenero(){
        return genero;
    }

    public String getFechaLanzamiento(){
        return fechaLanzamiento;
    }

    public int getCantidad(){
        return cantidad;
    }

    public Producto getSiguiente(){
        return siguiente;
    }

    //Setters
    public void setTitulo(String nuevoTitulo){
        titulo = nuevoTitulo;
    }

    public void setPrecio(float nuevoPrecio){
        precio = nuevoPrecio;
    }

    public void setGenero(String nuevoGenero){
        genero = nuevoGenero;
    }

    public void setFechaLanzamiento(String nuevoFechaLanzamiento){
        fechaLanzamiento = nuevoFechaLanzamiento;
    }

    public void setCantidad(int nuevoCantidad){
        cantidad = nuevoCantidad;
    }

    public void setSiguiente(Producto nuevoSiguiente){
        siguiente = nuevoSiguiente;
    }
}
