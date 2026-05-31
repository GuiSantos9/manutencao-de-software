package SegundoBimestre.Atividades.ativiadade14.ex11;

public class Main {
    public static void main(String[] args) {

        ConexaoBanco db = ConexaoBanco.getInstance();

        db.conectar();
        db.conectar(); // segunda chamada — não reabre

        System.out.println();
        db.executar("SELECT * FROM usuarios");
        db.executar("INSERT INTO usuarios (nome, email) VALUES ('Diego', 'diego@email.com')");
        db.executar("SELECT * FROM pedidos");
        db.executar("UPDATE pedidos SET total = 400.00 WHERE id = 101");
        db.executar("DELETE FROM usuarios WHERE id = 3");

        // Confirma que é a mesma instância em outra "parte do sistema"
        ConexaoBanco outraReferencia = ConexaoBanco.getInstance();
        System.out.println("\nMesma instância: " + (db == outraReferencia)); // true

        db.exibirLog();

        System.out.println();
        db.desconectar();

        // Tenta executar sem conexão — lança exceção
        try {
            db.executar("SELECT * FROM usuarios");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
