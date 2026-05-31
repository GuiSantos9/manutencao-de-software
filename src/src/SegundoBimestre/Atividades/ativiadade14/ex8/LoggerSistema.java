package SegundoBimestre.Atividades.ativiadade14.ex8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LoggerSistema {
    private static LoggerSistema instancia;
    private final List<String> historico = new ArrayList<>();
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LoggerSistema() {}

    public static LoggerSistema getInstance() {
        if (instancia == null) instancia = new LoggerSistema();
        return instancia;
    }

    public void log(String mensagem) {
        String entrada = "[" + LocalDateTime.now().format(fmt) + "] " + mensagem;
        historico.add(entrada);
        System.out.println(entrada);
    }

    public void exibirHistorico() {
        System.out.println("\n=== Histórico de Logs (" + historico.size() + " entradas) ===");
        historico.forEach(System.out::println);
    }
}
