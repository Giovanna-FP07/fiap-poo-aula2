package br.com.fiapride.model;

import java.time.LocalDate;

public class BilheteUnico {

    public String tipo;
    public double saldo;
    public LocalDate dataValidade;

    public BilheteUnico(String tipo, double saldo, LocalDate dataValidade) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {
        return dataValidade.isBefore(LocalDate.now());
    }

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
    public boolean validarEntrada(double valorTarifa) {
        return pagarPassagem(valorTarifa);
    }
 }