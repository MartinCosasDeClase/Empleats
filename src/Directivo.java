public class Directivo extends Empleats{
    public Directivo(String nombre) {
        super(nombre);
    }
    public String toString() {
        return super.toString() + " --> Directivo";
    }
}
