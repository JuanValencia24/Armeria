package Proyecto;

import java.io.Serializable;

public class Usuario implements Serializable{
    
    String nombre, dire, estado,ArmasC;
    int cc, tel,arma,total;
    byte edad;
    

    public Usuario(String nombre, String dire, int cc, int tel, byte edad, String estado, int arma, int total, String ArmasC) {
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
    
}
