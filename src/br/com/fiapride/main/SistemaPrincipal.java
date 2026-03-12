package br.com.fiapride.main;

import br.com.fiapride.model.BilheteUnico;
import java.time.LocalDate;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema Bilhete Único ---\n");

        // Instância 1
        BilheteUnico bilhete1 = new BilheteUnico(
                "Estudante",
                20.00,
                LocalDate.of(2026, 12, 31)
        );

        // Instância 2
        BilheteUnico bilhete2 = new BilheteUnico(
                "Comum",
                4.00,
                LocalDate.of(2025, 5, 10)
        );

        boolean entrada1 = bilhete1.validarEntrada(5.0);
        boolean entrada2 = bilhete2.validarEntrada(5.0);

        System.out.println("===== BILHETE 1 =====");

        if (bilhete1.estaVencido()) {
            System.out.println("Bilhete vencido.");
        }

        System.out.println("Tipo: " + bilhete1.getTipo());
        System.out.println("Saldo: R$ " + String.format("%.2f", bilhete1.getSaldo()));
        System.out.println("Data de validade: " + bilhete1.getDataValidade());
        System.out.println("Entrada liberada? " + (entrada1 ? "SIM" : "NÃO"));


        System.out.println("\n===== BILHETE 2 =====");

        if (bilhete2.estaVencido()) {
            System.out.println("Bilhete vencido.");
        }

        System.out.println("Tipo: " + bilhete2.getTipo());
        System.out.println("Saldo: R$ " + String.format("%.2f", bilhete2.getSaldo()));
        System.out.println("Data de validade: " + bilhete2.getDataValidade());
        System.out.println("Entrada liberada? " + (entrada2 ? "SIM" : "NÃO"));
    }
}