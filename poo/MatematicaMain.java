package poo;

public class MatematicaMain {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();


        int maior       = matematica.maior(9, 15);
        int raiz        = matematica.raiz(276);
        String romanos  = matematica.romanos(10);
        double soma     = matematica.soma();

        System.out.println(" Maior: "+maior+ "\n Raiz: "+raiz+"\n Romanos: "+romanos+"\n Soma: "+soma);

        System.out.println(matematica.soma2(5,6,9,78,2,1,9));
    }
}
