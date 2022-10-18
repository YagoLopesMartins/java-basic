package heranca;

public class HerancaAnimalMain {
    public static void main(String[] args) {
        HerancaCachorro toto = new HerancaCachorro();
            toto.comida = "Ração";
            toto.fazerBarulho();
            toto.dormir();

        HerancaGalinha galinha = new HerancaGalinha();
            galinha.dormir();
    }
}
