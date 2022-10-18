package poo;

public class CarroMain {
    public static void main(String[] args) {
        Carro ferrari  = new Carro("Ferrari Enzo", 349, 3.2);
        CarroMotor v12  = new CarroMotor("V12", 660);

        ferrari.motor = v12;

        System.out.println(ferrari.motor.tipo);
    }
}
