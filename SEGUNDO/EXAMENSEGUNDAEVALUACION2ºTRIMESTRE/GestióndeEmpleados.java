package SEGUNDO.EXAMENSEGUNDAEVALUACION2ºTRIMESTRE;

public class GestiondeEmpleados {
    // Atributos
    private String nombre;
    private String dni;
    private int aniosEmpresa;
    private double sueldoBase;
    private String puesto;

    // Constructor vacío
    public void Empleado() {
    }

    // Constructor con parámetros
    public void Empleado(String nombre, String dni, int aniosEmpresa, double sueldoBase, String puesto) {
        this.nombre = nombre;
        this.dni = dni;
        this.aniosEmpresa = aniosEmpresa;
        this.sueldoBase = sueldoBase;
        this.puesto = puesto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAniosEmpresa() {
        return aniosEmpresa;
    }

    public void setAniosEmpresa(int aniosEmpresa) {
        this.aniosEmpresa = aniosEmpresa;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Método para mostrar los datos del empleado
    public void mostrarDatos() {
        System.out.println(
                "Nombre: " + nombre + " | DNI: " + dni + " | Puesto: " + puesto +
                        " | Años en la empresa: " + aniosEmpresa + " | Sueldo Base: " + sueldoBase + "€"
        );
    }

    // Método para calcular el sueldo total
    public double calcularSueldoTotal() {
        int trienios = aniosEmpresa / 3; // Cada 3 años se gana un extra
        return sueldoBase + (trienios * 100); // 100€ por cada trienio
    }
}