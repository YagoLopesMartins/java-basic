package poo;

public class Galinha {
    public int ovos;
    public static int ovosDaGranja;

    public Galinha botar(){
        this.ovos++;
        Galinha.ovosDaGranja++;
        return this;
    }

    public static double mediaDeOvos(int galinhas){
        return ovosDaGranja /  galinhas;
    }
}
