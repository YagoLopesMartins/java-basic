package polimorfismo;

public class OperacaoMatematicaMain {

    public static void calcule(OperacaoMatematica op, double x, double y){
        System.out.println(op.calcular(x,y));
    }

    public static void main(String[] args) {
        calcule(new OperacaoMatematicaSoma(), 5, 5);
        calcule(new OperacaoMatematicaMultiplicacao(), 5, 5);
    }
}
