package heranca;

public class HerancaAnimal {

    double peso;
    String comida;

    void dormir(){
        System.out.println("Dormiu!");
    }
    void fazerBarulho(){
        System.out.println("Fazer barulho!!");
    }

    public HerancaAnimal() {
    }

    public HerancaAnimal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }
}
