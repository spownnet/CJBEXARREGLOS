
import java.util.Scanner;

public class EjemploArregloBuscarString {
        public static void main(String[] args) {
                String[] a = new String[4];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < a.length; i++) {
                        System.out.println("Ingrese un Nombre: ");
                        a[i] = sc.next();
                }

                System.out.println("\r\n Ingrese un Nombre a Buscar:");
                String num = sc.next();

                int i;

                //Buqueda con for
                for (i = 0; i < a.length &&  !a[i].equalsIgnoreCase(num); i++) {}

                //busqueda con while
//                while (i < a.length &&  a[i] != num){
//                        i++;
//                }

                if (i == a.length){
                        System.out.println("No se reconoce el nombre a buscar");
                } else if(a[i].equalsIgnoreCase(num)){
                        System.out.println("Encontrado en la posicion: " + i);
                }

        }
}
