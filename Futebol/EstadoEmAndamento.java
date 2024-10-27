package Futebol;

public class EstadoEmAndamento implements EstadoJogo {
    @Override
    public void executar() {
        System.out.println("O jogo está em andamento.");
    }
}
