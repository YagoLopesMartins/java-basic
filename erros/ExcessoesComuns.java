package erros;

public class ExcessoesComuns {

    static int[] arrayNull;
    static int[] arrayNull2 = new  int[0];

    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException
        // ClassCastException
        // NumberFormatException
        System.out.println(arrayNull.length ); // NullPointerException
    }
}
