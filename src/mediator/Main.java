package mediator;

public class Main {

    public static void main(String[] args) {

        MediadorClinica central = new CentralAtendimentoClinica();

        Recepcao recepcao = new Recepcao(central, "Recepcao");
        Medico medico = new Medico(central, "Medico");
        Enfermagem enfermagem = new Enfermagem(central, "Enfermagem");
        Laboratorio laboratorio = new Laboratorio(central, "Laboratorio");
        Paciente paciente = new Paciente(central, "Paciente");

        CentralAtendimentoClinica centralConcreta =
                (CentralAtendimentoClinica) central;

        centralConcreta.setRecepcao(recepcao);
        centralConcreta.setMedico(medico);
        centralConcreta.setEnfermagem(enfermagem);
        centralConcreta.setLaboratorio(laboratorio);
        centralConcreta.setPaciente(paciente);

        paciente.enviarMensagem("Cheguei para consulta.");

        recepcao.enviarMensagem("Paciente encaminhado ao medico.");

        medico.enviarMensagem("Solicitando exame de sangue.");

        laboratorio.enviarMensagem("Resultado do exame pronto.");

        enfermagem.enviarMensagem("Paciente preparado.");

    }
}