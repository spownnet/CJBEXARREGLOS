import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
        public static void main(String[] args) {
                int[] n = new int[10];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < n.length; i++) {
                        System.out.print("Ingese el numero: ");
                        n[i] = sc.nextInt();
                }

                int ultimovalor = n[n.length-1];

                for (int i = n.length-2; i >= 0 ; i--) {
                        n[i+1] = n[i];
                }
                n[0] = ultimovalor;

                for (int i = 0; i < n.length; i++) {
                        System.out.println("Posicion[" + i + "] Valor = " +  n[i]);
                }
        }
}
