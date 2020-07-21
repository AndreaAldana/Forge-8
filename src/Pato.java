public class Pato extends Animal implements Actividades{


    public Pato(String ruido) {
        super(ruido);
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
        return "mmm k ricocuack";
    }

    @Override
    public String jugar() {
        return null;
    }

    public String CUACK (){
        return "menfado";
    }
}
