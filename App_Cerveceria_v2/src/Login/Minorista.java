
package login;

public class Minorista {
    private String seleccionarProducto;
    private String seleccionarSucursal;
    private int productoCantidad;

    public String getSeleccionarProducto() {
        return seleccionarProducto;
    }

    public void setSeleccionarProducto(String seleccionarProducto) {
        this.seleccionarProducto = seleccionarProducto;
    }

    public String getSeleccionarSucursal() {
        return seleccionarSucursal;
    }

    public void setSeleccionarSucursal(String seleccionarSucursal) {
        this.seleccionarSucursal = seleccionarSucursal;
    }

    public int getProductoCantidad() {
        return productoCantidad;
    }

     public void setProductoCantidad(int productoCantidad) {
        this.productoCantidad = productoCantidad;
    }

    public void setProductoCantidad(String productoCantidad) {
        int cantidadInt = Integer.parseInt(productoCantidad);
        this.productoCantidad = cantidadInt;
    }
}

