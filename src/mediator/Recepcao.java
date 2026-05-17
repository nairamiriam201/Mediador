package mediator;

public class Recepcao extends SetorClinica {

    public Recepcao(MediadorClinica mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + ": " + mensagem);
        mediador.enviarMensagem(this, mensagem);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}