package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Manga");
        lista.add("Uva");
        lista.add("Pera");
        lista.add("Pera");
        lista.add("Pera");
        lista.add("Maca");
        lista.add("Cupuacu");
        Collections.sort(lista);
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);
        Collections.shuffle(lista); // ramdom
        System.out.println(lista);

        System.out.println(Collections.frequency(lista, "Pera"));


    }
}
