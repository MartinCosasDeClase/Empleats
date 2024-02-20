public class Operario extends Empleats{
    public Operario(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return super.toString() + " --> Operario";
    }
}
