package mx.edu.uttt.arreglos.vectores;

public class ReforzamientoVectores {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] desorden = {4, 5, 1, 3, 6, 2, 8, 7, 9, 2, 5, 7, 4, 4, 2};
        int[] faltante = {1, 2, 3, 4, 6, 7};


        System.out.println(imprimirExtremos(a));
        System.out.println(sumarElementos(a));
        System.out.println(numMayor(desorden));
        System.out.println(paresEImpares(desorden));
        System.out.println(invertirArreglo(a));
        System.out.println(numeroDentroDeVector(desorden, 4));
        System.out.println(promedioElementos(desorden));

        // Primera forma de hacerlo:
        System.out.println(mayoresQuePromedio1(desorden, promedioElementos(desorden)));
        // Segunda forma de hacerlo:
        System.out.println(mayoresQuePromedio2(desorden));

        System.out.println(numeroFaltante(faltante));
    }

    public static String imprimirExtremos(int[] a) {
        String resultado = "";

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                resultado += "Primera posición: " + a[i] + "\n";
            } else if (i == a.length - 1) {
                resultado += "Última posición: " + a[i] + "\n";
            }
        }
        return resultado;
    }


    public static String sumarElementos(int[] a) {
        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }

        return "La suma de todos los elementos del arreglo es: " + suma;
    }


    public static String numMayor(int[] desorden) {
        int mayor = 0;
        for (int i = 0; i < desorden.length; i++) {
            if (desorden[i] > mayor) {
                mayor = desorden[i];
            }
        }

        return "El número mayor es: " + mayor;
    }


    public static String paresEImpares(int[] desorden) {
        int pares = 0;
        String paresString = "";
        int impares = 0;
        String imparesString = "";

        for (int i = 0; i < desorden.length; i++) {
            if (desorden[i] % 2 == 0) {
                pares++;
                if (i == desorden.length - 1) {
                    paresString += desorden[i];
                } else {
                    paresString += desorden[i] + " | ";
                }
            } else if (desorden[i] % 2 != 0) {
                impares++;
                if (i == desorden.length - 1) {
                    imparesString += desorden[i];
                } else {
                    imparesString += desorden[i] + " | ";
                }
            }
        }

        return "Número de pares: " + pares + " \nElementos pares: " + paresString + "\n\nNúmero de impares: " + impares + " \nElementos impares: " + imparesString;
    }


    public static int[] invertirArreglo(int[] a) {
        int[] aux = new int[a.length];
        int j = aux.length - 1;     // Índice que empieza en el último elemento del original

        //Pruebas para comparar los órdenes de los arreglos
        //String prueba1 = "", prueba2 = "";

        for (int i = 0; i < a.length; i++) {
            aux[i] = a[j];
            j--;

            // Prueba para ver el orden original
            // prueba1 += a[i] + ", ";
        }

        // Prueba para saber que sí se invirtió
        /*
        for (int i = 0; i < aux.length; i++) {
            prueba2 += aux[i] + ", ";
        }
        */

        return aux;
    }


    public static String numeroDentroDeVector(int[] desorden, int n) {
        int reps = 0;

        for (int i = 0; i < desorden.length; i++) {
            if (desorden[i] == n) {
                reps++;
            }
        }

        return "El número " + n + " se repitió " + reps + " veces en el arreglo.";
    }


    public static double promedioElementos(int[] desorden) {
        double prom = 0.0, suma = 0;

        for (int i = 0; i < desorden.length; i++) {
            suma += desorden[i];
        }

        prom = suma / desorden.length;

        return prom;
    }


    // Primera forma
    public static String mayoresQuePromedio1(int[] desorden, double prom) {
        int mayores = 0;

        for (int i = 0; i < desorden.length; i++) {
            if (desorden[i] > prom) {
                mayores++;
            }
        }

        return "Hay " + mayores + " números dentro del arreglo que son mayores al promedio de este.";
    }

    // Segunda forma
    public static String mayoresQuePromedio2(int[] desorden) {
        int mayores = 0;

        for (int i = 0; i < desorden.length; i++) {
            if (desorden[i] > promedioElementos(desorden)) {
                mayores++;
            }
        }

        return "Hay " + mayores + " números dentro del arreglo que son mayores al promedio de este.";
    }


    public static String numeroFaltante(int[] faltante) {
        int numFaltante = 0;
        String resultado = "";
        String arreglo = "";

        for (int i = 0; i < faltante.length; i++) {
            arreglo += faltante[i];

            if (i < faltante.length - 1) {
                if (faltante[i + 1] - faltante[i] != 1) {
                    numFaltante = faltante[i] + 1;
                    resultado = "\nEl número faltante es el " + numFaltante;
                }
            }
        }

        return arreglo + resultado;
    }
}
