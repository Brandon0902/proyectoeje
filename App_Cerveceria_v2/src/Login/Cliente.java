
package login;


public class Cliente extends Surtidor {
    private int cantidadCliente;
    private String seleccionarEstablecimiento;

    
    public int getProductoCantidad() {
        return cantidadCliente;
    }

    
    public void setProductoCantidad(int productoCantidad) {
        this.cantidadCliente = productoCantidad;
    }

    public void setProductoCantidad(String productoCantidad) {
        int cantidadInt = Integer.parseInt(productoCantidad);
        this.cantidadCliente = cantidadInt;
    }
    
    public String getEstablecimiento() {
        return seleccionarEstablecimiento;
    }

    
    public void setEstablecimiento(String seleccionarEstablecimiento) {
        this.seleccionarEstablecimiento = seleccionarEstablecimiento;
    }
   
    
}


