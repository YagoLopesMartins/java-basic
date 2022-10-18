package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
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
                continua = false;
            }catch (InputMismatchException e){
                System.out.println("Entrada invalidas, entre com valores inteiros");
                scanner.nextLine();
            }
            catch (ArithmeticException e){
                System.err.println("Impossivel dividor valor por ZERO");
                scanner.nextLine();
            }
            finally { // fechar conexoes, limpar variaveis
                System.err.println("Executou Finaly");
            }
        }while (continua);
    }
}
