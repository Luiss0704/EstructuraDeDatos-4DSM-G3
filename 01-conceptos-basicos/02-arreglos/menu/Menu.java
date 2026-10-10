package mx.edu.uttt.menu;

import javax.swing.*;

public class Menu {
    public static String menuPrincipal() {
        String opciones = """
                ======    ESTRUCTURAS DE DATOS    ======
                1) Arreglos
                2) Listas
                3) Pilas
                4) Colas
                5) Árboles
                6) Recursividad
                0) Salir
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuArreglos() {
        String opciones = """
                ======    ARREGLOS    ======
                1) Vectores
                2) Matrices
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuVectores() {
        String opciones = """
                ======    VECTORES    ======
                1) Llenar vector
                2) Sumar elementos
                3) Imprimir
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuMatrices() {
        String opciones = """
                ======    MATRICES    ======
                1) Reserva de asientos
                2) Acumulado de ventas
                3) Matriz de identidad
                4) Diagonal principal
                5) Transposición
                6) Rotación
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuListas() {
        String opciones = """
                ======    LISTAS    ======
                1) 
                ...
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuPilas() {
        String opciones = """
                ======    PILAS    ======
                1) 
                ...
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuColas() {
        String opciones = """
                ======    COLAS    ======
                1) 
                ...
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuArboles() {
        String opciones = """
                ======    ÁRBOLES    ======
                1) 
                ...
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }


    public static String menuRecursividad() {
        String opciones = """
                ======    RECURSIVIDAD    ======
                1) Sumar números
                2) Factorial de un número
                3) Multiplicación con sumas
                4) Potencia con multiplicaciones
                0) Regresar
                Seleccione una opción:""";

        return JOptionPane.showInputDialog(null, opciones, "Opciones", JOptionPane.QUESTION_MESSAGE);
    }
}
