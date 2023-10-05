package br.carrosemotos.aula.elenilton.fag;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;

    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nCPF: " + cpf;
    }
}