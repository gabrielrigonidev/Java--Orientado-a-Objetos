package tech.insider.sistemabancario;

public class ContaCorrente {
   private String cpf;
   private String nomeCompleto;
   private double saldo;

   public ContaCorrente(String cpf, String nomeCompleto) {
      this.cpf = cpf;
      this.nomeCompleto = nomeCompleto;
      this.saldo = 0;
   }

   public void depositar(double valor) {
      this.saldo += valor;
   }

   public void sacar(double valor) {
      this.saldo -= valor;
   }

   public void transferir(double valor, ContaCorrente contaDestino) {
      sacar(valor);
      contaDestino.depositar(valor);
      System.out.println("Transferencia realizada de "+ this.nomeCompleto + " para " + contaDestino.getNomeCompleto() +
              " no valor de R$ "+ valor);
   }

   public double verSaldo() {
      System.out.println("Saldo da conta do " + this.nomeCompleto + ": R$ "+ this.saldo);
      return this.saldo;
   }

   public String getNomeCompleto() {
      return this.nomeCompleto;
   }
}
