package problema.pkg1_ventas;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        boolean sigue = true;
        String sigueResp;
        int numProductos;
        double precioUnidad;
        while (sigue) {
            System.out.println("Ingrese la cantidad de productos que desea");
            numProductos = put.nextInt();
            System.out.println("Ingrese el precio por unidad");
            precioUnidad = put.nextDouble();
            Ventas ventas = new Ventas(numProductos, precioUnidad);
            ventas.calcularPrecioFinal();
            ventas.calcularDescuento();
            System.out.println(ventas.toString());
            System.out.println("Quiere seguir? SI / NO");
            sigueResp = put.next();
            sigue = sigueResp.equals("NO") ? false : sigue;
        }
    }

}
