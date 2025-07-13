package Builder;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String telefone;
    private String email;
    private String cpf;
    private String profissao;

    public Pessoa(PessoaBuilder pessoaBuilder) {
        this.nome = pessoaBuilder.getNome();
        this.sobrenome = pessoaBuilder.getSobrenome();
        this.idade = pessoaBuilder.getIdade();
        this.telefone = pessoaBuilder.getTelefone();
        this.email = pessoaBuilder.getEmail();
        this.cpf = pessoaBuilder.getCpf();
        this.profissao = pessoaBuilder.getProfissao();
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", telefone=" + telefone
                + ", email=" + email + ", cpf=" + cpf + ", profissao=" + profissao + "]";
    }
}
