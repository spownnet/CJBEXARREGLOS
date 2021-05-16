import java.util.Scanner;

public class EjemploArregloEliminarElemento {
        public static void main(String[] args) {
                int[] n = new int[10];
                Scanner sc = new Scanner(System.in);
                int posicion = 0;

                for (int i = 0; i < n.length; i++) {
                        System.out.print("Ingrese el valor: ");
                        n[i] = sc.nextInt();
                }

                System.out.println();
                System.out.print("Ingrese la posicion a eliminar: ");
                posicion = sc.nextInt();

                //desplazamos los elementos siguientes a partir de
                //la posicion indicada por el usuario
                for (int i = posicion; i < n.length-1; i++) {
                        n[i] = n[i+1];
                }

                //Mecanismos de desplazamiento sugerido por el IDE
//                if (n.length - 1 - posicion >= 0)
//                        System.arraycopy(n, posicion + 1, n, posicion, n.length - 1 - posicion);


                //Creamos otro arreglo y copiamos solo los elemenos
                //que se requieren dejar.
                int[] b = new int[n.length-1];
                System.arraycopy(n,0, b, 0,b.length);

                //Re asignado el Arreglo de "b" a "n"
                n = b;

                //mostramos el nuevo arreglo - 1 elemento eliminado
                for (int i = 0; i < n.length; i++) {
                        System.out.println("["+ i + "] = "+ n[i]);
                }


        }
}
