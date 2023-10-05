package br.carrosemotos.aula.elenilton.fag;
import java.util.Scanner;

public class TestarPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        System.out.println("Informe o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Informe o telefone da pessoa:");
        String telefone = scanner.nextLine();

        System.out.println("Informe o endereço da pessoa:");
        String endereco = scanner.nextLine();

        System.out.println("Informe o CPF da pessoa física:");
        String cpf = scanner.nextLine();

        System.out.println("Informe o CNPJ da pessoa jurídica:");
        String cnpj = scanner.nextLine();

        PessoaFisica pessoaFisica = new PessoaFisica(nome, telefone, endereco, cpf);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, telefone, endereco, cnpj);

        System.out.println("--- Pessoa Física ---");
        System.out.println(pessoaFisica.toString());

        System.out.println("--- Pessoa Jurídica ---");
        System.out.println(pessoaJuridica.toString());
    }
}