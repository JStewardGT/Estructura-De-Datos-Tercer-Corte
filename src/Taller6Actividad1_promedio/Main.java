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
            System.out.println("2. listar");
            System.out.println("3. Terminar e imprimir");
            opcion = Leer.datoInt();
            switch (opcion) {
                case 1: {
                    Informacion info = new Informacion();
                    System.out.println("digite el nombre:");
                    info.nombre = Leer.dato();
                    System.out.println("digite el nota 1:");
                    info.nota1 = Leer.datoDouble();
                    System.out.println("digite el nota 2:");
                    info.nota2 = Leer.datoDouble();
                    System.out.println("digite el nota 3:");
                    info.nota3 = Leer.datoDouble();
                    info.promedio = (info.nota1 + info.nota2 + info.nota3) / 3;
                    pila.agregar(info);
                    
                    break;
                }
                case 2:
                    pila.listar(1);
                    break;
                default:
                    for (int j = 0; j < 1; j++) {
                        Informacion info = pila.atender();
                        System.out.println("dato atendido : " + info.nombre);
                        if (info == null) {
                            break;
                        }
                    }
                    pila.listar(2);
                    break;
            }
        }
        System.out.println("terminado");

    }

}
