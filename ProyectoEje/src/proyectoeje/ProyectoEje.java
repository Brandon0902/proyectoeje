import java.util.Scanner;

public class ProyectoEje {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);   
         //variables para el menu
        int menpricipal=0, menclientes=0, menservicios=0, menhorarios=0;
        //variable cliente 1
        String nombreCliente1 = null, nombreMascota1 = null, especie1 = null, estatusCL1="";
        int cantidadMascotas1 = 0, opcionServicio1, descuento1, pension1 = 0;
        double costoServicio1 = 0, costoTotal1 = 0,numtelefonico1=0, costoCon=120, costoVac=350, costoDes=400, costoCir=1500, costoEst=500, costoPen=800, CostPenTotal = 0;
        
        //variable cliente 2
        String nombreCliente2 = null, nombreMascota2 = null, especie2 = null, estatusCL2="", nomEliminado="";
        int cantidadMascotas2 = 0, opcionServicio2, descuento2, pension2;
        double costoServicio2 = 0, costoTotal2 = 0, numtelefonico2 = 0,  costoCon2=120, costoVac2=350, costoDes2=400, costoCir2=1500, costoEst2=500, costoPen2=800, CostPenTota2=0;
        
        //variables para los precios
        int precioCon=300,  precioVac1=200,  precioVac2=350,  precioVac3=500, precioDes=300,precioCir1=2000, precioCir2=1500, preccioCir3=1000, precioEste1=200, precioEste2=300, precioPen=400;
                
        
        
        
        //Variables para buscar cliente
        String nomBuscado="";
        
        //Variables para modificar Datos del cliente
        int opcModCL=0;
        
        do{
          System.out.println("-----------------------------");    
         System.out.println("VETERINARIA HAPPY DOG");
         System.out.println("1. REGISTRO CLIENTES");
         System.out.println("2. BUSCAR CLIENTE");
         System.out.println("3. MODIFICAR DATOS DEL CLIENTE");
         System.out.println("4. DAR DE BAJA A UN CLIENTE");
         System.out.println("5. COTIZACION");
         System.out.println("6. HORARIOS");
         System.out.println("7. SALIR DEL SISTEMA");
         System.out.println("-----------------------------");
         menpricipal=entrada.nextInt();
         switch(menpricipal){
             
             //Registro del cliente
             case 1:
                  entrada.nextLine();
                 if( !estatusCL1.equals("Activo")){
                      System.out.println("\n");
                     
         System.out.println("---CLIENTES---");
        // Registro del cliente
        System.out.println("Ingrese el nombre del cliente1: ");
        nombreCliente1 = input.nextLine();
        System.out.println("Ingrese el numero telefonico del cliente1: ");
        numtelefonico1=input.nextDouble();
        System.out.println("Ingrese la cantidad de mascotas que tiene el cliente: ");
        cantidadMascotas1 = input.nextInt();
        // Limpiar buffer de entrada
         input.nextLine();    
    
            //Registrar cantidad y nombre de mascotas
           for (int i = 1; i <= cantidadMascotas1; i++){
            System.out.println("Ingrese el nombre de la mascota " + i + ": ");
            nombreMascota1 = input.nextLine();
            System.out.println("Ingrese la especie de la mascota " + i + ": ");
            especie1 = input.nextLine();          
            estatusCL1 = "Activo";    
           }
           
           
           
          //seleccionar el servicio
        System.out.println("\nSeleccione el servicio que desea contratar:");
        System.out.println("1. Consultas (300$)");
        System.out.println("2. Vacunas");
        System.out.println("3. Desparasitaciones (300$)");
        System.out.println("4. Cirugías");
        System.out.println("5. Estética");
        System.out.println("6. Pensión (300$ por noche)");
        menservicios = input.nextInt();
         switch(menservicios){
             
             case 1:
             System.out.println("seran 120$ por la consulta");
                break;
                
            case 2:
                System.out.println("\nseran 350$ por la vacuna");
             break;
             
              case 3:
                System.out.println("\nseran 400 por la desparasitacion");
                break;
                
            case 4:
                System.out.println("\nseran 1500 por la cirugia");
                 break;
                 
            case 5:
               System.out.println("\nseran 500 por la estetica");
             break;
             
            case 6:
              System.out.println("noches que se quedara la(s) mascota(s)");
                pension1 = input.nextInt();   
              System.out.println("Cada noche cuesta 800");
                           
                CostPenTotal = costoPen * pension1;
                System.out.println("Su total sera: " + CostPenTotal );
                
                break;
             
         }
          System.out.println("¡¡cliente registrado con exito!!");
           
           }else if (!estatusCL2.equals("Activo")){
         // Registro del cliente
        System.out.println("Ingrese el nombre del cliente2: ");
        nombreCliente2 = entrada.nextLine();
        System.out.println("Ingrese el numero telefonico del cliente2: ");
        numtelefonico2=input.nextDouble();
        System.out.println("Ingrese la cantidad de mascotas que tiene el cliente: ");
        cantidadMascotas2 = input.nextInt();
        // Limpiar buffer de entrada
         input.nextLine();           
          //Registrar cantidad y nombre de mascotas
           for (int i = 1; i <= cantidadMascotas2; i++){
             System.out.println("Ingrese el nombre de la mascota " + i + ": ");
            nombreMascota2 = input.nextLine();
            System.out.println("Ingrese la especie de la mascota " + i + ": ");
            especie2 = input.nextLine(); 
             estatusCL2 = "Activo";
               }  
               //seleccionar el servicio
        System.out.println("\nSeleccione el servicio que desea contratar:");
        System.out.println("1. Consultas (300$)");
        System.out.println("2. Vacunas");
        System.out.println("3. Desparasitaciones (300$)");
        System.out.println("4. Cirugías");
        System.out.println("5. Estética");
        System.out.println("6. Pensión (300$ por noche)");
        menservicios = input.nextInt();
         switch(menservicios){
             case 1:
             System.out.println("seran 300 por la consulta");
                costoCon2 = 120;
                break;
            case 2:
                System.out.println("\nSeran 350 por la vacuna:");
             costoVac2=350;
                 
             break;
              case 3:
                  System.out.println("Seran 400 por la desparacitacion");
                costoDes2 = 400;
                break;
                
            case 4:
                System.out.println("\nSeran 1500 por la cirugia :");
               costoCir2=1500;
                 
                 break;
            case 5:
                System.out.println("\nSeran 500 por la estetica:");
                costoEst2=500;
             break;
             
            case 6:
                    System.out.println("noches que se quedara la(s) mascota(s)");
                       pension2 = input.nextInt();   
                        System.out.println("Cada noche cuesta 800");
                     
                        
                CostPenTota2 = costoPen2 * pension2;
                System.out.println("Su total sera: " + CostPenTota2 );
                
                break;
             
         }
           
           
           
           System.out.println("¡¡cliente registrado con exito!!");

                 }else{
                 System.out.println("Base de Datos Sin espacio");    
  
                 }
                 break;
             
                 //Buscar un cliente
             case 2:  
             entrada.nextLine();
                                
                System.out.println("-----Buscar un cliente-----");
                System.out.println("Ingresa el nombre a buscar");
                nomBuscado = entrada.next();
                if(nomBuscado.equals(nombreCliente1)){
                    System.out.println("Nombre :" + nombreCliente1);
                    System.out.println("numero telefonico :" + numtelefonico1);
                    System.out.println("mascota(s) :" + cantidadMascotas1);
                    System.out.println("nombre de la(s) mascota(s) :" + nombreMascota1);
                    System.out.println("especie de las mascota(s) :" + especie1);
                    System.out.println("Estatus :" + estatusCL1);
                    
                     }else if(nomBuscado.equals(nombreCliente2)){
                    System.out.println("Nombre :" + nombreCliente2);
                    System.out.println("numero telefonico :" + numtelefonico2);
                    System.out.println("mascota(s) :" + cantidadMascotas2);
                    System.out.println("nombre de la(s) mascota(s) :" + nombreMascota2);
                    System.out.println("especie de las mascota(s) :" + especie2);
                    System.out.println("Estatus :" + estatusCL2); 
              
                     }else{
                         System.out.println("El cliente no existe en la Base de Datos");
                     }
                
             break;
                 
             //modificar la informacion de un cliente
             case 3:
               entrada.nextLine();
          System.out.println("-----Modificar un cliente-----");
          System.out.println("Ingresa el nombre a buscar");
          nomBuscado = entrada.next();
          if(nomBuscado.equals(nombreCliente1)){
               System.out.println("Elige el dato a modificar");
                 System.out.println("1. Nombre del cliente");
                   System.out.println("2. Numero telefonico del cliente");
                     System.out.println("3. cantidad de mascotas :  ");
                      System.out.println("4. nombre de la(s) mascota(s) :");
                       System.out.println("5. especie de las mascota(s) : ");
                        System.out.println("6. Estatus : ");
                         opcModCL = entrada.nextInt();
                         
              switch(opcModCL){
                  
          case 1: 
                 entrada.nextLine();
                 System.out.println("Ingresa el nuevo nombre");
                 nombreCliente1 = entrada.nextLine();
                  break;
          case 2: 
                 entrada.nextLine();
                 System.out.println("Ingresa el nuevo Numero telefonico del cliente");
                 numtelefonico1 = entrada.nextDouble();
                  break;
           case 3: 
                 System.out.println("Ingresa la cantidad de mascotas");
                 cantidadMascotas1 = entrada.nextInt();
                  break;  
                  
           case 4: 
                 entrada.nextLine();
                 System.out.println("Ingresa nombre de la(s) mascota(s)");
                 nombreMascota1 = entrada.nextLine();
                  break;
           case 5: 
                 entrada.nextLine();
                 System.out.println("Ingresa la especie de las mascota(s)");
                 especie1 = entrada.nextLine();
                  break;
           case 6: 
                 System.out.println("Ingresa el estatus");
                 estatusCL1 = entrada.nextLine();
                  break;
                   default: 
                        System.out.println("Opción No válida");
                  
                  
              }
              
              
          }else if(nomBuscado.equals(nombreCliente2)){
             System.out.println("Elige el dato a modificar");
                 System.out.println("1. Nombre del cliente");
                   System.out.println("2. Numero telefonico del cliente");
                     System.out.println("3. cantidad de mascotas :  ");
                      System.out.println("4. nombre de la(s) mascota(s) :");
                       System.out.println("5. especie de las mascota(s) : ");
                        System.out.println("6. Estatus : ");
                         opcModCL = entrada.nextInt();  
              
               switch(opcModCL){
                   
          case 1: 
                 entrada.nextLine();
                 System.out.println("Ingresa el nuevo nombre");
                 nombreCliente2 = entrada.nextLine();
                  break;
          case 2: 
                 entrada.nextLine();
                 System.out.println("Ingresa el nuevo Numero telefonico del cliente");
                 numtelefonico2 = entrada.nextDouble();
                  break;
           case 3: 
                 System.out.println("Ingresa la cantidad de mascotas");
                 cantidadMascotas2 = entrada.nextInt();
                  break;  
                  
           case 4: 
                 entrada.nextLine();
                 System.out.println("Ingresa nombre de la(s) mascota(s)");
                 nombreMascota2 = entrada.nextLine();
                  break;
           case 5: 
                 entrada.nextLine();
                 System.out.println("Ingresa la especie de las mascota(s)");
                 especie2 = entrada.nextLine();
                  break;
           case 6: 
                 System.out.println("Ingresa el estatus");
                 estatusCL2 = entrada.nextLine();
                  break;
                  
                   default: 
                        System.out.println("Opción No válida");
      
               }
                  
          }else{
              System.out.println("El Cliente no existe en la Base de Datos");
          }
              
             case 4:
       entrada.nextLine();
    System.out.println("-----Eliminar un cliente-----");
    System.out.println("Ingresa el nombre del cliente a dar de baja:");
    String nombreBaja = entrada.nextLine();
    if(nombreBaja.equals(nombreCliente1)){
        estatusCL1 = "Inactivo";
        // Reiniciar variables del cliente 1
        nombreCliente1 = null;
        nombreMascota1 = null;
        especie1 = null;
        cantidadMascotas1 = 0;
        costoServicio1 = 0;
        costoTotal1 = 0;
        numtelefonico1 = 0;
        System.out.println("El cliente " + nombreBaja + " ha sido eliminado.");
    }else if(nombreBaja.equals(nombreCliente2)){
        estatusCL2 = "Inactivo";
        // Reiniciar variables del cliente 2
        nombreCliente2 = null;
        nombreMascota2 = null;
        especie2 = null;
        cantidadMascotas2 = 0;
        costoServicio2 = 0;
        costoTotal2 = 0;
        numtelefonico2 = 0;
        System.out.println("El cliente " + nombreBaja + " ha sido eliminado.");
    }else{
        System.out.println("El cliente no existe.");
    }
    break;
   
                 
             case 5:
                 System.out.println("----Cotizacion----");
                 
                 
                 
                 break;
                 
             case 6:
                  System.out.println("----Horarios----");
                 System.out.println("Lunes a viernes de 8:00am a 4:00pm y de 5:00pm a 10:00pm ");
                 System.out.println("Sabados de 9:00am a 5:00pm");
                 System.out.println("los domingos descansamos");
                 break;
                 
                 
             case 7:
                 
                 break;
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
         }   
            
            
            
            
            
        }while(menpricipal!= 7);
        
        
        
        
    }
    
}
