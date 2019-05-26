
package Taller5Actividad4_CapturarDatos5Estdiantes;
public class Principal {

    public static void main(String[] args) {
        Cola cola = new Cola();
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. agregar");
            System.out.println("2. atender");
            System.out.println("3. guardar ");
            System.out.println("4. salir");
            opcion = Leer.datoInt();
            if (opcion == 1) {
                Informacion info = new Informacion();
                System.out.println("digite el Nombre:");
                info.Nombre = Leer.dato();
                System.out.println("digite la direccion:");
                info.Direccion = Leer.dato();
                System.out.println("digite la empresa:");
                info.Empresa = Leer.dato();
                cola.agregar(info);
            } else if (opcion == 2) {
                Informacion info = cola.atender();
                System.out.println("Nombre: "+info.Nombre);
                System.out.println("Direccion: "+info.Empresa);
                System.out.println("Empresa: "+info.Empresa);
            }else if (opcion == 3) {
                cola.BajarArchivo();
                System.out.println("La informacion fue guardada en el archivo");
            }
        }
        System.out.println("terminado");
    }
}
