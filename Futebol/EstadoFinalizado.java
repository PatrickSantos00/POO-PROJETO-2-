package Futebol;

public class EstadoFinalizado implements EstadoJogo {
    @Override
    public void executar() {
        System.out.println("O jogo foi finalizado.");
    }
    
    public void iniciarJogo() {
        System.out.println("O jogo não pode ser iniciado porque está finalizado.");
    }

    public void pausarJogo() {
        System.out.println("O jogo não pode ser pausado porque está finalizado.");
    }

    public void fazerSubstituicao() {
        System.out.println("Não é possível fazer substituições, o jogo está finalizado.");
    }

    public void finalizarJogo() {
        System.out.println("O jogo já está finalizado.");
    }
}
