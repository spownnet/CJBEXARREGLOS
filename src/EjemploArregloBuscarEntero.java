
import java.util.Scanner;

public class EjemploArregloBuscarEntero {
        public static void main(String[] args) {
                int[] a = new int[10];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < a.length; i++) {
                        System.out.println("Ingrese un numero: ");
                        a[i] = sc.nextInt();
                }

                System.out.println("\r\n Ingrese un numero a Buscar:");
                int num = sc.nextInt();

                int i;

                //Buqueda con for
                for (i = 0; i < a.length &&  a[i] != num; i++) {}

                //busqueda con while
//                while (i < a.length &&  a[i] != num){
//                        i++;
//                }

                if (i == a.length){
                        System.out.println("No se encuentra el valor que se buca");
                } else if(a[i] == num){
                        System.out.println("Encontrado en la posicion: " + i);
                }

        }
}
