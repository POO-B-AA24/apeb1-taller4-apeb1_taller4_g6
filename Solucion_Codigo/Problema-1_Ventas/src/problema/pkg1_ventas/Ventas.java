package problema.pkg1_ventas;
public class Ventas {

    public int numProductos;
    public double precioUnidad;
    public double precioFinal;
    public double descuento;
    public double precioTotal;

    public Ventas(int numProductos, double precioUnidad) {
        this.numProductos = numProductos;
        this.precioUnidad = precioUnidad;
    }

    public void calcularPrecioFinal() {
        this.precioFinal = this.numProductos * this.precioUnidad;
        this.precioTotal = this.numProductos * this.precioUnidad;

    }

    public void calcularDescuento() {
        this.descuento = this.precioFinal >= 1000 && this.numProductos >= 10 ?(this.precioFinal * 0.1) : (this.descuento = this.precioFinal < 1000 ? (this.precioFinal * 0.05) : 0);
        
        
        this.precioFinal -= this.descuento;

    }

    @Override
    public String toString() {
        return "Ventas{" + "numProductos=" + numProductos + ", precioUnidad=" + precioUnidad + ", precioTotal=" + precioTotal +
                ", descuento=" + descuento + ", precioFinal=" + precioFinal + '}';
    }

}
