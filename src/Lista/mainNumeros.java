package Lista;

import java.nio.channels.NonReadableChannelException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes;

public class mainNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EsNumerico ab = new EsNumerico();

        System.out.println("Introduce 10 números");

        for (int i = 0; i < 10; i++) {
            try {
                String num = sc.nextLine();
                funcion an = new funcion();
                System.out.println(an.verificar(num));
            } catch (NumberFormatException an) {
                System.out.println(an.getMessage());
            }
        }
    }
}
