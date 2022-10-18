package enumTest;

public enum EnumMedida {

    MM("Milímetro"), CM("Centímetro"), M("Metro");

    public String titulo;

    EnumMedida(String titulo){
        this.titulo = titulo;
    }
}
