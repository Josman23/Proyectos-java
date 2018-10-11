package ejemplostatic;

public class Galleta {

    private String sabor;
    private String forma;
    private String color;
    private String relleno;
    private static int cantidad=0;

    public Galleta(){
    }

    public Galleta(String sabor, String forma, String color, String relleno) {
        this.sabor = sabor;
        this.forma = forma;
        this.color = color;
        this.relleno = relleno;
        this.cantidad ++;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Galleta.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return this.sabor+" -- "+this.color+" -- "+this.forma+" -- "+this.relleno;
    }
}
