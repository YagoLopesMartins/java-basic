package heranca;

public abstract class AbstractClass {
    double peso;
    String comida;

    void dormir(){
        System.out.println("Dormiu!");
    }
    abstract void fazerBarulho();


    public AbstractClass() {
    }

    public AbstractClass(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }
}
