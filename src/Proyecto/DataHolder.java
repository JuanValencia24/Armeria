
package Proyecto;

import java.util.ArrayList;

public class DataHolder {
    
    public static ArrayList<Armas> guns = new ArrayList<>();
     public static ArrayList<Usuario> user = new ArrayList<>();

    public static ArrayList<Usuario> getUser() {
        return user;
    }

    public static void setUser(ArrayList<Usuario> user) {
        DataHolder.user = user;
    }
     

    public static ArrayList<Armas> getGuns() {
        return guns;
    }

    public static void setGuns(ArrayList<Armas> guns) {
        DataHolder.guns = guns;
    }

   
    
    
}
