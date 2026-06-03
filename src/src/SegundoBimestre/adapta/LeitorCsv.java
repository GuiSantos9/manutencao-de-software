package SegundoBimestre.adapta;

import java.util.List;

public interface LeitorCsv {
    List<String[]> lerArquivo(String caminhoArquivo);
}