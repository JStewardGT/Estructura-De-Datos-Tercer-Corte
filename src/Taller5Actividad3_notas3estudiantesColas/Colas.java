/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller5Actividad3_notas3estudiantesColas;

public class Colas {

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

    public void listar() {
        Nodo rec = cabeza;
        while (rec != null) {
            System.out.println("Nombre: " + rec.info.Nombre);
            System.out.println("cedula: " + rec.info.cc);
            System.out.println("nota 1: " + rec.info.nota1);
            System.out.println("nota 2: " + rec.info.nota2);
            System.out.println("nota 3: " + rec.info.nota3);
            System.out.println("promedio: " + rec.info.promedio);
            rec = rec.siguiente;
        }
    }
}
