package tech.insider.sistemabancario;

public class Main {
   public static void main(String[] args) {
      ContaCorrente contaGabriel = new ContaCorrente("123", "Gabriel");
      ContaCorrente contaJoao = new ContaCorrente("456", "Joao");

      contaJoao.depositar(100);
      contaGabriel.depositar(20);

      contaGabriel.verSaldo();
      contaJoao.verSaldo();

      contaJoao.transferir(50, contaGabriel);
      contaJoao.verSaldo();
      contaGabriel.verSaldo();
   }
}
