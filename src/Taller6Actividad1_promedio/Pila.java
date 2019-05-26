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

//    public void listar(double promedio) {
//        Nodo rec = cabeza;
//        System.out.println("La pila esta conformada por ");
//        while (rec != null) {
//            System.out.print(rec.info.nombre + "  ");
//            System.out.print(rec.info.promedio + "  ");
//            rec = rec.siguiente;
//        }
//        System.out.println("");
//        System.out.println("el promedio del grupo es " + promedio);
//    }
    public void listar(int dato) {
        Nodo rec = cabeza;
        System.out.println("La pila esta conformada por ");
        PrintStream salida = null;

        double promedioGeneral = 0;
        int i = 0;

        try {
            salida = new PrintStream("C:\\Users\\stewa\\Downloads\\pilas" + dato + ".txt");

            while (rec != null) {
                System.out.print(rec.info.nombre + "  ");
                System.out.print(rec.info.nota1 + "  ");
                System.out.print(rec.info.nota2 + "  ");
                System.out.print(rec.info.nota3 + "  ");
                System.out.print("promedio " + rec.info.promedio + "  ");
                System.out.println("");
                salida.print(rec.info.nombre + " ");
                salida.print(rec.info.nota1 + "  ");
                salida.print(rec.info.nota2 + "  ");
                salida.print(rec.info.nota3 + "  ");
                salida.print("promedio " + rec.info.promedio + "  ");
                salida.println("");
                
                promedioGeneral += rec.info.promedio;
                i++;
                
                rec = rec.siguiente;
            }
            promedioGeneral /= i;
            
            System.out.println("El promedio del grupo es " + promedioGeneral);
            salida.print("El promedio del grupo es " + promedioGeneral);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.close();
        }

    }

}
