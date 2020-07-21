package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaBorrando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 números");
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i< 10; i++){
            int num = sc.nextInt();
            numeros.add(num);
        }
        System.out.println(numeros);


        while(!numeros.isEmpty()){int max = 0;
            for(int x : numeros){
                if(x>max){
                    max = x;
                }
            }int posMax = numeros.indexOf(max);
            numeros.remove(posMax);
            System.out.println(numeros);
        }

    }

}
