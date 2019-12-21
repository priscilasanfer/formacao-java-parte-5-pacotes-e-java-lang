package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaToString {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 456);
        ContaPoupanca cp = new ContaPoupanca(321, 654);

        System.out.println(cc.toString());
        System.out.println(cp.toString());
    }
}
