/*
 * (código, curso, carrera)
 */
package Taller8Actividad2_datosEstudiantes;

/**
 *
 * @author stewa
 */
public class Nodo {

    public int codigo;
    public String curso;
    public String carrera;
    public Nodo izq;
    public Nodo der;

    public Nodo(int codigo, String curso, String carrera) {
        this.codigo = codigo;
        this.curso = curso;
        this.carrera = carrera;
    }

    public Nodo() {
    }
}
