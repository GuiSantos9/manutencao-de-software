package SegundoBimestre.adapta;

import java.util.ArrayList;
import java.util.List;

public class PessoaCsvAdapter implements RepositorioDePessoas {

    private LeitorCsv leitorCsv;
    private String caminhoArquivoCsv;

    public PessoaCsvAdapter(String caminhoArquivoCsv, LeitorCsv leitorCsv) {
        this.caminhoArquivoCsv = caminhoArquivoCsv;
        this.leitorCsv = leitorCsv;
    }

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        List<String[]> dadosCsv = leitorCsv.lerArquivo(caminhoArquivoCsv);

        for (String[] dados : dadosCsv) {
            Pessoa pessoa = new Pessoa(dados[0], Integer.parseInt(dados[1]), dados[2]);
            pessoas.add(pessoa);
        }

        return pessoas;
    }
}