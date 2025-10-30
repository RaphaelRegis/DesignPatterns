package chain.handlers;

public abstract class Handler {
    private Handler nextHandler;

    public Handler setNextHandler(Handler handler) {
        this.nextHandler = handler;
        return nextHandler;
    }

    // nesse metodo ele tenta resolver o problema | retorna true caso tenha resolvido
    public abstract boolean handle(String problema);

    protected boolean handleNext(String problema) {
        // verifica se eh o ultimo handler
        if (nextHandler == null) {
            return false;
        }
        // caso nao seja, joga para o proximo
        return nextHandler.handle(problema);
    }
}
