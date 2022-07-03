package br.com.calculo;

public class Media {

    public static void main(String args[]){
        media();
    }

    public static void media() {

        System.out.println("Tirando a média de 4 valores: ");

        double nota1 = 10;
        double nota2 = 8;
        double nota3 = 7;
        double nota4 = 9;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);

        double media = ( nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Nota média: " + media);

    }

}
