public class Main {
    public static void main(String[] args) {
        Empleats e1 = new Empleats("Juan");
        Directivo d1 = new Directivo("Luis");
        Operario o1 = new Operario("Pepe");
        Oficial of1 = new Oficial("Luisa");
        Tecnico t1 = new Tecnico("Ana");

        System.out.println(e1);
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(of1);
        System.out.println(t1);

    }
}
