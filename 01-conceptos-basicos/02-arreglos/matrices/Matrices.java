package mx.edu.uttt.matrices;

public class Matrices {
    private int[][] m;
    private boolean[][] mapaAsientos; // Matriz para sistema de reservas


    public Matrices() {
        m = new int[2][2];
        mapaAsientos = new boolean[2][2];
    }


    public Matrices(int fila, int columna) {
        if (validar(fila, columna)) {
            this.m = new int[fila][columna];
            this.mapaAsientos = new boolean[fila][columna]; // Se adapta a cualquier dimensión MxN
        } else {
            this.m = new int[2][2];
            this.mapaAsientos = new boolean[2][2];
        }
    }


    private boolean validar(int fila, int columna) {
        boolean valido = true;

        if (fila <= 0 && columna <= 0) {
            valido = false;
        }

        return valido;
    }


    private boolean validarTamanios(int[][] m) {
        return this.m.length == m.length && this.m[0].length == m[0].length;
    }


    public void llenar(int[][] m) {
        if (validarTamanios(m)) {
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[i].length; j++) {
                    this.m[i][j] = m[i][j];
                }
            }

        } else {
            System.out.println("Las matrices no son del mismo tamaño.");
        }
    }


    public void imprimir() {
        for (int fila[] : this.m) {
            for (int valor : fila) {
                System.out.print(valor + "     ");
            }
            System.out.println();
        }
    }


    public String obtenerTamanio() {
        return "Tamaño: (" + this.m.length + ", " + this.m[0].length + ")";
    }


    public boolean validarCuadrada() {
        /*
         * En una matriz:
         * m.length --> Número de filas
         * m[m.length-1].length --> Número de columnas
         */

        return m.length == m[m.length - 1].length;
    }


    public Matrices obtenerTranspuesta() {
        Matrices objMatriz = null;

        if (validarCuadrada()) {
            int [][] transpuesta = new int [this.m.length][this.m.length];
            objMatriz = new Matrices(this.m.length,  this.m.length);

            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    transpuesta[i][j] = this.m[i][j];
                }
            }
            objMatriz.llenar(transpuesta);
        } else {
            System.out.println("Asvertencia: La matriz no es cuadrada.");
        }

        return objMatriz;
    }

    // ==========================================
    // EJERCICIOS
    // ==========================================

    // Ejercicio 1: Sistema de reserva de asientos (Matriz MxN boolean)
    public void reservaAsiento(int fila, int columna) {
        if (fila < 0 || fila >= this.mapaAsientos.length || columna < 0 || columna >= this.mapaAsientos[0].length) {
            System.out.println("Error: Las coordenadas (" + fila + ", " + columna + ") exceden los límites.");
            return;
        }

        if (!this.mapaAsientos[fila][columna]) {
            this.mapaAsientos[fila][columna] = true;
            System.out.println("Éxito: Asiento (" + fila + ", " + columna + ") reservado correctamente.");
        } else {
            System.out.println("Aviso: El asiento (" + fila + ", " + columna + ") ya está ocupado.");
        }
    }

    // Ejercicio 2: Acumulado de ventas por sucursal y mes (Matriz MxN)
    public void reporteVentas() {
        int numSucursales = this.m.length;
        int numMeses = this.m[0].length;

        int[] totalSucursal = new int[numSucursales];
        int[] totalMes = new int[numMeses];

        for (int i = 0; i < numSucursales; i++) {
            for (int j = 0; j < numMeses; j++) {
                totalSucursal[i] += this.m[i][j];
                totalMes[j] += this.m[i][j];
            }
        }

        System.out.println("--- REPORTE DE VENTAS ---");
        for (int i = 0; i < numSucursales; i++) {
            System.out.println("Total Sucursal " + (i + 1) + ": " + totalSucursal[i]);
        }
        for (int j = 0; j < numMeses; j++) {
            System.out.println("Total Mes " + (j + 1) + ": " + totalMes[j]);
        }
    }

    // Ejercicio 3: Diagnóstico de matriz identidad y diagonal principal (Matriz NxN)
    public void diagnosticoIdentidad() {
        if (!validarCuadrada()) {
            System.out.println("Advertencia: Operación cancelada. La matriz no es cuadrada.");
            return;
        }

        boolean esIdentidad = true;
        int sumaDiagonal = 0;

        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                if (i == j) {
                    sumaDiagonal += this.m[i][j];
                    if (this.m[i][j] != 1) {
                        esIdentidad = false;
                    }
                } else {
                    if (this.m[i][j] != 0) {
                        esIdentidad = false;
                    }
                }
            }
        }

        if (esIdentidad) {
            System.out.println("Diagnóstico: SÍ es una matriz identidad.");
        } else {
            System.out.println("Diagnóstico: NO es una matriz identidad.");
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }

    // Ejercicio 4: Transposición dinámica de matriz (MxN -> NxM)
    public Matrices obtenerTranspuestaDinamica() {
        int filasOriginales = this.m.length;
        int columnasOriginales = this.m[0].length;

        // Se crea nueva matriz con dimensiones invertidas NxM
        Matrices transpuestaMatriz = new Matrices(columnasOriginales, filasOriginales);
        int[][] datosTranspuestos = new int[columnasOriginales][filasOriginales];

        for (int i = 0; i < filasOriginales; i++) {
            for (int j = 0; j < columnasOriginales; j++) {
                datosTranspuestos[j][i] = this.m[i][j];
            }
        }

        transpuestaMatriz.llenar(datosTranspuestos);
        return transpuestaMatriz;
    }

    // Ejercicio 5: Rotación de la matriz a 90° en sentido horario (Matriz NxN)
    public Matrices rotar90() {
        if (!validarCuadrada()) {
            System.out.println("Advertencia: Operación cancelada. La matriz no es cuadrada.");
            return null;
        }

        int n = this.m.length;
        Matrices matrizRotada = new Matrices(n, n);
        int[][] datosRotados = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                datosRotados[j][n - 1 - i] = this.m[i][j];
            }
        }

        matrizRotada.llenar(datosRotados);
        return matrizRotada;
    }
}