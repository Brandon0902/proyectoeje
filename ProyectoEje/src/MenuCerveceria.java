import java.util.*;

public class MenuCerveceria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Map<String, Integer>> sucursales = new HashMap<>();

        while (true) {
             System.out.println("Bienvenido al Sistema de la cervezaria Modelo");
            // Menú de opciones
            System.out.println("¿Eres minorista, surtidor o cliente?");
            String usuario = input.nextLine();

            if (usuario.equals("minorista") || usuario.equals("surtidor")) {
                System.out.println("¿De qué sucursal eres Gaudalajara o Tijuana?");
                String sucursal = input.nextLine();
                Map<String, Integer> inventario = sucursales.getOrDefault(sucursal, new HashMap<>());
                sucursales.put(sucursal, inventario);

                Set<String> productosPermitidos = new HashSet<>(Arrays.asList(
                        "Cerveza", "Cerveza Ligth", "Cerveza Cero", "Caguamas", "Ampolletas"));

                while (true) {
                    System.out.println("\nEstos son los productos que puedes agregar");
                    System.out.println("Cerveza");
                    System.out.println("Cerveza Ligth");
                    System.out.println("Cerveza Cero");
                    System.out.println("Caguamas");
                    System.out.println("Ampolletas");

                    System.out.println("¿Qué producto deseas agregar?");
                    String producto = input.nextLine();

                    if (!productosPermitidos.contains(producto)) {
                        System.out.println("Producto no permitido. Por favor ingresa uno de los productos permitidos.");
                        continue; // Continuar con el siguiente ciclo del bucle
                    }
                    // El producto es válido, continuar con el código
                
                

                    System.out.println("¿Cuánta cantidad tienes?");
                    int cantidad = input.nextInt();
                    input.nextLine(); // consumir el salto de línea

                    inventario.put(producto, inventario.getOrDefault(producto, 0) + cantidad);

                    System.out.println("¿Deseas agregar otro producto? (S/N)");
                    String respuesta = input.nextLine();
                    if (respuesta.equalsIgnoreCase("N")) {
                        break;
                    }
                }
                System.out.println("Otras opciones que puedes realizar?");
                System.out.println("1. Ninguna de estas opcionesmino");
                System.out.println("2. Modificar un producto.");
                System.out.println("3. Borrar producto.");

                int opcion = input.nextInt();
                input.nextLine(); // consumir el salto de línea

                switch (opcion) {
                    case 1:
                        System.out.println("Perfecto");
                        break;
                    case 2:
                        // Código para modificar un producto
                        System.out.println("¿Qué producto deseas modificar?");
                        String productoModificar = input.nextLine();

                        if (!inventario.containsKey(productoModificar)) {
                            System.out.println("El producto no existe en el inventario.");
                            break;
                        }

                        System.out.println("¿Cuál es la nueva cantidad?");
                        int nuevaCantidad = input.nextInt();
                        input.nextLine(); // consumir el salto de línea

                        inventario.put(productoModificar, nuevaCantidad);
                        System.out.println("Producto modificado exitosamente.");
                        break;
                    case 3:
                        // Código para borrar un producto
                        System.out.println("¿Qué producto deseas borrar?");
                        String productoBorrar = input.nextLine();

                        if (!inventario.containsKey(productoBorrar)) {
                            System.out.println("El producto no existe en el inventario.");
                            break;
                        }

                        inventario.remove(productoBorrar);
                        System.out.println("Producto borrado exitosamente.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }

                System.out.println("Inventario de la sucursal " + sucursal + ": " + inventario);
            }

            if (usuario.equals("cliente")) {
                while (true) {
                    System.out.println("¿En qué sucursal deseas comprar?");
                    String sucursal = input.nextLine();
                    Map<String, Integer> inventario = sucursales.get(sucursal);
                    if (inventario == null) {
                        System.out.println("La sucursal no existe");
                        continue;
                    }

                    System.out.println("Productos disponibles en " + sucursal + ": " + inventario);

                    if (!inventario.isEmpty()) {
                        System.out.println("¿Qué producto deseas comprar?");
                        String producto = input.nextLine();
                        if (!inventario.containsKey(producto)) {
                            System.out.println("El producto no existe en la sucursal");
                            continue;
                        }

                        System.out.println("¿Cuánta cantidad deseas comprar?");
                        int cantidad = input.nextInt();
                        input.nextLine(); // consumir el salto de línea

                        if (inventario.get(producto) < cantidad) {
                            System.out.println("No hay suficiente cantidad del producto en la sucursal");
                            continue;
                        }

                        inventario.put(producto, inventario.get(producto) - cantidad);

                        System.out.println("Compra realizada: " + cantidad + " unidades de " + producto + inventario);

                        System.out.println("¿Deseas comprar otro producto? (S/N)");
                        String respuesta = input.nextLine();
                        if (respuesta.equalsIgnoreCase("N")) {
                            break;
                        }
                    } else {
                        System.out.println("No hay productos disponibles en esta sucursal");
                        break;
                    }
                }
            } else {
                System.out.println("Acceso denegado");
            }

            System.out.println("¿Deseas realizar otra operación? (S/N)");
            String respuesta = input.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("Saliendo del Programa....");
                break;
            }
        }
    }
}

