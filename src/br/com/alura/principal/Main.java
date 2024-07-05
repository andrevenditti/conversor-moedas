package br.com.alura.principal;

import br.com.alura.model.Cambio;
import br.com.alura.model.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        double valorParaConverter;

        while (option != 7) {

            Menu menu = new Menu();
            menu.CriacaoMenu();
            option = input.nextInt();

            if(option == 7) {
                break;
            }

            System.out.println("Digite o valor a ser convertido: ");
            valorParaConverter = input.nextDouble();

            Cambio cambio = new Cambio();
            switch (option) {
                case 1:
                    cambio.ConverterMoeda("USD", "ARS", valorParaConverter);
                    break;
                case 2:
                    cambio.ConverterMoeda("ARS","USD", valorParaConverter);
                    break;
                case 3:
                    cambio.ConverterMoeda("USD","BRL", valorParaConverter);
                    break;
                case 4:
                    cambio.ConverterMoeda("BRL","USD", valorParaConverter);
                    break;
                case 5:
                    cambio.ConverterMoeda("USD","COP", valorParaConverter);
                    break;
                case 6:
                    cambio.ConverterMoeda("COP","USD", valorParaConverter);
                    break;
            }
        }
    }
}
