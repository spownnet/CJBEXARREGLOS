import java.util.Arrays;

public class EjemploArreglosForInverso {
        public static void main(String[] args) {

//                String[] productos = new String[4];
                String[] productos = {"Mesa plegable","TV LG","Lapto HP","Equipo de Sonido Samsum"};
                int lenproductos = productos.length;

//                productos[0] = "Mesa plegable";
//                productos[1] = "TV LG";
//                productos[2] = "Lapto HP";
//                productos[3] = "Equipo de Sonido Samsum";

                Arrays.sort(productos);

                System.out.println("==Usando For==");

                //Recorrido inverso primera forma
                for (int i = 0; i < lenproductos; i++) {
                        System.out.println("para indice = " + (lenproductos - 1 - i) + ":" + productos[lenproductos-1-i]);
                }

                //Recorrido inverso segunda forma
                for (int i = lenproductos-1; i >= 0 ; i--) {
                        System.out.println("productos[" + i + "] valor: " + productos[i]);
                }


        }

}
