package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero2 {

    public static void dividir(Scanner scanner)
    throws  InputMismatchException, ArithmeticException
    {
        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();
        System.out.println("Digite um numero: ");
        int b = scanner.nextInt();
        System.out.println( a / b);
    }

    public static void main(String[] args) {
        // int x = 1/0; // Exception ArithmeticException
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        do {
            try{
                System.out.println("Digite um numero: ");
                int a = scanner.nextInt();
                System.out.println("Digite um numero: ");
                int b = scanner.nextInt();
                System.out.println( a / b);

                // dividir(scanner);
                continua = false;
            }catch (InputMismatchException | ArithmeticException e){ // multi catch
                System.out.println("Entrada invalidas");
                e.printStackTrace();
                e.getMessage();
                scanner.nextLine();
            }
            finally { // fechar conexoes, limpar variaveis
                System.err.println("Executou Finaly");
            }
        }while (continua);
    }
}
