package siga;

public class PainelSecretaria implements Painel {

    @Override
    public void montar() {
        System.out.println("Montando Painel da Secretaria: emissão de documentos, histórico e matrículas.");
    }

    @Override
    public String getNome() {
        return "Secretaria";
    }
}