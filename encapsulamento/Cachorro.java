package encapsulamento;

public class Cachorro {

    private int tamanho;
    private   String raca;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir(){
                System.out.println("Au, au, au!");
        }
}
