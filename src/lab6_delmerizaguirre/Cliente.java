
package lab6_delmerizaguirre;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Cliente {
    
    private String nombre;
    private int edad;
    ArrayList<Producto> listaproductos;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }
    
    public void addProducto(Producto p){
        this.listaproductos.add(p);
    }
    
    public void removeProducto(Producto p){
        this.listaproductos.remove(p);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
