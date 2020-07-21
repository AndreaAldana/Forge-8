package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();


        while(true){
        System.out.println("Ingrese palabras o stop");
        String palabra = sc.nextLine();
        if(palabra.equalsIgnoreCase("stop")){
            break;
        }

        palabras.add(palabra);

    }

        String palabraMasLarga = "";
        for(String p : palabras){
            if(p.length() > palabraMasLarga.length())
            palabraMasLarga = p; // para imprimir la palabra más larga en el arreglo
        }
        System.out.println(palabraMasLarga);
        System.out.println(palabras); //Para imprimir todo lo del arreglo
        }

}
