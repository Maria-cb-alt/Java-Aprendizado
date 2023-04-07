

import java.util.Scanner;
public class desafio {
     //Usado para fazer o desafio de conversão de temperatura do curso.
    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);
        int tempCel= temp.nextInt();
        int tempFah;

        double conversao = (tempCel * 1.8) + 32;

        //System.out.println("A temperatura atual é: " + conversao);

        int fah = (int) (conversao);
        System.out.println(fah);

    }
}
