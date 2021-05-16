import java.util.Scanner;

public class EjemploArregloParesImpares {
        public static void main(String[] args) {

                int[] a, pares, impares;
                int totalpares = 0, totalimpares=0;
                a = new int[10];

                Scanner sc = new Scanner(System.in);


                System.out.println("Ingrese 10 numeros: ");
                for (int i = 0; i < a.length; i++) {
                        a[i] = sc.nextInt();
                }

                //Contabilizar la cantidad de pares e impares identificados
                for (int i = 0; i < a.length; i++) {
                        if(a[i]%2 == 0){
                                totalpares++;
                        }else{
                                totalimpares++;
                        }
                }

                //Inicializar los arreglos pares e impares basado
                //en la cantidad de valores identificados de pares e impares
                pares = new int[totalpares];
                impares = new int[totalimpares];

                //Almancenar en los arreglos correspondiente de pares e impares.
                //Los valores correspondientes.
                int j = 0, k=0;
                for (int i = 0; i < a.length; i++) {
                        if(a[i]%2 == 0){
                                pares[j++] = a[i];
                        } else {
                                impares[k++] = a[i];
                        }
                }

                System.out.println("Pares");
                for (int i = 0; i < pares.length; i++) {
                        System.out.print(pares[i] + " ");
                }

                System.out.println("\r\nImpares");
                for (int i = 0; i < impares.length; i++) {
                        System.out.print(impares[i] + " ");
                }

                System.out.println();
        }
}
