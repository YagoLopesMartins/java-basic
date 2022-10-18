package heranca;

public class HerancaCachorro extends HerancaAnimal {

    public HerancaCachorro() {
    }

    public HerancaCachorro(double peso, String comida) {
        super(peso, comida);
    }
    @Override
    void fazerBarulho() {
        //  super.fazerBarulho();
        System.out.println("Au au!");
    }
}
