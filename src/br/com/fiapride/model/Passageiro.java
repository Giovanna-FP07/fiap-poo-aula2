package br.com.fiapride.model;

public class Passageiro {
	
   private String nome;
   private String cpf;
   private double saldo;
   
   public Passageiro(String nome, String cpf) {
       this.setNome(nome);
       this.setCpf(cpf);
       this.setSaldo(0);
   }
   

   public void adicionarSaldo(double valor) {
	   
       if (valor <= 0) {
           System.out.println("Erro: O valor de recarga deve ser maior que zero.");
           return;
       }
       
       this.saldo += valor;
       System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
   }
   
   public void pagarViagem(double custo) {
	   
       if (custo <= 0) {
           System.out.println("Erro: O custo da viagem é inválido.");
           return;
       }
       
       if (this.saldo < custo) {
           System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
           return;
       }
       
       this.saldo -= custo;
       System.out.println("Viagem paga. Saldo restante: " + this.saldo);
   }
   

   public double getSaldo() {
       return this.saldo;
   }
   
   public String getNome() {
       return this.nome;
   }
   
   public String getCpf() {
       return this.cpf;
   }
   

   private void setSaldo(double valor) {
	   
       if (valor >= 0) {
           this.saldo = valor;
       } else {
           System.out.println("Erro de Segurança: tentativa de saldo negativo bloqueada.");
       }
   }
   
   private void setNome(String nome) {
       this.nome = nome;
   }
   private void setCpf(String cpf) {
       this.cpf = cpf;
   }
}