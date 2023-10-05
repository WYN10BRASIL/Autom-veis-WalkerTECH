package br.carrosemotos.aula.elenilton.fag;

import java.util.Scanner;

public class TestarVeiculo {
    private String placa;
    private int combustivelNoTanque;
    private int quilometragem;
    private boolean alugado;
    private double precoDiaria;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCombustivelNoTanque(int combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public void abastecer(int quantidade) {
        combustivelNoTanque += quantidade;
        System.out.println("Abastecido com sucesso! Novo nível de combustível: " + combustivelNoTanque);
    }

    public boolean viajar(int distancia) {
        double consumo = distancia / 10.0; // Assumindo que o veículo consome 10 km/litro
        if (combustivelNoTanque >= consumo) {
            quilometragem += distancia;
            combustivelNoTanque -= consumo;
            System.out.println("Viagem realizada com sucesso! Quilometragem atual: " + quilometragem);
            return true;
        } else {
            System.out.println("Não há combustível suficiente para a viagem.");
            return false;
        }
    }

    public boolean equals(TestarVeiculo outroVeiculo) {
        return this.placa.equals(outroVeiculo.placa);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TestarVeiculo veiculo = new TestarVeiculo();

        System.out.print("Informe a placa do veículo: ");
        veiculo.setPlaca(scanner.nextLine());

        System.out.print("Informe a quantidade de combustível no tanque: ");
        veiculo.setCombustivelNoTanque(scanner.nextInt());

        System.out.print("Informe a quilometragem atual do veículo: ");
        veiculo.setQuilometragem(scanner.nextInt());

        System.out.print("O veículo está alugado? (true/false): ");
        veiculo.setAlugado(scanner.nextBoolean());

        System.out.print("Informe o preço da diária do veículo: ");
        veiculo.setPrecoDiaria(scanner.nextDouble());

        System.out.println("\nInformações do veículo:");
        System.out.println("Placa: " + veiculo.placa);
        System.out.println("Combustível no tanque: " + veiculo.combustivelNoTanque);
        System.out.println("Quilometragem: " + veiculo.quilometragem);
        System.out.println("Alugado: " + veiculo.alugado);
        System.out.println("Preço da diária: " + veiculo.precoDiaria);

        scanner.close();
    }
}
