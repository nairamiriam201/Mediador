package mediator;

public class CentralAtendimentoClinica implements MediadorClinica {

    private Recepcao recepcao;
    private Medico medico;
    private Enfermagem enfermagem;
    private Laboratorio laboratorio;
    private Paciente paciente;

    public void setRecepcao(Recepcao recepcao) {
        this.recepcao = recepcao;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setEnfermagem(Enfermagem enfermagem) {
        this.enfermagem = enfermagem;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public void enviarMensagem(SetorClinica setor, String mensagem) {

        if (setor instanceof Paciente) {

            recepcao.receberMensagem("Paciente chegou para atendimento.");

        } else if (setor instanceof Recepcao) {

            medico.receberMensagem(mensagem);

        } else if (setor instanceof Medico) {

            laboratorio.receberMensagem(mensagem);

        } else if (setor instanceof Laboratorio) {

            enfermagem.receberMensagem("Paciente pronto para proxima etapa.");

        } else if (setor instanceof Enfermagem) {

            paciente.receberMensagem("Atendimento finalizado.");
        }
    }
}