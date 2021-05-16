public class EjemploArregloOrdenPrincipioFinal {
        public static void main(String[] args) {
                int[] numeros= new int[10];
                int[] a = new int[10];
                int total = numeros.length;

                for (int i = 0; i < total; i++) {
                    numeros[i] = i + 1;
                }

                for (int i = 0; i < total/2; i++) {
                        System.out.print("["+numeros[i] + " , ");
                        System.out.println(numeros[total - 1 - i]+ "]");
                }

                int auxiliar = 0;
                for (int i = 0; i < total - i; i++) {
                        a[auxiliar++] = numeros[i];
                        a[auxiliar++] = numeros[total - 1 - i];
                }

                for (int i = 0; i < total - i; i++) {
                        System.out.println("a[i] = " + a[i]);
                }
        }
}
