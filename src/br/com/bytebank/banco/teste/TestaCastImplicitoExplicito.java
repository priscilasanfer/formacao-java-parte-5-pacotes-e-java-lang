package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaCastImplicitoExplicito {
    public static void main(String[] args) {
        int numero = 3;
        double valor = numero; //cast implícito


        int numero2 = 3;
        double valor2 = (double) numero2; //cast explícito


        double valor3 = 3.56;
        int numero3 = (int) valor3; //cast explicito é exigido pelo compilador

        ContaCorrente cc1 = new ContaCorrente(22, 33);
        Conta conta = cc1; //cast implicito

        ContaCorrente cc2 = new ContaCorrente(22, 33);
        Conta conta2 = (Conta) cc2; //cast explícito mas desnecessário

        Cliente cliente = new Cliente();
//        Conta conta = (Conta) cliente; //impossível, não compila pois Cliente nao extende da Classe Conta



    }
}
