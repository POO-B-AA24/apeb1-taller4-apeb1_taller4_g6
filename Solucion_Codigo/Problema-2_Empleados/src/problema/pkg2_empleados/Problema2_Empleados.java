package problema.pkg2_empleados;

import java.util.Scanner;

public class Problema2_Empleados {

    public static void main(String[] args) {
        
        //////INICIALIZA LOS ARREGLOS////////////////////////////////////////////////
        Scanner tcl = new Scanner(System.in);
        System.out.println("INGRESE CUANTOS EMPLEADOS DESEA INGRESAR");
        int nEmp = tcl.nextInt();
        Empleados[] emp = new Empleados[nEmp];
        Promedio promedio = new Promedio();
        
        //////LLENO LOS ARREGLOS Y PROMEDIO LOS SUELDOS/////////////////////////////
        for (int i = 0; i < emp.length; i++) {
            System.out.println("INGRESE EL NOMBRE/SALARIO/EDAD DEL EMPLEADO");
            String nombre = tcl.next();
            double sueldo = tcl.nextDouble();
            int edad = tcl.nextInt();
            emp[i]= new Empleados(nombre, sueldo ,  edad , nEmp);
            promedio.acumularSueldos(sueldo);
            
        }
        promedio.promedioSueldos(nEmp);
        
        //////PRESENTO LOS DATOS SIN MODIFICAR/////////////////////////////////////
        System.out.println("===============================================================");
        for(Empleados empleados:emp){
            System.out.println(empleados.mostrarInformacion());
        }
        System.out.println("Promedio sueldos: "+promedio.getPromedioSueldos());
        System.out.println("===============================================================");
        System.out.println("Que porcentaje desea sumar a los sueldos menores al promedio?");
        double porcentaje=tcl.nextDouble();
        //////MODIFICO LOS DATOS Y LOS PRESENTO/////////////////////////////////////
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].mostrarNuevosSalarios(emp, promedio, i,porcentaje));
        }

        System.out.println("===============================================================");
        for(Empleados empleados:emp){
            System.out.println(empleados.mostrarInformacion());
        }
        System.out.println("===============================================================");
        

    }

}
