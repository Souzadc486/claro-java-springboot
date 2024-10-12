/*
 * Interface é uma classe abstrata com todos os métodos abstatos
 * 
 * Uma interface define um contrato com quem a implementa
 * Não faz sentido uma interfaceter ter método que não seja publico
 * 
 * Interface define um contrato do que precisa ser implementado mas não como
 * deve ser implementado
 * 
 */

public interface iConta {

  void sacar(double valor);
  void depositar(double valor);
  void transferir(double valor, Conta contaDestino);
  void imprimirExtrado();


}
