package Lista;

import javax.swing.*;

public class Division {
    int a;
    int b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Inválido");
        } else {
            int resultado = a / b;

        }
        return a / b;
    }
}
