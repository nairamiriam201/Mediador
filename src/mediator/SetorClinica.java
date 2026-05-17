package mediator;

public abstract class SetorClinica {

    protected MediadorClinica mediador;
    protected String nome;

    public SetorClinica(MediadorClinica mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void enviarMensagem(String mensagem);

    public abstract void receberMensagem(String mensagem);
}