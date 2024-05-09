package problema.pkg2_empleados;
public class Empleados {
    public String nombre;
    public double sueldo;
    public int edad;
    public double sueldoPromedio=0;
    public double sueldoTotal;
    public int nEmpleados;

    public Empleados(String nombre, double sueldo, int edad, int nEmpleados) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
        this.nEmpleados = nEmpleados;
    }
    public double getSueldo(){ 
        return this.sueldo;
    }
    public void setNuevoSueldo(double sueldo){ //SE USA PARA SUMAR EL PORCENTAJE DESEADO A LOS SUELDOS
        this.sueldo=sueldo;
    }

    public String mostrarInformacion() { 
        return "Nombre: " + this.nombre + " EDAD: " + this.edad + " SUELDO: " + this.sueldo;
    }
    public String mostrarNuevosSalarios(Empleados[] emp , Promedio promedio, int i,double porcentaje){ //SE USA PARA MOSTRAR LOS CAMBIOS REALIZADOS EN LOS SALARIOS
        String nuevoSalarioString="";
            if(emp[i].getSueldo()<promedio.getPromedioSueldos()){
                nuevoSalarioString +="Sueldo del empleado "+(i+1)+":  "+emp[i].getSueldo();
                emp[i].setNuevoSueldo(emp[i].getSueldo()+(emp[i].getSueldo()*(porcentaje/100)));
                nuevoSalarioString +="\nNuevo sueldo: "+emp[i].getSueldo()+"\n";
            }
        return nuevoSalarioString;
    }
    
}
