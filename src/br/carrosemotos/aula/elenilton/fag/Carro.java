package br.carrosemotos.aula.elenilton.fag;

public class Carro extends TestarVeiculo {
    private int potenciaDoMotor;

    public void setPotenciaDoMotor(int potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public boolean viajar(int distancia) {
        // Lógica específica para a classe Carro
        System.out.println("Viagem de carro realizada!");
        return true;
    }

    public int getPotenciaDoMotor() {
        return potenciaDoMotor;
    }
}