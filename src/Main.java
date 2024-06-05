import java.util.*;

public class Main {

    private static List<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("CRUD de opciones");
            System.out.println("1. CRUD Productos");
            System.out.println("2. salir");
            System.out.println("Ingrese una opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    crearProducto(scanner);
                    break;

                case 0:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static void crearProducto(Scanner scanner) {
        int option;

        do {
            System.out.println("CRUD Productos");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar producto");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir al menu principal");
            System.out.println("Seleccione una opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el id del Producto");
                    int idProducto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese codigo de producto");
                    int codigo = scanner.nextInt();
                    System.out.println("Ingrese la cantidad de producto");
                    int cantidad = scanner.nextInt();
                    productos.add(new Producto(idProducto, nombre, codigo, cantidad));
                    System.out.println("Producto agregado con exito");
                    break;

                case 2:
                    System.out.println("Listar producto");
                    System.out.println("Lista de Productos:");
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del producto a actualizar");
                    idProducto = scanner.nextInt();
                    Producto productoToUpdate = null;
                    for (Producto prod : productos) {
                        if (prod.getIdProducto() == idProducto) {
                            productoToUpdate = prod;
                            break;
                        }
                    }
                    if (productoToUpdate != null) {
                        System.out.println("Ingrese nuevo nombre producto");
                        scanner.nextLine();
                        nombre = scanner.nextLine();
                        System.out.println("Ingrese nuevo codigo producto");
                        codigo = scanner.nextInt();
                        System.out.println("Ingrese nueva cantidad producto");
                        cantidad = scanner.nextInt();

                        productoToUpdate.setNombre(nombre);
                        productoToUpdate.setCodigo(codigo);
                        productoToUpdate.setCantidad(cantidad);
                        System.out.println("Producto actualizado con exito");
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese ID de producto a eliminar: ");
                    idProducto = scanner.nextInt();
                    boolean removed = false;
                    Iterator<Producto> iterator = productos.iterator();
                    while (iterator.hasNext()) {
                        Producto prod = iterator.next();
                        if (prod.getIdProducto() == idProducto) {
                            iterator.remove();
                            removed = true;
                            break;
                        }
                    }
                    if (removed) {
                        System.out.println("Producto eliminado con exito.");
                    } else {
                        System.out.println("Producto no existe.");
                    }
                    break;

                case 0:
                    System.out.println("Volver al menu principal");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (option != 0);
    }
}