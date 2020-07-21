import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class practicaDeLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        int suma = 0;
        int counter = 0;

        System.out.println("Ingresa números");

        while (true) {
            int numeros = sc.nextInt();
            if (numeros == -99) {
                break;
            } else {
                num.add(numeros);
                suma += numeros;
                counter++;
            }

        }

        System.out.println(num);
        System.out.println("La suma de todos los elementos es " + suma);
        int media = suma / counter;
        System.out.println("La media de la sumatoria de los elementos es " + (double) media);


        int mayor = Collections.max(num);


        while (true) { // por favor, termina
            int max = 0;
            for (int x : num) {
                if (x > media) {
                    max = x;
                }
            }
            int posMax = num.indexOf(max);
            int guarda = max;
            num.remove(max);
            System.out.println(max);

        }

    }
}
