public class geteryshetter {
    private String nombreCompleto;
    private String dni;
    private String telefono;

    // Constructor
    public Persona(String nombreCompleto, String dni, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.telefono = telefono;
    }

    // Métodos getter
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("DNI: " + dni);
        System.out.println("Teléfono: " + telefono);
    }
}

}
