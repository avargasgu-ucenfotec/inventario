//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Construir 3 productos
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

        //Insertar ruta a lista de imágenes de cada álbum
        album1.setListaImagenes("../img/sgtpepperslonelyheartsclubband_front.jpg");
        album1.setListaImagenes("../img/sgtpepperslonelyheartsclubband_back.jpg");

        album2.setListaImagenes("../img/thriller_front.jpg");
        album2.setListaImagenes("../img/thriller_back.jpg");

        album3.setListaImagenes("../img/nevermind_front.jpg");
        album3.setListaImagenes("../img/nevermind_back.jpg");

        //Construir inventario
        ListaProducto miInventario = new ListaProducto();

        //Insertar productos al inventario
        miInventario.insertarProductoInicio(album1);
        miInventario.insertarProductoInicio(album2);
        miInventario.insertarProductoInicio(album3);

        //Imprimir contenidos del inventario
        miInventario.mostrarLista();

        //Imprimir reporte
        miInventario.imprimirReporte();
    }
}