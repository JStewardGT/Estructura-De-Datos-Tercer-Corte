/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller6Actividad1_promedio;

/**
 *
 * @author stewa
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pila {

    private Nodo cabeza;

    public void agregar(Informacion info) {
        if (cabeza == null) {
            cabeza = new Nodo();
            cabeza.info = info;
        } else {
            Nodo nuevo = new Nodo();
            nuevo.info = info;
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
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

    public void listar() {
        Nodo rec = cabeza;
        System.out.println("La pila esta conformada por ");
        while (rec != null) {
            System.out.print(rec.info.dato + "  ");
            rec = rec.siguiente;
        }
    }
    
    public void BajarArchivo(int e) {
        PrintStream salida = null;
        try {
            salida = new PrintStream("C:\\Users\\stewa\\Downloads\\Empresas"+ e + ".txt");
            Nodo rec = cabeza;
            while (rec != null) {
                salida.println("Nombre  " + rec.info.Nombre);
                salida.println("Direccion : " + rec.info.Documento);
                salida.println("Empresa: " + rec.info.Correo);
                rec = rec.siguiente;
            }
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cola.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.close();
        }

}
