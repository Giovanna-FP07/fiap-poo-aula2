package br.com.fiapride.main;

import br.com.fiapride.model.BilheteUnico;
import java.time.LocalDate;

public class SistemaPrincipal {
	
   public static void main(String[] args) {
	   
       // Instância 1
       BilheteUnico bilhete1 = new BilheteUnico(null, 0, null);
       bilhete1.tipo = "Estudante";
       bilhete1.saldo = 20.00;
       bilhete1.dataValidade = LocalDate.of(2026, 12, 31);
       
       // Instância 2
       BilheteUnico bilhete2 = new BilheteUnico(null, 0, null);
       bilhete2.tipo = "Comum";
       bilhete2.saldo = 4.00;
       bilhete2.dataValidade = LocalDate.of(2025, 5, 10);

       boolean entrada1 = bilhete1.validarEntrada(5.0);
       boolean entrada2 = bilhete2.validarEntrada(5.0);
       
       System.out.println("\n===== BILHETE 1 =====");

       if (bilhete1.estaVencido()) {
         System.out.println ("Bilhete vencido.");
       }

       System.out.println ("Tipo: " + bilhete1.tipo);
       System.out.println ("Saldo: R$ " + String.format("%.2f", bilhete1.saldo));
       System.out.println ("Data de validade: " + bilhete1.dataValidade);
       System.out.println ("Entrada liberada? " + (entrada1 ? "SIM" : "NÃO"));

       System.out.println ("\n===== BILHETE 2 =====");

       if (bilhete2.estaVencido()) {
         System.out.println ("Bilhete vencido.");
       }

       System.out.println ("Tipo: " + bilhete2.tipo);
       System.out.println ("Saldo: R$ " +  String.format("%.2f", bilhete2.saldo));
       System.out.println ("Data de validade: " + bilhete2.dataValidade);
       System.out.println ("Entrada liberada? " + (entrada2 ? "SIM" : "NÃO"));
       
   }
}
