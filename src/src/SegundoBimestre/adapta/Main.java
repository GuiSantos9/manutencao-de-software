package SegundoBimestre.adapta;

public class Main {
    public static void main(String[] args) {
        String caminhoCsv = "C:\\Users\\Unicesumar\\IdeaProjects\\manutencao-de-software\\src\\src\\SegundoBimestre\\adapta\\pessoas.csv";

        LeitorCsv leitorCsv = new LeitorCsvImpl();

        PessoaCsvAdapter adaptador = new PessoaCsvAdapter(caminhoCsv, leitorCsv);

        System.out.println();

        for (Pessoa pessoa : adaptador.listarPessoas()) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Email: " + pessoa.getEmail());
            System.out.println();
        }
    }
}
