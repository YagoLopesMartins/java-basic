package enumTest;

public class EnumMain {



    public static void main(String[] args) {
        System.out.println(EnumPecasXadrez.BISPO);
        System.out.println(EnumMedida.M.titulo);

        for (EnumMedida m : EnumMedida.values()){
            System.out.println(m + " : " + m.titulo);
        }
    }
}
