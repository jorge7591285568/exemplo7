public class Carro {
    public static String getNome;
    private String nome;
    private String modelo;


    public Carro(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", modelo=" + modelo + ", getNome()=" + getNome() + ", getModelo()="
                + getModelo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    
}