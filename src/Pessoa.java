public class Pessoa {
    String nome;
    String sobrenome;

    public Pessoa() {
    }

    public void falar() {
        System.out.println("falei ");
    }

    public String falar(String volume) {
        return "falei " + volume;
    }
}
