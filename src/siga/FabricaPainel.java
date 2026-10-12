package siga;

public class FabricaPainel {

    public static Painel criar(String tipo) {
        if ("ALUNO".equalsIgnoreCase(tipo)) {
            return new PainelAluno();
        } else if ("PROFESSOR".equalsIgnoreCase(tipo)) {
            return new PainelProfessor();
        } else if ("COORDENADOR".equalsIgnoreCase(tipo)) {
            return new PainelCoordenador();
        }
        throw new IllegalArgumentException("Tipo de perfil desconhecido: " + tipo);
    }
}