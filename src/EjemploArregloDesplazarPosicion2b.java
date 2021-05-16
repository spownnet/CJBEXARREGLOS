import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2b {
        public static void main(String[] args) {
                int[] n = new int[10];
                int elemento, posicion, ultimo;
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < n.length; i++) {
                        System.out.print("Ingese el numero: ");
                        n[i] = sc.nextInt();
                }

                System.out.print("Ingrese el elemento a incluir: ");
                elemento = sc.nextInt();
                System.out.println();
                System.out.print("Ingrese la posicion (0 a 9) del elemento a incluir: ");
                posicion = sc.nextInt();


                ultimo = n[n.length-1];

                for (int i = n.length-2; i >= posicion ; i--) {
                        n[i+1] = n[i];
                }
                n[posicion] = elemento;

                //Proceso intermedio para incluir nuevo elemento
                //e incrementar el tamaño del arreglo
                int[] b = new int[n.length+1];
                System.arraycopy(n,0,b,0,n.length);
                b[posicion] = elemento;
                b[b.length-1] = ultimo;
                n = b;

                for (int i = 0; i < n.length; i++) {
                        System.out.println("Posicion[" + i + "] Valor = " +  n[i]);
                }
        }
}
