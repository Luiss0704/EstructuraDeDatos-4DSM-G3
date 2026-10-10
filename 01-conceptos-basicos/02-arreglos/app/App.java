package mx.edu.uttt.app;

import mx.edu.uttt.arreglos.ArreglosMenu;
import mx.edu.uttt.menu.Menu;
import mx.edu.uttt.recursividad.RecursividadMenu;

import javax.swing.*;

public class App {
    static void main(String[] args) {
        iniciar();
    }


    public static void iniciar() {
        String opcion;

        do {
            opcion = Menu.menuPrincipal();
            switch (opcion) {
                case "1":       // Arreglos
                    ArreglosMenu.mostrar();

                    JOptionPane.showMessageDialog(null, "", "Arreglos", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":       //Listas
                    JOptionPane.showMessageDialog(null, "", "Listas", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "3":       // Pilas
                    JOptionPane.showMessageDialog(null, "", "Pilas", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "4":       // Colas
                    JOptionPane.showMessageDialog(null, "", "Colas", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "5":       // Árboles
                    JOptionPane.showMessageDialog(null, "", "Árboles", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "6":       // Árboles
                    RecursividadMenu.mostrar();

                    JOptionPane.showMessageDialog(null, "", "Recursividad", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "0":       // Salir
                    JOptionPane.showMessageDialog(null, "Saliendo del menú", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "¡Está mal!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }

}
