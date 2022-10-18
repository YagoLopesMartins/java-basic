package collections;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Futebol");
        list.add("Boxe");
        list.add("Futebol");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toUpperCase());
        }
        System.out.println(list.indexOf("Boxe"));
    }
}
