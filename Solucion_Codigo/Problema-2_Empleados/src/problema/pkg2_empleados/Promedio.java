package problema.pkg2_empleados;
public class Promedio {
    double promedio=0;
    
    public void acumularSueldos(double sueldo){
        this.promedio+=sueldo;
        
    }
    public double promedioSueldos(int nEmp){
        this.promedio=this.promedio/nEmp;
        return this.promedio;
    }
    public double getPromedioSueldos(){
        return this.promedio;
    }

}
