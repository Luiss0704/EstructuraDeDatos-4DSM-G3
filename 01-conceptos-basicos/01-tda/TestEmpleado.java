import javax.swing.*;

public class TestEmpleado {
    private static Empleado empl;

    public static void main(String[] args) {
        iniciar();
    }

    private static void iniciar() {
        String numeroNomina = solicitarTexto("número de nomina:");
        String nombre = solicitarTexto("nombre del empleado:");

        empl = new Empleado(numeroNomina, "Adrian", "Masculino", 34000.56, true);

        imprimir();
    }

    public static String solicitarTexto(String valor) {
        return JOptionPane.showInputDialog("Ingrese el " + valor);
    }

    public static void imprimir() {
        String salida = "Datos del empleado:\n" + empl.toString() +
                "\n\nNumero de Objetos Creados:\n" + Empleado.getContarObjetos();
        JOptionPane.showMessageDialog(null, salida);
    }

}