package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;
        /* Isso é um primitivo e não da pra adicionar em uma lista.
        Pois listas so guardam Referencias.
        Porem o Java transforma o primitivo em um Objeto e guarda dentro do array uma referencia
        Integer idadeRef = new Integer(29); => O Java faz isso automaticamente. Porem esta deprecado
        */

        Integer idadeRef = Integer.valueOf(29); // autoboxing

        System.out.println(idadeRef.doubleValue() );

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); // unboxing

        String s = args[0]; //precisa passar os argumentos na linha de comando
//        Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing
    }
}
