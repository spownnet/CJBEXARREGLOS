import java.util.Scanner;

public class EjemploArregloDesplazarPosicion3b {
        public static void main(String[] args) {
                int[] n = new int[10];
                Scanner sc = new Scanner(System.in);
                int elemento, posicion = 0, ultimo;

                for (int i = 0; i < n.length; i++) {
                        System.out.print("Ingrese el valor del la posicion ["+ i + "] = ");
                        n[i] = sc.nextInt();
                }

                System.out.println();
                System.out.print("Ingrese el elemento a ingresar en el arrero: ");
                elemento = sc.nextInt();

                ultimo = n[n.length-1];

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


                //proceso intermedio
                int[] b = new int[n.length+1];
                System.arraycopy(n,0,b,0, n.length);


                if (elemento > ultimo){
                        b[b.length-1] = elemento;
                } else {
                        //Insertamos el elemento
                        b[posicion] = elemento;
                        b[b.length-1] = ultimo;
                }

                n = b;

                //Imprimimos los resultados.
                for (int i = 0; i < n.length; i++) {
                        System.out.println("Posicion [" + i + "] Valor = " +  n[i]);
                }

        }
}
