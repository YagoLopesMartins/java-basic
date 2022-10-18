import java.util.Scanner;

public class Main {

    public static void printHelloWorld(){
        System.out.println("[2] Hello world! for function or method");
    }
    public static void main(String[] args) {
        System.out.println("[1] Hello world!");
        printHelloWorld();
        final double PI =3.14; // final equal constante

        String name  = "";
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        name = scanner.nextLine();

        System.out.println("\nSeja bem vindo: "+name +" :)");

//        Cachorro pitbull2 = new Cachorro();
//                    pitbull2.tamanho = 50;
//                    pitbull2.raca = "Pitbull 2";
//                    pitbull2.latir();
    }
}