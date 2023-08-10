
package login;

public class Surtidor extends Minorista {
    private int cantidadSurtidor;

    @Override
    public int getProductoCantidad() {
        return cantidadSurtidor;
    }

    @Override
     public void setProductoCantidad(int productoCantidad) {
        this.cantidadSurtidor = productoCantidad;
    }
    
    public void setProductoCantidad(String productoCantidad) {
        int cantidadInt = Integer.parseInt(productoCantidad);
        this.cantidadSurtidor = cantidadInt;
    }
}
    



