package br.com.bytebank.banco.teste;

public class TestaStringBuilder {
    public static void main(String[] args) {
        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto);

        System.out.println("***************************");

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto2 = builder.toString();
        System.out.println(texto2);

        System.out.println("***************************");
        String nome = "ALURA";
        CharSequence cs = new StringBuilder("al");

        nome = nome.replace("AL", cs);

        System.out.println(nome);
    }

}
