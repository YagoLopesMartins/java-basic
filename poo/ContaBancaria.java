package poo;

public class ContaBancaria {
    String cliente;
    double saldo;

    public void exibeSaldo(){
        System.out.println(cliente +", seu saldo eh: "+saldo);
    }
    public void saca(double valor){
        /** Regras de negócio:
         * 1) Verificar sepossui autorização;
         * 2) Se limite de saque do dia fora ultrapassado;
         * 3) Se tem saldo na conta;
         * */
        if (this.saldo >= valor){
            System.out.println("-Sacou: "+valor);
            this.saldo -= valor;
        }else {
            System.out.println("Nao foi possivel realizar o saque");
        }
    }
    public void deposita(double valor){
        System.out.println("+Depositou: "+valor);
        this.saldo += valor;
    }
    public void transferePara(ContaBancaria contaDestino, double valor){
        this.saca(valor);
        contaDestino.deposita(valor);
    }
}
