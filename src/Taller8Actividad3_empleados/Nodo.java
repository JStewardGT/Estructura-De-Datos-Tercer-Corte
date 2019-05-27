/*
 * (código, curso, carrera)
 */
package Taller8Actividad3_empleados;

/**
 *
 * @author stewa
 */
public class Nodo {

    public int cedula;
    public String nombre;
    public Nodo izq;
    public Nodo der;

    public Nodo(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Nodo() {
    }
}
