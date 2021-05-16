import java.util.Scanner;

public class EjemploArregloNumeroMayor {
        public static void main(String[] args) {
                int[] a = new int[5];
                Scanner sc = new Scanner(System.in);

                System.out.println("Ingrese 5 Enteros");
                for (int i = 0; i < a.length; i++) {
                        a[i] = sc.nextInt();
                }

                int max = 0;

                //Busqueda del mayor basado en el indice
                for (int i = 1; i < a.length; i++) {

                        //uso del operador ternario
                        max = (a[max]> a[i])? max: i;
                }

                System.out.println("a[max] = " + a[max]);
        }
}
