public class Empleats {
    protected String nombre;

    public Empleats() {
    }

    public Empleats(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
        return "Empleado "+ nombre;
    }
}
