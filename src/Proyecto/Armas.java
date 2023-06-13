package Proyecto;

public class Armas {
    
    String Tipo, Arma;
    short cant;
    int precio;

    public Armas(String Tipo, String Arma, short cant, int precio) {
        this.Tipo = Tipo;
        this.Arma = Arma;
        this.cant = cant;
        this.precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    public short getCant() {
        return cant;
    }

    public void setCant(short cant) {
        this.cant = cant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
   
}
