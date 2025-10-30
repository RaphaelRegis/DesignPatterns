package chain;

import chain.handlers.AssinarNovoPlano;
import chain.handlers.CancelarPlano;
import chain.handlers.Handler;
import chain.handlers.VerificarDadosDoPlano;

public class ChainService {

    public void resolverProblema(String problema) {
        Handler handler = configChain();

        if (!(handler.handle(problema))) {
            System.out.println("O problema não pode ser resolvido!");
        }

    }


    private Handler configChain() {
        // handler inicial
        Handler handler = new VerificarDadosDoPlano();

        // handlers em cadeia
        handler
                .setNextHandler(new AssinarNovoPlano())
                .setNextHandler(new CancelarPlano());

        return handler;
    }
}
