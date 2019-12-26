package br.com.bytebank.banco.teste.util;

import java.util.*;


public class TesteIterator {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }


        Set<String> nomes2 = new HashSet<>();
        nomes2.add("Sakura");
        nomes2.add("Sailor Moon");
        nomes2.add("Princess Peach");

        Iterator<String> it2 = nomes2.iterator();

        while(it2.hasNext()) {
            System.out.println(it2.next());
        }


    }

}
