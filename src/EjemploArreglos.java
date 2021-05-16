import java.util.Arrays;

public class EjemploArreglos {
        public static void main(String[] args) {

                String[] productos = new String[4];
                productos[0] = "Mesa plegable";
                productos[1] = "TV LG";
                productos[2] = "Lapto HP";
                productos[3] = "Equipo de Sonido Samsum";

                Arrays.sort(productos);

                System.out.println("productos[0] = " + productos[0]);
                System.out.println("productos[1] = " + productos[1]);
                System.out.println("productos[2] = " + productos[2]);
                System.out.println("productos[3] = " + productos[3]);

                int [] numeros = new int[5];

                numeros[0]= 34;
                numeros[1]= -12;
                numeros[2]= 23;
                numeros[3]= 45;
                numeros[4]= 55;

                Arrays.sort(numeros);

                int x1 = numeros[0];
                int x2 = numeros[1];
                int x3 = numeros[2];
                int x4 = numeros[3];
                int x5 = numeros[4];


                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
                System.out.println("x3 = " + x3);
                System.out.println("x4 = " + x4);
                System.out.println("x5 = " + x5);

        }

}
