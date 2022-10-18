package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
    public static void main(String[] args) {

        Collection<String> colecao = new ArrayList<>();
            colecao.add("A");
            colecao.add("B");
            colecao.add("C");
            System.out.println(colecao.toString());
            System.out.println("collection estah vazia? :"+ colecao.isEmpty());
            System.out.println("collection possui o elemento 'A'? :"+colecao.contains("A"));
            colecao.remove("B");
        Collection<String> colecao2 = Arrays.asList("O", "U");
            colecao.addAll(colecao2);
            System.out.println(colecao);
            System.out.println(colecao.containsAll(colecao2));

        for (String elemento: colecao) {
            System.out.println(elemento);
        }

        String[] s = colecao.toArray(new String[colecao.size()]);

        System.out.println(Arrays.toString(s));
        colecao.clear();
        System.out.println(colecao);

    }
}
