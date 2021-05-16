

public class EjemploArreglosForOrdenamientoBurbuja {

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

        public static void sortBurbuja(Object[] arreglo){

                int cantidad = arreglo.length;
                int contador = 0;

                for (int i = 0; i < cantidad - 1; i++) {

                        for (int j = 0; j < cantidad -1 -i; j++) {
                                if( ((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0){
                                        Object auxiliar= arreglo[j];
                                        arreglo[j] = arreglo[j + 1];
                                        arreglo[j + 1] = auxiliar;
                                }
                                contador++;
                        }


                }

                System.out.println("Cantidad de iteracciones para Ordenar = " + contador);

        }
        public static void main(String[] args) {

                String[] productos = {"Zofa","Cama","Abanico","Bola"};
                int lenproductos = productos.length;
                //Ordena con el metodo pero del arreglo productos
                sortBurbuja(productos);

                //Arrays.sort(productos);
                //arregloinverso(productos);

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

                Integer[] numeros = new Integer[5];
                int cantidad = numeros.length;

                numeros[0]= 34;
                numeros[1]= -12;
                numeros[2]= 23;
                numeros[3]= 45;
                numeros[4]= 55;

                //Ordena con el metodo pero del arreglo numero
                sortBurbuja(numeros);


                System.out.println("===== Recorrido For Ordenado numero ====== ");
                for (int i = 0; i < cantidad; i++) {
                        System.out.println("para indice [" + i + "] = " + numeros[i]);
                }
        }

}
