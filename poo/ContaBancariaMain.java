package poo;

public class ContaBancariaMain {

    public static void main(String [] args){
        ContaBancaria contaDestino = new ContaBancaria();
            contaDestino.saldo = 5000;
            contaDestino.cliente = "Maria";

        ContaBancaria conta = new ContaBancaria();
            conta.saldo = 5000;
            conta.cliente = "Pitbull";
            conta.exibeSaldo();
            conta.deposita(1000);
            conta.exibeSaldo();
            conta.saca(4000);
            conta.exibeSaldo();
            conta.saca(2500);
            conta.exibeSaldo();
            conta.transferePara(contaDestino, 500);
            conta.exibeSaldo();
            contaDestino.exibeSaldo();


    }
}
