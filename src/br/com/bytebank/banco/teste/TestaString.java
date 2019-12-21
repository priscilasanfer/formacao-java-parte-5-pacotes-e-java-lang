package br.com.bytebank.banco.teste;

public class TestaString {
    public static void main(String[] args) {

        String nome = "Alura"; // Object Literal
        // String nome = new String("Alura");

        System.out.println("Testando o Replace");

        nome.replace("A", "a"); // Não substitui por causa da imutabilidade do objeto
        String outroNome = nome.replace("A", "a");

        System.out.println(nome);
        System.out.println(outroNome);


        System.out.println("***************************");
        System.out.println("Testando o Char");
        char c = 'A';
        char d = 'a';

        String outra = nome.replace(c,d);
        System.out.println(nome);
        System.out.println(outra);

        System.out.println("***************************");
        System.out.println("Testando o CharAt");

        char c2 = nome.charAt(2);
        System.out.println(c2);

        System.out.println("***************************");
        System.out.println("Testando o indexOf");

        int pos = nome.indexOf("ur");
        System.out.println(pos);

        System.out.println("***************************");
        System.out.println("Testando o substring");

        String sub = nome.substring(1);
        System.out.println(sub);

        System.out.println("***************************");
        System.out.println("Testando o length");

        System.out.println(nome.length());

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        System.out.println("***************************");
        System.out.println("Testando o isEmpty");

        String vazio = "";
        System.out.println(vazio.isEmpty());

        System.out.println("***************************");
        System.out.println("Testando o trim");

        String vazio2 = " ";
        String outroVazio = vazio2.trim();

        System.out.println(outroVazio.isEmpty());

        String vazio3 ="    Alura    ";
        String outroVazio2 = vazio3.trim();

        System.out.println(outroVazio2);

        System.out.println("***************************");
        System.out.println("Testando o contains");

        System.out.println(outroVazio2.contains("Alu"));

    }
}
