public class Main {

    public static void main(String[] args) {
        Pessoa adao;
         adao = new Pessoa();

        Pessoa eva = new Pessoa();

        adao.nome = "Adão";

        adao.sobrenome = "Silva";

        eva.nome = "Eva";

        eva.sobrenome = "Silva";

        adao.falar();

        eva.falar();

        Pessoa qualquer = new Pessoa();

        Pessoa rainha;

        rainha = new Pessoa();
        rainha.nome = "Tina";

        rainha.sobrenome = "Tunner";

        System.out.println(rainha.falar("alto"));
        rainha.comer();
    }
}