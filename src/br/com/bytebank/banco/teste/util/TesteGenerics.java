package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteGenerics {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new ContaCorrente(1232, 456);
        lista.add(cc);

        Conta cp = new ContaPoupanca(987, 654);
        lista.add(cp);

        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("tamanho: " + lista.size());

        Conta cc2 = new ContaCorrente(53, 11);
        lista.add(cc2);

        Conta cp2 = new ContaPoupanca(987, 654);
        lista.add(cp2);

        for(int i = 0; i< lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("------------------------");
        for(Conta  conta : lista){
            System.out.println(conta);

        }
    }
}
