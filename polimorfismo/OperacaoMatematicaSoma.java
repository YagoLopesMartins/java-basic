package polimorfismo;

public class OperacaoMatematicaSoma extends OperacaoMatematica{

    @Override
    public double calcular(double x, double y) {
        return x + y;
    }
}
