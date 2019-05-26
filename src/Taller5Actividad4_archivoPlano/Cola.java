/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller5Actividad4_archivoPlano;

/**
 *
 * @author stewa
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cola {
    private Nodo cabeza;
    public void agregar(Informacion info) {
        if (cabeza == null) {
            cabeza = new Nodo();
            cabeza.info = info;
        } else {
            Nodo rec = cabeza;
            while (rec.siguiente != null) {
                rec = rec.siguiente;
            }
            rec.siguiente = new Nodo();
            rec.siguiente.info = info;
        }
    }
    public Informacion atender() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            cabeza = cabeza.siguiente;
            temp.siguiente = null;
            return temp.info;
        }
        return new Informacion();
    }
    public void BajarArchivo() {
        PrintStream salida = null;
        try {
            salida = new PrintStream("d:/PruebaArchivo/gustavo.txt");
            Nodo rec = cabeza;
            while (rec != null) {
                salida.println("Nombre  " + rec.info.Nombre);
                salida.println("Direccion : " + rec.info.Direccion);
                salida.println("Empresa: " + rec.info.Empresa);
                rec = rec.siguiente;
            }
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cola.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.close();
        }
    }
}
