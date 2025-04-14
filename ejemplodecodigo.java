package amachon;
public class ejemplodecodigo {


    public class Articulos {

        //Atributos
        private int idCodigo;
        private String nombre;
        private int cantidad;
        private double precio;
        private int dto;

        //Constructores
        public Articulos() {
            idCodigo = 0;
            nombre = "";
            cantidad = 0;
            precio = 0.0;
            dto = 0;
        }

        public Articulos(int idCodigo, String nombre, int cantidad, double precio, int dto) {
            this.idCodigo = idCodigo;
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
            this.dto = dto;
        }

        //Getters y Setters
        public int getIdCodigo() {
            return idCodigo;
        }

        public void setIdCodigo(int idCodigo) {
            this.idCodigo = idCodigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getDto() {
            return dto;
        }

        public void setDto(int dto) {
            this.dto = dto;
        }

        public double total() {

            return (cantidad * precio) - ((cantidad * precio * dto)/100);
        }

        public String mostrarInfo() {
            return "Articulo " + idCodigo + ":  Nombre:" + nombre+ " cantidad:"+ cantidad
                    + " precio:" + precio + "€ dto:" + dto + "% TOTAL= " + total();
        }

    }
}
