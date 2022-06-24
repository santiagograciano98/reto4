package co.edu.udea.reto4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Reto4 {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Venta> listaVentas = new ArrayList<>();
    public static Empresa empresa = new Empresa();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("1. Agregar venta");
            System.out.println("2. Agregar panel");
            System.out.println("3. Agregar seguro");
            System.out.println("4. Mostrar ventas");
            System.out.println("5. Mostrar paneles");
            System.out.println("6. Mostrar suguros");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(empresa.crearVenta());
                    break;
                case 2:
                    System.out.println(empresa.crearPanel());
                    break;
                case 3:
                    System.out.println(empresa.crearSeguro());
                    break;
                case 4:
                    empresa.listarVentas();
                    break;
                case 5:
                    empresa.listarPaneles();
                    break;
                case 6:
                    empresa.listarSeguros();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 0);

        //menuPrincipal();
        // System.out.print("ksfjaslkdfhsdlkfhlasdf \n dsfasdfsdfsd");
        //ArrayList<Panel> listaPaneles = new ArrayList<>();

        /*Seguro seguro = new Seguro();
        seguro.setFechaInicio(LocalDate.of(2021, Month.APRIL, 05));
        seguro.setFechaFin(LocalDate.of(2022,Month.APRIL, 05));
        
        System.out.println(seguro.calcularCobertura());
        
        Venta venta = new Venta();
        venta.setFechaVenta(LocalDateTime.of(2021, Month.JUNE, 24, 06,30));
        System.out.println(venta.calcularDias());*/
    }

    public static void menuPrincipal() {
        System.out.println("1. Agregar venta");
        System.out.println("2. Agregar panel");
        System.out.println("3. Agregar seguro");
        System.out.println("4. Mostrar ventas");
        System.out.println("5. Mostrar paneles");
        System.out.println("6. Mostrar suguros");
        System.out.println("0. Salir");
        int opcion;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    //System.out.println("1");
                    //agregarVenta();

                    System.out.println(empresa.crearVenta());
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    //listarVentas();
                    empresa.listarVentas();
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 0);
    }

    public static void agregarVenta() {
        Venta venta = new Venta();
        System.out.println("Ingrese id del panel");
        String id = scanner.next();
        venta.setIdPanel(id);
        venta.setFechaVenta(LocalDateTime.now());
        System.out.println("ingrese el tipo documento del comprador");
        venta.setTipoDocumentoComprador(scanner.next());
        System.out.println("Ingrese el id del comprador");
        venta.setIdComprador(scanner.next());
        System.out.println("Ingrese el nombre del comprador");
        venta.setNombreComprador(scanner.next());
        System.out.println("ingrese descripcion de la venta");
        venta.setDescripcionUso(scanner.next());

        listaVentas.add(venta);
        System.out.println("venta agregada correctamente");

    }

    public static void listarVentas() {
        for (int i = 0; i < listaVentas.size(); i++) {
            System.out.println(listaVentas.get(i).getIdComprador());
        }
    }
}
