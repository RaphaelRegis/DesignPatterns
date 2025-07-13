import Builder.Pessoa;
import Builder.PessoaBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new PessoaBuilder()
                .nome("Jesus")
                .sobrenome("Cristo")
                .idade(2025)
                .telefone("999999999")
                .email("jesus@gmail.com")
                .cpf("12345678910")
                .profissao("Pastor")
                .build();

        System.out.println(pessoa);
    }
}
