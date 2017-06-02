
package lab6_delmerizaguirre;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class AdministrarProducto {
    private ArrayList<Producto> listaproductos = new ArrayList<>();

    private File archivo = null;

    public AdministrarProducto(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Producto> getlistaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listapersonas=" + listaproductos;
    }

    //Mutador
    public void addProducto(Producto p) {
        this.listaproductos.add(p);
    }

    //Administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);

            for (Producto t : listaproductos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getCategoria() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getDescuento() + ";");

            }
            bw.flush();

        } catch (IOException e) {
        }
        bw.close();
        fw.close();

    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaproductos = new ArrayList();

        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                
                double p, d;
                String n, c;
                n = sc.next();
                c = sc.next();
                p = sc.nextDouble();
                d = sc.nextDouble();
                listaproductos.add(new Producto(
                        n, c, p, d
                ));
            }//fin while 1
        } catch (IOException ex) {
        } finally {
            sc.close();
        }

    }
    
    
}
