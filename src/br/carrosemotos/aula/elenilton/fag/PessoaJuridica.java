package br.carrosemotos.aula.elenilton.fag;

public class PessoaJuridica extends Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj) {
        super(nome, telefone, endereco);
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nCNPJ: " + cnpj;
    }
}