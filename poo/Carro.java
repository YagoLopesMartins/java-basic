package poo;

public class Carro {
    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    CarroMotor motor;

    public Carro(String modelo, int velocidadeMaxima, double segundosZeroCem) {
        this(modelo, velocidadeMaxima, segundosZeroCem, null);
    }
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroCem, CarroMotor motor) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroCem;
        this.motor = motor;
    }

    public Carro() {}
}
