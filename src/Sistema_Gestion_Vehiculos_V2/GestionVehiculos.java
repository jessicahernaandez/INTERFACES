/*Clase Gestionvehiculos*/
package Sistema_Gestion_Vehiculos_V2;

import java.util.Arrays;
import java.util.Scanner;

public class GestionVehiculos {

    /*Creamos Arrays de Propietario, Concesionario y Vehiculo para poder guardarlos y gestionarlos.*/
    Propietario[] propietarios;
    Concesionario[] concesionarios;
    Vehiculo[] vehiculos;
    int contadorPropietario = 0;
    int contadorConcesionarios = 0;
    int contadorVehiculos = 0;
    Concesionario concesionario;

    /*Constructor de la clase que inicializa los Arrays*/
    public GestionVehiculos() {
        propietarios = new Propietario[25];
        concesionarios = new Concesionario[15];
        vehiculos = new Vehiculo[50];
    }

    /*Menú Principal, a raiz de esta llamada se inicializará las demas funciones de la clase.*/
    public void MenuPrincipal() {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("--Menú de Gestión de Vehiculos--");
            System.out.println("1.Agregar un Vehiculo.");
            System.out.println("2.Listar todos los Vehiculos");
            System.out.println("3.Agregar un propietario.");
            System.out.println("4.Crear un concesionario.");
            System.out.println("5.Listar los vehiculos de un concesionario.");
            System.out.println("6.Añadir un Vehiculo a un Concesionario");
            System.out.println("7.Salir del programa");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    agregarVehiculo();
                }

                case 2 -> {
                    listarVehiculos();
                }

                case 3 -> {
                    AgregarPropietario();
                }

                case 4 -> {
                    CrearConcesionado();
                }

                case 5 -> {
                    listarVehiculosConcesionario();
                }

                case 6 -> {
                    System.out.println("Saliendo del programa...");
                }

                case 7 -> {
                    System.out.println("Saliendo del programa...");
                }

                default -> {
                    System.out.println("Opcion no valida");
                }
            }

        }
    }

    public void agregarVehiculo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué vehiculo deseas agregar?");
        System.out.println("1.Auto");
        System.out.println("2.Camión");
        System.out.println("3.Motocicleta");
        int opcionVehi = sc.nextInt();

        if (contadorVehiculos < vehiculos.length) {
            switch (opcionVehi) {
                case 1 -> {
                    System.out.println("Marca: ");
                    String marcaAuto = sc.next();
                    System.out.println("Modelo:");
                    String modeloAuto = sc.next();
                    System.out.println("Anio: ");
                    int anioAuto = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Propietario: ");
                    String nombrePropi = sc.nextLine();
                    Propietario propi = PropietariosRegistrados(nombrePropi);

                    if (propi == null) {
                        System.out.println("El nombre del Propietario no ha sido registrado.");
                    }

                    System.out.println("Número de Puertas: ");
                    int numPuertas = sc.nextInt();
                    Vehiculo auto = new Auto(marcaAuto, modeloAuto, anioAuto, propi, numPuertas);
                    vehiculos[contadorVehiculos] = auto;
                    contadorVehiculos++;

                }

                case 2 -> {
                    System.out.println("Marca: ");
                    String marcaAuto = sc.next();
                    System.out.println("Modelo:");
                    String modeloAuto = sc.next();
                    System.out.println("Anio: ");
                    int anioAuto = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Propietario: ");
                    String nombrePropi = sc.nextLine();
                    Propietario propi = PropietariosRegistrados(nombrePropi);

                    if (propi == null) {
                        System.out.println("El nombre del Propietario no ha sido registrado.");
                    }

                    System.out.println("Capacidad de carga (en toneladas): ");
                    int capCargaCamion = sc.nextInt();
                    Vehiculo camion = new Camion(marcaAuto, modeloAuto, anioAuto, propi, capCargaCamion);
                    vehiculos[contadorVehiculos] = camion;
                    contadorVehiculos++;
                }

                case 3 -> {
                    System.out.println("Marca: ");
                    String marcaAuto = sc.next();
                    System.out.println("Modelo:");
                    String modeloAuto = sc.next();
                    System.out.println("Anio: ");
                    int anioAuto = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Propietario: ");
                    String nombrePropi = sc.nextLine();
                    Propietario propi = PropietariosRegistrados(nombrePropi);

                    if (propi == null) {
                        System.out.println("El nombre del Propietario no ha sido registrado.");
                    }

                    System.out.println("Cilindrada (centimetros): ");
                    int cilindradaMoto = sc.nextInt();
                    Vehiculo Moto = new Motocicleta(marcaAuto, modeloAuto, anioAuto, propi, cilindradaMoto);
                    vehiculos[contadorVehiculos] = Moto;
                    contadorVehiculos++;
                }

                default -> {
                    System.out.println("Opcion no valida.");
                }
            }
        } else {
            System.out.println("Almacenamiento Ocupado. No es posible ingresar mas vehiculos.");
        }
    }

    /*Método que permite comprobar si el propietario que ha ingresado el usuario existe.*/
    public Propietario PropietariosRegistrados(String nombreUsu) {
        for (int i = 0; i < contadorPropietario; i++) {
            if (propietarios[i].nombre.equals(nombreUsu)) {
                return propietarios[i];
            }
        }

        return null;
    }

    /*Método que permite listar todos los vehiculos agregados*/
    public void listarVehiculos() {

        System.out.println("Vehiculos Ingresados: ");
        for (int i = 0; i < contadorVehiculos; i++) {
            System.out.println(vehiculos[i]);
        }
    }

    /*Agregar propietario -> Menú*/
    public void AgregarPropietario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombrePropi = sc.next();
        System.out.println("Apellido: ");
        String apellidoPropi = sc.next();
        System.out.println("DNI: ");
        String DNIpropi = sc.next();
        System.out.println("Direccion: ");
        String direPropi = sc.next();
        Propietario propi = new Propietario(nombrePropi, apellidoPropi, DNIpropi, direPropi);
        if (contadorPropietario < propietarios.length) {
            propietarios[contadorPropietario] = propi;
            contadorPropietario++;
        } else {
            System.out.println("Espacio Ocupado. No se pueden introducir mas propietarios.");
        }
    }

    /*Crear un Concesionado*/
    public void CrearConcesionado() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombreCon = sc.nextLine();
        System.out.println("Direccion: ");
        String direCon = sc.nextLine();

        concesionario = new Concesionario(nombreCon, direCon);

        if (contadorConcesionarios < concesionarios.length) {
            concesionarios[contadorConcesionarios] = concesionario;
            contadorConcesionarios++;
            System.out.println("Concesionario agregado correctamente");
        } else {
            System.out.println("Espacio no disponible.");
        }
    }

    /*Listar los vehiculos de un concesionario*/
    public void listarVehiculosConcesionario() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione un concesionario: ");
        if (concesionarios[0] == null) {
            System.out.println("No hay ningun concesario. Se recomienda agrgar uno");
        } else {
            for (int i = 0; i < concesionarios.length; i++) {
                concesionarios[i].toString();
            }

            int busCon = sc.nextInt();
            if (busCon < concesionarios.length && busCon >= 0) {
            for (int i = 0; i < contadorConcesionarios; i++) {
                    concesionarios[busCon].listarVehculos();
                }
            }

        }
    }
}
