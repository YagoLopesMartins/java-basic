package interfaces;

public class InterfaceMain {

    public static void area(InterfaceAreaCalculavel o){
        System.out.println(o.calculaArea());
    }

    public static void main(String[] args) {
        Quadrado q = new Quadrado(2);
        InterfaceAreaCalculavel a = q;
    }
}
