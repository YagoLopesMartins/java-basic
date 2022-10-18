package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegularBasic {
    public static void main(String[] args) {
//         String padrao = "Java";
//         String texto = "Java";
//
//         boolean isPadraoEqualTexto = texto.matches(padrao);
//        boolean isPadraoEqualTexto = "Java".matches("Java");
//        System.out.println(isPadraoEqualTexto);

        /* Modificadores */
        // (?i, ?x, ?m, ?s) minuscuala, maiuscula, comentarios, ,ultilinhas, dottal
//        boolean isPadraoEqualTexto = "Java".matches("(?i)java");
//        System.out.println(isPadraoEqualTexto);

        /* Metacaracters */
        //  . \d \D \s \S\w \W  -> qualquer caractere [0-9][^0-9][\t\n\x0B\f\r][^\s][a-zA-Z_0-9] não é letra
//        boolean result = "@".matches(".");
//        boolean result = "2".matches("\\d");
//        boolean result = "A".matches("\\w");
//        boolean result = " ".matches("\\s");
//
//        boolean result = "Pi".matches("..");
//        boolean result = "Pie".matches("...");
//        boolean result = "21".matches("\\d\\d");

//        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
//        boolean result = "69079-070".matches(cep);
//        System.out.println(result);

        /* Quantificadores */
        /* X{n}, X{n,}, X{n,m}, X?, X*, X+
         exatamente n vezes, pelo menos, pelo menos nao mais que m, 0ou 1 vez, 0 ou mais vezes, 1 ou mais vezes
        * */
//        String cep = "\\d{5}-\\d{3}";
//        boolean result = "69079-070".matches(cep);
////        boolean paswordMinEightDigits = "1234567889".matches("\\d{8,}");
//        boolean paswordMinEightDigits = "12345678910".matches("\\d{6,10}");
//        System.out.println(result);
//        System.out.println(paswordMinEightDigits);

//        boolean qtdCaracteres = "1".matches(".?"); // [0-1]
//        boolean qtdCaracteres = "123".matches(".?");
//        boolean qtdCaracteres = "123".matches(".*");
//        boolean qtdCaracteres = "".matches(".+");
//        boolean qtdCaracteres2 = "123".matches(".+");
//        System.out.println(qtdCaracteres);
//        System.out.println(qtdCaracteres2);

        /* Metacaracters de Fronteira */
        // ^ inicia, $ finaliza; | ou*/

//        boolean exp  = "Pier21".matches("^Pier.*");
//        boolean exp  = "Pier21".matches(".*21$");
//        boolean exp  = "tem java aqui".matches(".*java.*");
//        boolean exp  = "tem java aqui".matches("^tem.*aqui$");
//        boolean exp  = "sim".matches("sim|não");
//        System.out.println(exp);

        /* Agrupadores  */
        // [...] agrupamento. [a-z] alcance, [a-e][i-u] união, [a-z&&][aeiou] Interseção
        // [^abc] Exceção, [a-z&& [^m-p]] Subtração, \x fuga literal

//        boolean padrao = "True".matches("[tT]rue | [yY]es");
//        boolean padrao = "Beatriz".matches("[A-Z][a-zA-Z]*");
//        boolean padrao = "alho".matches("[^abc]lho"); // exclui abc
//        boolean padrao = "creu".matches("cr[ae]u");
//        System.out.println(padrao);

        String texto = "Qual eh o Doce mais doCe que o doce?";
        String texto2 = "O rato roeu a roupa dorei de roma";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(texto);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

        /* substituição */
        String textoUpdated = texto.replaceAll("(?i)doce", "DOCINHO");
        System.out.println(textoUpdated);

        System.out.println(texto2.replaceAll("r[aeiou]", "XA"));
        System.out.println(texto2.replaceAll("\\s", "\t"));
    }
}
