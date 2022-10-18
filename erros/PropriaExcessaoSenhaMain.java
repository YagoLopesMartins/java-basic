package erros;

public class PropriaExcessaoSenhaMain {

    static void autenticar(String senha)
    throws PropriaExcessao
    {
        if ("123".equals(senha)){
            System.out.println("Auth");
        }
        else {
            throw new PropriaExcessao("Senha incorreta");
        }
    }

    public static void main(String[] args) {
        try{
            autenticar("123");
        }catch (PropriaExcessao e){
            System.out.println(e.getMessage());
        }
    }
}
