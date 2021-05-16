import java.util.Scanner;

public class EjemploArregloNotaAlumno {
        public static void main(String[] args) {
                double[] claseMat, claseHist, claseLenguaje;
                double notaAcumMat=0, notaAcumHist=0, notaAcumLeng=0;

                claseMat = new double[7];
                claseHist= new double[7];
                claseLenguaje= new double[7];

                Scanner sc = new Scanner(System.in);

                System.out.println("Ingrese 7 Notas de Estudiantes para Matematicas");
                for (int i = 0; i < claseMat.length; i++) {
                        claseMat[i] = sc.nextDouble();

                }
                System.out.println("Ingrese 7 Notas de Estudiantes para Historia");
                for (int i = 0; i < claseHist.length; i++) {
                        claseHist[i] = sc.nextDouble();

                }
                System.out.println("Ingrese 7 Notas de Estudiantes para Lenguaje");
                for (int i = 0; i < claseLenguaje.length; i++) {
                        claseLenguaje[i] = sc.nextDouble();
                }

                for (int i = 0; i < 7; i++) {
                        notaAcumMat += claseMat[i];
                        notaAcumHist += claseHist[i];
                        notaAcumLeng += claseLenguaje[i];
                }

                double promediofinal = ((notaAcumMat/claseMat.length)+(notaAcumHist/claseHist.length)+(notaAcumLeng/claseLenguaje.length)) / 3;
                System.out.println("Promedio de Notas Matematicas: " + notaAcumMat/claseMat.length);
                System.out.println("Promedio de Notas Historia: " + notaAcumHist/claseHist.length);
                System.out.println("Promedio de Notas Lenguaje: " + notaAcumLeng/claseLenguaje.length);
                System.out.println("promediofinal = " + promediofinal);


                System.out.println("Ingrese el identificador del ALumno de 0 - 6:");
                int id = sc.nextInt();
                double promedioAlumno = ((claseMat[id])+(claseHist[id])+(claseLenguaje[id])) / 3;
                System.out.println("promedioAlumno = " + promedioAlumno);

        }
}
