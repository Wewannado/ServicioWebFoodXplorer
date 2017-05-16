package bd;

public class TipoProducto {

    private int idTipo;
    private String nombre;

    public TipoProducto() {
    }

    public TipoProducto(int idTipo, String nombre) {
        this.idTipo = idTipo;
        this.nombre = nombre;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoProducto{" + "idTipo=" + idTipo + ", nombre=" + nombre + '}';
    }

}
