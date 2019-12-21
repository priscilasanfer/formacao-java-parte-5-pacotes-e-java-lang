package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TestaSaca {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200);
        conta.saca(210);

        System.out.println(conta.getSaldo());
    }
}
