package br.carrosemotos.aula.elenilton.fag;

public class Moto extends TestarVeiculo {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean viajar(int distancia) {
        // Lógica específica para a classe Moto
        System.out.println("Viagem de moto realizada!");
        return true;
    }
}