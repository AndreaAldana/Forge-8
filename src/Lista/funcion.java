package Lista;

public class funcion {

    public boolean verificar (String valor) throws NumberFormatException {
            if(valor!= null) {
                Integer.parseInt(valor);
                return true;
            }else{
                throw new NumberFormatException("INVÁLIDO");
            }

    }
}
