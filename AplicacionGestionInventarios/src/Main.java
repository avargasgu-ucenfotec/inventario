//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaProducto miInventario = new ListaProducto();

        miInventario.insertarProductoInicio(
                "Sgt. Pepper's Lonely Hearts Club Band",
                10077.1f,
                "Rock",
                "1967",
                10
        );

        miInventario.insertarProductoInicio(
                "Thriller",
                19635.0f,
                "Pop",
                "1982",
                15
        );

        miInventario.insertarProductoInicio(
                "Nevermind",
                7052.5f,
                "Grunge",
                "1991",
                20
        );

        miInventario.imprimirReporte();
    }
}