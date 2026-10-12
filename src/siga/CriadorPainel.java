package siga;

public abstract class CriadorPainel {

    // O Factory Method abstrato a ser implementado por cada subclasse
    public abstract Painel criarPainel();

    // Método de operação que utiliza o produto criado pelo Factory Method
    public Painel montar() {
        Painel painel = criarPainel();
        painel.montar();
        return painel;
    }
}
