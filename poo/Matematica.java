package poo;

//Mover a linha de código atual (ou o bloco selecionado) via Shift + Ctrl + setas (Shift + Cmd + setas)
//        Duplicar uma linha de código (ou o bloco selecionado) via Ctrl + D (Cmd + D)
//        Remover uma linha de código (ou o bloco selecionado) via Ctrl + Y (Ctrl + Backspace no Mac)
//        Comentar ou descomentar uma linha de código (ou bloco selecionado) via Ctrl + / (Cmd + /) e Shift + Ctrl + D para comentário de bloco para o código selecionado.
//        Otimizar os imports via Ctrl + O (Ctrl + Alt + O).
//        Encontrar no arquivo atualmente aberto via Alt + F3 e navegar para o próximo com F3 e para o anterior com Shift + F3.
//        Fazer substuições com Ctrl + R (Cmd + R).
//        Habilitar/mostrar quebras de linha (soft-wraps), desabilitadas por padrão.
//        Colar da pilha via Shift + Ctrl + V (Shift + Cmd + V).
//        Navegar entre as abas abertas via Alt + setas (Shift + Tab).

public class Matematica {

    public int maior (int valor1, int valor2){
        if (valor1 > valor2){
            return valor1;
        }else {
            return valor2;
        }
    }
    public int raiz(double valor){
        int parteInteiraRaiz = 0;
        int impar = 1;
       while (valor >= impar){
           valor -= impar;
           impar +=2;
           parteInteiraRaiz++;
       }
        return parteInteiraRaiz;
        // return Math.sqrt(valor); // double
    }
    public String romanos (int numero){
        return "X";
    }
    public double soma (){
        return 30.8 + 69.2;
    }

    double soma2(double ... numeros){
        double total = 0;
        for (double n : numeros){
            total += n;
        }
        return total;
    }
}
