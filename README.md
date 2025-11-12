# Aplicación de gestión de inventarios

El presente trabajo consiste en el desarrollo de una aplicación para la gestión de un sistema de ventas de productos en línea. Para satisfacer dicha finalidad, el sistema por desarrollar debe implementar y utilizar estructuras de datos dinámicas para el control del inventario de productos y de los pedidos realizados.

## Primer avance
### Requerimientos
- [ ] La aplicación de gestión del sistema de ventas de productos debe permitir la inserción de **Productos** a una **ListaProductos**, la cual se debe implementar como una lista enlazada simple.
- [ ] De cada **Producto** hace falta registrar su **nombre**, **precio**, **categoria** y **fechaVencimiento** (si aplica), además de una **cantidad**, la cual representará la cantidad de unidades del **Producto** que se agregarán al **carrito** del **Cliente** y la cantidad de unidades del **Producto** que la **Tienda** tiene en **inventario**.
- [ ] Cada **Producto** debe además contener una **listaImagenes**, la cual se puede implementar mediante un objeto de la clase **ArrayList** que almacene **Strings** con las rutas de las imágenes, las cuales deben ubicarse dentro de un directorio que forme parte del proyecto de Java.
- [ ] La estructura de datos debe tener implementados todos los métodos habituales asociados con una lista enlazada simple, permitiendo la inserción tanto al inicio como al final de la lista, la modificación de los **Productos** (incluyendo la añadidura de imágenes a su lista), y tener además un método adicional que permita recorrer la **ListaProductos** e imprimir un reporte de los costos totales correspondiente a cada **Producto** que incluye en función de su cantidad, así como el costo total acumulado de la lista completa.
- [ ] Además de las dos clases de entidad requeridas para la implementación de la **ListaProductos** como tal (i.e., la clase nodo y la clase estructura), cada grupo debe desarrollar un **menu()** de consola dentro de una clase funcional que permita interactuar con la lista de forma intuitiva y amigable con el usuario.
- [ ] El menú se debe alojar dentro de la clase **Main** del programa, donde también debe estar la rutina **main()** que lo invoque y lo haga funcionar correctamente.

## Segundo avance
### Requerimientos
- [ ] 
