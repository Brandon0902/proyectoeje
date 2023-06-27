import java.util.*;

public class DiccionarioContactos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionSucursal;
        
        // Se muestra el menú de selección de sucursal al usuario
        do {
            System.out.println("Seleccione una sucursal:");
            System.out.println("1. Sucursal 1");
            System.out.println("2. Sucursal 2");
            System.out.println("3. Sucursal 3");
            System.out.println("4. Salir");
            
            opcionSucursal = scanner.nextInt();
            
            /* Se utiliza un switch para ejecutar diferentes acciones dependiendo de
            la opción seleccionada*/
            switch(opcionSucursal) {
                case 1:
                    /* Si se selecciona la Sucursal 1, se llama a la función 
                    mostrarNumerosSucursal() pasándole el diccionario correspondiente*/
                    mostrarNumerosSucursal(obtenerDiccionarioSucursal1(), scanner);
                    break;
                case 2:
                    /* Si se selecciona la Sucursal 2, se llama a la función 
                    mostrarNumerosSucursal() pasándole el diccionario correspondiente*/
                    mostrarNumerosSucursal(obtenerDiccionarioSucursal2(), scanner);
                    break;
                case 3:
                    /* Si se selecciona la Sucursal 3, se llama a la función 
                    mostrarNumerosSucursal() pasándole el diccionario correspondiente*/
                    mostrarNumerosSucursal(obtenerDiccionarioSucursal3(), scanner);
                    break;
                case 4:
                    /* Si se selecciona la opción de Salir, se muestra un mensaje 
                    y se sale del bucle do-while*/
                    System.out.println("Saliendo...");
                    break;
                default:
                    /*Si se selecciona una opción inválida, se muestra un mensaje 
                    al usuario y se le pide que seleccione de nuevo*/
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            
        } while(opcionSucursal != 4); /*El bucle do-while se repetirá mientras 
        no se seleccione la opción de Salir*/
    }
    
    public static void mostrarNumerosSucursal(Map<String, String> numerosSucursal, Scanner scanner) {
        // Se le pide al usuario que ingrese el nombre del número que desea consultar
        System.out.println("Ingrese el nombre del número que desea consultar:");
        String nombreNumero = scanner.next();
        
        if(numerosSucursal.containsKey(nombreNumero)) {
            /* Si el nombre ingresado se encuentra en el diccionario, se muestra 
            el número correspondiente*/
            System.out.println("El número de " + nombreNumero + " es: " 
                    + numerosSucursal.get(nombreNumero));
        } else {
            /*Si el nombre ingresado no se encuentra en el diccionario, 
            se muestra un mensaje al usuario*/
            System.out.println("El número de " + nombreNumero + " no se encontró.");
        }
    }
    
    public static Map<String, String> obtenerDiccionarioSucursal1() {
        /* Esta función devuelve un diccionario con los nombres y 
        números telefónicos correspondientes a la Sucursal 1*/
        Map<String, String> numerosSucursal1 = new HashMap<>();
        numerosSucursal1.put("Juan", "664 45618356");
        numerosSucursal1.put("Pedro", "664 56417351");
        numerosSucursal1.put("Maria", "664 31114367");
        return numerosSucursal1;
    }
    
    public static Map<String, String> obtenerDiccionarioSucursal2() {
         /*Esta función devuelve un diccionario con los nombres y 
        números telefónicos correspondientes a la Sucursal 2*/
        Map<String, String> numerosSucursal2 = new HashMap<>();
        numerosSucursal2.put("Carlos", "55 32907221");
        numerosSucursal2.put("Ana", "55 42653216");
        numerosSucursal2.put("Luis", "55 71347865");
        return numerosSucursal2;
    }
    
    public static Map<String, String> obtenerDiccionarioSucursal3() {
         /*Esta función devuelve un diccionario con los nombres y 
        números telefónicos correspondientes a la Sucursal 3*/
        Map<String, String> numerosSucursal3 = new HashMap<>();
        numerosSucursal3.put("Laura", "33 10931682");
        numerosSucursal3.put("Jorge", "33 11831622");
        numerosSucursal3.put("Fernando", "33 32937689");
        return numerosSucursal3;
    }

}