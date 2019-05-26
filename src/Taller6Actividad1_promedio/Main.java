/*
 * Realice un programa utilizando pilas, donde permita ingresar los datos de los
 * alumnos: nombre y tres notas, saque el promedio de las notas de cada alumno y
 * el promedio total del grupo en un archivo plano inicial. Posteriormente atienda
 * 3 alumnos y muestren los que quedan en la pila en otro archivo plano diferente al inicial
 */
package Taller6Actividad1_promedio;

/**
 *
 * @author stewa
 */
public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();
        
        
        
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. agregar");
            System.out.println("2. atender");
            System.out.println("3. listar");
            System.out.println("4. salir");
            opcion = Leer.datoInt();
            if (opcion == 1) {
                Informacion info = new Informacion();
                System.out.println("digite el dato:");
                info.dato = Leer.dato();
                pila.agregar(info);
            } else if (opcion == 2) {
                Informacion info = pila.atender();
                System.out.println("dato atendido : " + info.dato);
            } else if (opcion == 3) {
                pila.listar();
            }
        }
        System.out.println("terminado");

    }

}
