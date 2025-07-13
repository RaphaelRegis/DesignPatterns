package Criadores;

import Produtos.Refeicao;

public abstract class Restaurante {
    public Refeicao pedirRefeicao() {
        Refeicao refeicao = criarRefeicao();
        refeicao.preparar();
        return refeicao;
    }

    public abstract Refeicao criarRefeicao();
}
