package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29);  // autoboxing
        System.out.println(idadeRef.intValue()); // unboxing

        Double dRef = Double.valueOf(34.6);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(10f);
        List<Number> lista = new ArrayList();
        lista.add(10);
        lista.add(15.5);
        lista.add(1.9f);


    }
}
