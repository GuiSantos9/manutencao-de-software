package SegundoBimestre.Atividades.ativiadade14.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LoggerSistema {

    private static LoggerSistema instancia;

    private final List<String> historico;
    private final DateTimeFormatter formatador;

    private LoggerSistema() {
        this.historico   = new ArrayList<>();
        this.formatador  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    }

    public static LoggerSistema getInstance() {
        if (instancia == null) {
            instancia = new LoggerSistema();
        }
        return instancia;
    }

    public void log(String mensagem) {
        String timestamp  = LocalDateTime.now().format(formatador);
        String entrada    = "[" + timestamp + "] " + mensagem;
        historico.add(entrada);
        System.out.println(entrada);
    }

    public List<String> getHistorico() {
        return new ArrayList<>(historico); // cópia defensiva
    }

    public void exibirHistorico() {
        System.out.println("\n=== Histórico de Logs ===");
        historico.forEach(System.out::println);
        System.out.println("Total: " + historico.size() + " mensagem(ns)");
    }

}