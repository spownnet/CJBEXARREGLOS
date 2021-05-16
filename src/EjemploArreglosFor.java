import java.util.Arrays;

public class EjemploArreglosFor {
        public static void main(String[] args) {

                String[] productos = new String[4];
                int lenproductos = productos.length;

                productos[0] = "Mesa plegable";
                productos[1] = "TV LG";
                productos[2] = "Lapto HP";
                productos[3] = "Equipo de Sonido Samsum";

                Arrays.sort(productos);
                System.out.println("==Usando For==");
                for (int i = 0; i < lenproductos; i++) {
                        System.out.println("para indice = " + i + ":" + productos[i]);
                }

                System.out.println("==Usando ForEach==");
                for (String producto:
                     productos) {
                        System.out.println("producto = " + producto);
                }

                System.out.println("==Usando While==");
                int i = 0;
                while (i<lenproductos){
                        System.out.println("productos = " + productos[i]);
                        i++;
                }

                System.out.println("==Usando DoWhile==");
                int x = 0;
                do{
                        System.out.println("productos = " + productos[x]);
                        x++;
                }
                while(x<lenproductos);

                int [] numeros = new int[5];
                int cantnumeros = numeros.length;

                for (int j = 0; j < cantnumeros; j++) {
                        numeros[j] = j * 3;
                }

                for (int j = 0; j < cantnumeros; j++) {
                        System.out.println("numeros[j] = " + numeros[j]);
                }

        }

}
