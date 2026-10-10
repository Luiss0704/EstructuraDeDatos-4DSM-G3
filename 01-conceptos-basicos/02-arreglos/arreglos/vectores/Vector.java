package mx.edu.uttt.arreglos.vectores;

import javax.swing.*;

public class Vector {
    private int[] vector;
    private int tamanio;

    public Vector() {
        this.vector = new int[2];
        this.tamanio = vector.length;
    }

    public Vector(int tamanio) {
        this.vector = validarTamanio(tamanio) ? new int[tamanio] : new int[2];
        this.tamanio = this.vector.length;
    }

    private boolean validarTamanio(int tamanio) {
        return tamanio > 0;
    }


    private boolean sonIguales(int[] vector) {
        return this.vector.length == vector.length;
    }


    public void llenarVector(int[] vector) {
        if (sonIguales(vector)) {
            for (int i = 0; i < this.vector.length; i++) {
                this.vector[i] = vector[i];
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los vectores no son del mismo tamaño", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public int sumarValores() {
        int suma = 0;
        for (int i = 0; i < this.vector.length; i++) {
            suma += this.vector[i];
        }
        return suma;
    }
}
