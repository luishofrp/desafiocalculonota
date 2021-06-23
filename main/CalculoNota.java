package main;

import java.util.Scanner;

public class CalculoNota {
    public static String calculaNota(int valor) {
        int notas[] = {100, 50, 20, 10, 5, 2,1};
        int i, cont;
        String resultado;
        System.out.println("===================================================================");
        resultado = "Para o valor R$ " + valor + ", é necessário a quantidade de notas abaixo:\n";


        i = 0;
        while (valor != 0) {
            cont = valor / notas[i];
            if (cont != 0) {
                resultado = resultado + ("\n"+cont+" nota(s) de R$" + notas[i]);
                valor = valor % notas[i];
            }
            i = i + 1;
        }
        resultado = resultado + "\n";
        return(resultado);
    }

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Informe o valor a ser calculado:");
			int valor = ler.nextInt();
			System.out.println(calculaNota(valor));
		}
        System.out.println("===================================================================");
    }




}