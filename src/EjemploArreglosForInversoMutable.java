import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

        //Implementamos en un metodo el ordenamiento descendente
        public static void arregloinverso(String[] arreglo){
                //Modificacion del arreglo
                int lenproductos = arreglo.length;
                int lenproductos2 = arreglo.length;
                for (int i = 0; i < lenproductos2; i++) {

                        String actual = arreglo[i];
                        String inverso = arreglo[lenproductos-1-i];
                        arreglo[i] = inverso;
                        arreglo[lenproductos-1-i] = actual;
                        lenproductos2--;
                }
        }

        public static void main(String[] args) {

                String[] productos = {"Mesa plegable","TV LG","Lapto HP","Equipo de Sonido Samsum"};
                int lenproductos = productos.length;

                Arrays.sort(productos);
                arregloinverso(productos);

                //Haciendo uso de la API Collection.reverse
                //Collections.reverse(Arrays.asList(productos));

                //Recorrido for
                System.out.println("===== Antes Recorrido For ====== ");
                for (int i = 0; i < lenproductos; i++) {
                        System.out.println("para indice [" + i + "] = " + productos[i]);
                }

//                //Recorrido for
//                System.out.println("===== Despues Recorrido For ====== ");
//                for (int i = 0; i < lenproductos; i++) {
//                        System.out.println("para indice ["+ i +"] = " + productos[i]);
//                }

        }

}
