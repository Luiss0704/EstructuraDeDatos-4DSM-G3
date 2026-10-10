package mx.edu.uttt.arreglos;

import mx.edu.uttt.arreglos.vectores.Vectores;
import mx.edu.uttt.menu.Menu;

import javax.swing.*;

public class ArreglosMenu {
    private static Vectores objVector;

    private static void inicializar() {
        int tamanio = 0;

        do {
            try {
                tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamaño del arreglo", "Tamaño", JOptionPane.QUESTION_MESSAGE));
                objVector = new Vectores(tamanio);
                return;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para la fila.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }

    public static void mostrar() {
        String opcion;
        do {
            opcion = Menu.menuArreglos();
            switch (opcion) {
                case "1":       // Vectores
                    menuVectores();
                    break;

                case "2":       //  Matrices
                    menuVectores();
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "¡Está mal!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }


    public static void menuVectores() {
        inicializar();
        String opcion;

        do {
            opcion = Menu.menuVectores();
            switch (opcion) {
                case "1":       //  Llenar vector
                    objVector.llenarVector(obtenerVector());
                    break;

                case "2":       //  Sumar elementos
                    JOptionPane.showMessageDialog(null, objVector.sumaValores(), "Sumar elementos", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "3":       //  Imprimir
                    JOptionPane.showMessageDialog(null, objVector.imprimir());
                    break;

                case "0":       //  Regresar
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "¡Está mal!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }


    public static void menuMatrices() {
        String opcion;

        do {
            opcion = Menu.menuMatrices();
            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "", "Llenar matriz", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "¡Está mal!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }


    public static int [] obtenerVector () {
        int tamanio = objVector.obtenerTamanio();
        int [] vector = new int[tamanio];
        llenarVector(vector);

        return vector;
    }


    private static void llenarVector(int [] vector) {
        int valor = 0;

        for (int i = 0; i < vector.length; i++) {
            do {
                try {
                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor " + (i + 1) + ":", "Valor " + (i + 1), JOptionPane.QUESTION_MESSAGE));
                    vector[i] = valor;
                    return;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para la fila.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (true);
        }
    }
}
