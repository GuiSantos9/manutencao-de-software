package SegundoBimestre.Atividades.ativiadade14.ex11;

import java.util.ArrayList;
import java.util.List;

public class ConexaoBanco {
    private static ConexaoBanco instancia;

    private boolean conectado;
    private String  urlBanco;
    private int     totalComandos;
    private final List<String> logComandos;

    private ConexaoBanco() {
        this.urlBanco     = "jdbc:postgresql://localhost:5432/sistema";
        this.conectado    = false;
        this.totalComandos = 0;
        this.logComandos  = new ArrayList<>();
    }

    public static ConexaoBanco getInstance() {
        if (instancia == null) instancia = new ConexaoBanco();
        return instancia;
    }

    // ── Operações ──────────────────────────────

    public void conectar() {
        if (conectado) {
            System.out.println("[DB] Conexão já está ativa.");
            return;
        }
        System.out.println("[DB] Conectando em " + urlBanco + "...");
        conectado = true;
        System.out.println("[DB] Conexão estabelecida com sucesso.");
    }

    public void desconectar() {
        verificarConexao();
        System.out.println("[DB] Encerrando conexão...");
        conectado = false;
        System.out.println("[DB] Desconectado. Total de comandos executados: " + totalComandos);
    }

    public List<String> executar(String sql) {
        verificarConexao();

        totalComandos++;
        logComandos.add(sql);

        System.out.println("[DB] Executando: " + sql);

        // Simula retorno de acordo com o tipo de comando
        String upper = sql.trim().toUpperCase();
        if (upper.startsWith("SELECT")) {
            List<String> resultado = simularSelect(sql);
            resultado.forEach(r -> System.out.println("     ↳ " + r));
            return resultado;
        }

        if (upper.startsWith("INSERT")) {
            System.out.println("     ↳ 1 linha inserida.");
        } else if (upper.startsWith("UPDATE")) {
            System.out.println("     ↳ Linhas afetadas: " + (int)(Math.random() * 5 + 1));
        } else if (upper.startsWith("DELETE")) {
            System.out.println("     ↳ Registro removido.");
        } else {
            System.out.println("     ↳ Comando executado.");
        }

        return List.of();
    }

    public void exibirLog() {
        System.out.println("\n=== Log de Comandos (" + totalComandos + " executados) ===");
        for (int i = 0; i < logComandos.size(); i++) {
            System.out.printf("  %2d. %s%n", i + 1, logComandos.get(i));
        }
    }

    public boolean isConectado() { return conectado; }

    // ── Helpers ────────────────────────────────

    private void verificarConexao() {
        if (!conectado) throw new IllegalStateException("[DB] Erro: nenhuma conexão ativa.");
    }

    private List<String> simularSelect(String sql) {
        if (sql.toLowerCase().contains("usuarios")) {
            return List.of(
                    "{ id: 1, nome: 'Ana',    email: 'ana@email.com' }",
                    "{ id: 2, nome: 'Bruno',  email: 'bruno@email.com' }",
                    "{ id: 3, nome: 'Carla',  email: 'carla@email.com' }"
            );
        }
        if (sql.toLowerCase().contains("pedidos")) {
            return List.of(
                    "{ id: 101, cliente_id: 1, total: 350.00 }",
                    "{ id: 102, cliente_id: 2, total: 120.50 }"
            );
        }
        return List.of("{ resultado: 'ok' }");
    }
}