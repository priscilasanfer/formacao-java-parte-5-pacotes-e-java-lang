package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111, 1111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(111, 1234);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("Saldo conta corrente " + cc.getSaldo());
        System.out.println("Saldo conta poupanca " + cp.getSaldo());
    }
}
