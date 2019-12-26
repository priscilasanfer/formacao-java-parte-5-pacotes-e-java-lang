package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(10.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(60.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(80.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(15.0);


        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Sem ordenação");
        for (Conta conta : lista) {
            System.out.println(conta);
        }

//        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(new TitularDaContaComparator());


        System.out.println("---------");
        System.out.println("Ordenando pelo titular");

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        System.out.println("---------");
        System.out.println("Ordenando pela ordem natural definida na classe Conta");
        Collections.sort(lista);

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }


        System.out.println("---------");
        System.out.println("Ordenando usando o metodo sort da Classe Collections e pelo numero da conta");
        Collections.sort(lista, new NumeroDaContaComparator());

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        System.out.println("---------");
        System.out.println("Ordenando pelo reverse, usando a ordem natural definida na classe conta");
        Collections.reverse(lista);
        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        System.out.println("---------");
        System.out.println("Ordenando pelo shuffle, usando a ordem natural definida na classe conta");
        Collections.shuffle(lista);
        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        System.out.println("---------");
        System.out.println("Rotacionando o elemento da lista");
        Collections.rotate(lista, 2);
        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
    }
}

class TitularDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {

        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        return nomeC1.compareTo(nomeC2);
    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        return Integer.compare(c1.getNumero(), c2.getNumero());

//        return c1.getNumero() - c2.getNumero();

//        if(c1.getNumero() < c2.getNumero()) {
//            return -1;
//        }
//
//        if(c1.getNumero() > c2.getNumero()) {
//            return 1;
//        }
//
//        return 0;
    }
}
