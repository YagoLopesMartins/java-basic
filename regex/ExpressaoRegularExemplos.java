package regex;

public class ExpressaoRegularExemplos {
    public static void main(String[] args) {
        // Data
        String padraoData = "26/02/1994";
        boolean result = padraoData.matches("\\d{2}/\\d{2}/\\d{4}");
        //System.out.println(result);

        // E-mail
        String email = "yagolopesmartins777@gmail.com";
//        boolean regex = email.matches("[a-zA-Z]@[a-z]. com | org ");
        boolean regex = email.matches("\\w+@\\w+\\.\\w{2,3}");
        String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        //System.out.println(email);

        // URL (objetivo) http://www.xti.com.br/2011/clientes.jsp
        String oldUrl = "www.xti.com.br/clientes-2011.html";
        String urlRegex = "www.xti.com.br/\\w{2,}-\\d{4}.html";
        boolean teste = oldUrl.matches(urlRegex);
        System.out.println(teste);

        String urlRegexFinalWithVariables = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";

        System.out.println(oldUrl);
        String newStringAfterRegex = oldUrl.replaceAll(urlRegexFinalWithVariables, "https://$1/$3/$2.jsp");
        System.out.println(newStringAfterRegex);

    }
}
