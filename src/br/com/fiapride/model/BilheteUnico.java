package br.com.fiapride.model;

import java.time.LocalDate;

public class BilheteUnico {

    // Atributos privados (encapsulamento)
    private String tipo;
    private double saldo;
    private LocalDate dataValidade;

    // Construtor
    public BilheteUnico(String tipo, double saldo, LocalDate dataValidade) {
        this.setTipo(tipo);
        this.setSaldo(saldo);
        this.setDataValidade(dataValidade);
    }

    // GETTERS (leitura pública)

    public String getTipo() {
        return this.tipo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public LocalDate getDataValidade() {
        return this.dataValidade;
    }

    // SETTERS (privados para proteger o objeto)

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de segurança: saldo não pode ser negativo.");
        }
    }

    private void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Verifica se o bilhete está vencido
    public boolean estaVencido() {
        return dataValidade.isBefore(LocalDate.now());
    }

    // Regra de negócio para pagamento da passagem
    public boolean pagarPassagem(double valorTarifa) {

        if (estaVencido()) {
            return false;
        }

        if (tipo.equalsIgnoreCase("Estudante")) {
            valorTarifa = valorTarifa * 0.5;
        }

        if (saldo < valorTarifa) {
            return false;
        }

        saldo -= valorTarifa;
        return true;
    }

    // Validação de entrada no transporte
    public boolean validarEntrada(double valorTarifa) {
        return pagarPassagem(valorTarifa);
    }
}