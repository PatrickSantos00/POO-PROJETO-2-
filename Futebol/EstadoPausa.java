package Futebol;

public class EstadoPausa implements EstadoJogo {
    @Override
    public void executar() {
        System.out.println("O jogo está em pausa.");
    }
}
