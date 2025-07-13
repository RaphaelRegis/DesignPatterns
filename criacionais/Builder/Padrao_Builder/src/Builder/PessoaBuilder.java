package Builder;

public class PessoaBuilder {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String telefone;
    private String email;
    private String cpf;
    private String profissao;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public PessoaBuilder idade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public PessoaBuilder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PessoaBuilder profissao(String profissao) {
        this.profissao = profissao;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public Pessoa build() {
        return new Pessoa(this);
    }
}
