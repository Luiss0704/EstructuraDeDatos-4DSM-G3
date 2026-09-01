public class Empleado {

    // Variables de instance
    private String numeroNomina;
    private String nombre;
    private String sexo;
    private double sueldo;
    private boolean activo;
    private static int contarObjetos;


    // Sobre carga de constructores
    public Empleado() {
        contarObjetos++;
    }

    public Empleado(String numeroNomina,String nombre, String sexo, double sueldo, boolean activo) {
        this.numeroNomina = numeroNomina;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;
        this.nombre = "";
        this.contarObjetos++;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static int getContarObjetos() {
        return Empleado.contarObjetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                "\nNúmero de nómina: " + getNumeroNomina() +
                "\nSexo: " + getSexo() +
                "\nSueldo: " + getSueldo() +
                (activo ? "\nActivo" : "\nInactivo");
    }
}