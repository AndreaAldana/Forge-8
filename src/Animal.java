public class Animal implements Actividades{
    String ruido = "";
    private String comer = "";
    private String correr = "";

    public Animal(String ruido) {
        this.ruido = ruido;
    }

    public String coger(){
        return "mmmzi";
    }
    public String cazar(){
        return "Me comí un ciervo";
    }

    @Override
    public String saltar() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String jugar() {
        return null;
    }
}
