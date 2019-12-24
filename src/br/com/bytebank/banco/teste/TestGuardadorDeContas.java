package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TestGuardadorDeContas {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(123, 345);
        guardador.adiciona(cc);

        Conta cc2 = new ContaPoupanca(22, 22);
        guardador.adiciona(cc2);

        Cliente cliente = new Cliente();

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());


    }
}
