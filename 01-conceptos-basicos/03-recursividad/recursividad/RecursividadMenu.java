import menu.Menu;
import javax.swing.*;

public class RecursividadMenu {
    public static void mostrar() {
        String opcion;
        do {
            opcion = Menu.menuRecursividad();
            if (opcion == null) {
                return;
            }

            switch (opcion) {
                case "1":
                    try {
                        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número N:"));
                        int resultado = Recursividad.sumarNumeros(n);
                        JOptionPane.showMessageDialog(null, "La suma de 1 a " + n + " es: " + resultado);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un número entero válido.");
                    }
                    break;

                case "2":
                    try {
                        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para el factorial:"));
                        int resultado = Recursividad.factorialConMulti(n);
                        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + resultado);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un número entero válido.");
                    }
                    break;

                case "3":
                    try {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número (x):"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número (y):"));
                        int resultado = Recursividad.multiConSumas(x, y);
                        JOptionPane.showMessageDialog(null, "El resultado de " + x + " x " + y + " es: " + resultado);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar números enteros válidos.");
                    }
                    break;

                case "4":
                    try {
                        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                        int exp = Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente:"));
                        int resultado = Recursividad.potenciaConMulti(base, exp);
                        JOptionPane.showMessageDialog(null, base + " elevado a la " + exp + " es: " + resultado);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar números enteros válidos.");
                    }
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (true);
    }
}