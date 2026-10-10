package mx.edu.uttt.arreglos.vectores;

public class Vectores {
    private int[] vector;

    public Vectores(int tamano) {
        // Evitar vectores con tamaño negativo
        if (tamano < 0) {
            tamano = 0;
        }
        this.vector = new int[tamano];
    }

    // 1) Agregar Valor al Vector
    public void agregar(int posicion, int valor) {
        if (posicion >= 0 && posicion < vector.length) {
            vector[posicion] = valor;
        } else {
            System.out.println("Error: Posición fuera de los límites del vector.");
        }
    }

    // 2) Llenar el Vector
    public void llenarVector(int[] nuevosValores) {
        if (nuevosValores == null) return;

        int limite = Math.min(this.vector.length, nuevosValores.length);
        for (int i = 0; i < limite; i++) {
            this.vector[i] = nuevosValores[i];
        }
    }

    // 3) Sumar los datos del vector
    public int sumaValores() {
        int suma = 0;
        for (int valor : vector) {
            suma += valor;
        }
        return suma;
    }

    // 4) Sumar los datos del vector de instancia con otro vector
    public int[] sumarVectorConOtro(int[] otroVector) {
        if (otroVector == null || this.vector.length != otroVector.length) {
            throw new IllegalArgumentException("Error: Los vectores deben tener exactamente el mismo tamaño.");
        }

        int[] vectorSuma = new int[this.vector.length];
        for (int i = 0; i < this.vector.length; i++) {
            vectorSuma[i] = this.vector[i] + otroVector[i];
        }
        return vectorSuma;
    }

    // 5) Calcular los pares, y guardarlos en un vector
    public int[] mostrarPares() {
        int cantidad = 0;
        for (int valor : vector) {
            if (valor % 2 == 0) {
                cantidad++;
            }
        }

        int[] pares = new int[cantidad];
        int i = 0;
        for (int valor : vector) {
            if (valor % 2 == 0) {
                pares[i] = valor;
                i++;
            }
        }
        return pares;
    }

    // 6) Calcular los números primos y guardarlos en un vector
    public int[] mostrarPrimos() {
        int cantidad = 0;
        for (int valor : vector) {
            if (esPrimo(valor)) {
                cantidad++;
            }
        }

        int[] primos = new int[cantidad];
        int i = 0;
        for (int valor : vector) {
            if (esPrimo(valor)) {
                primos[i] = valor;
                i++;
            }
        }
        return primos;
    }

    private boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 7) Promedio de los valores del Vector
    public double promedio() {
        if (vector.length == 0) {
            return 0.0;
        }
        return (double) sumaValores() / vector.length;
    }

    // 8) Valor Mayor
    public int valorMayor() {
        if (vector.length == 0) {
            throw new IllegalStateException("El vector está vacío, no hay valor mayor.");
        }

        int mayor = vector[0];
        for (int valor : vector) {
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

    // 9) Valor Menor
    public int valorMenor() {
        // Caso límite: vector vacío
        if (vector.length == 0) {
            throw new IllegalStateException("El vector está vacío, no hay valor menor.");
        }

        int menor = vector[0];
        for (int valor : vector) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    // 10) Buscar un elemento, debe dar el dato y la posición
    public String buscarElemento(int datoABuscar) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == datoABuscar) {
                return "Dato encontrado: " + datoABuscar + " en la posición: " + i;
            }
        }
        return "El dato " + datoABuscar + " no se encuentra en el vector.";
    }




    public int obtenerTamanio () {
        return this.vector.length;
    }



    public String imprimir() {
        String salida = "";
        for (int valor : this.vector) {
            salida += valor + " ";
        }
        return salida;
    }
}