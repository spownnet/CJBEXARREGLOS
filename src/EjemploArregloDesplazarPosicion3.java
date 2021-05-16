import java.util.Scanner;

public class EjemploArregloDesplazarPosicion3 {
        public static void main(String[] args) {
                int[] n = new int[10];
                Scanner sc = new Scanner(System.in);
                int elemento, posicion = 0;

                for (int i = 0; i < n.length-1; i++) {
                        System.out.print("Ingrese el valor: ");
                        n[i] = sc.nextInt();
                }

                System.out.println();
                System.out.print("Ingrese el elemento a ingresar en el arrero: ");
                elemento = sc.nextInt();

                //Identifico en que posicion debe se insertado
                for (int i = 0; i <= n.length-2; i++) {
                        if (elemento > n[i]){
                                posicion = i+1;
                        }
                }

                //desplazar los elementos correspondientes
                for (int i = n.length-2; i >= posicion; i--) {
                        n[i+1] = n[i];
                }

                //Insertamos el elemento
                n[posicion] = elemento;

                //Imprimimos los resultados.
                for (int i = 0; i < n.length; i++) {
                        System.out.println("Posicion [" + i + "] Valor = " +  n[i]);
                }

        }
}
