package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listaRandom {
    public static void main(String[] args) {

        List<Integer> azar = new ArrayList<>();
        int limite = 10;
        int i = 0;

        for(i = 0; i<limite; i++){
            int random = (int) (Math.random()*20);
            azar.add(random);

        }
        System.out.println(azar);
        int temp = azar.get(0);
        azar.set(0,azar.get(9));
        azar.set(9,temp);
        System.out.println(azar);
        int max = 0;
        int min = 1;

        for(int x : azar){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }

        }
        int posMax = azar.indexOf(max);
        int posMin = azar.indexOf(min);
        azar.set(posMax,min);
        azar.set(posMin,max);
        System.out.println(azar);

    }
}
