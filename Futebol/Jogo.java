package Futebol;

public class Jogo {
    private EstadoJogo estadoAtual;

    public void setEstado(EstadoJogo estado) {
        this.estadoAtual = estado;
    }

    public void executarEstado() {
        if (estadoAtual != null) {
            estadoAtual.executar();
        } else {
            System.out.println("Nenhum estado definido.");
        }
    }
}
