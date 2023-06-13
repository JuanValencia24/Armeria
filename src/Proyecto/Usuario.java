package Proyecto;

import java.io.Serializable;

public class Usuario implements Serializable{
    
    String nombre, dire, estado,ArmasC,tel;
    int cc,arma,total;
    byte edad;
    

    public Usuario(String nombre, String dire, int cc, String tel, byte edad, String estado, int arma, int total, String ArmasC) {
        this.nombre = nombre;
        this.dire = dire;
        this.cc = cc;
        this.tel = tel;
        this.edad = edad;
        this.estado= estado;
        this.arma=arma;
        this.total= total;
        this.ArmasC=ArmasC;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getArmasC() {
        return ArmasC;
    }

    public void setArmasC(String ArmasC) {
        this.ArmasC = ArmasC;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
}
