package poo;

public class GalinhaMain {
    public static void main(String[] args) {
        Galinha g1 = new Galinha();
                g1.botar().botar().botar();

        Galinha g2 = new Galinha();
                g2.botar().botar();

        System.out.println("G1: "+g1.ovos);
        System.out.println("G2: "+g2.ovos);
        System.out.println("Total de ovos: "+Galinha.ovosDaGranja);
        System.out.println("Media de ovos: "+Galinha.mediaDeOvos(2));
    }
}
