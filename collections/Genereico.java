package collections;

import java.util.ArrayList;

public class Genereico <E> {

    E elemento;

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public double soma (ArrayList<? extends Number> lista){
//        public double soma (ArrayList<? super Number> lista){

        double total = 0;
        for (Number number : lista){
            total += number.doubleValue();
        }

        return total;
    }

    public static void main(String[] args) {
        Genereico<String> generico = new Genereico<>();
        Genereico<Integer> generico2 = new Genereico<>();

        generico.setElemento("Lago Paranoá");
        generico.getElemento().toLowerCase();
        System.out.println(generico);

        generico2.setElemento(1212);
        generico2.getElemento().toString();
    }
}
