package br.com.alura.principal;

import br.com.alura.model.Cambio;
import br.com.alura.model.ConsultaMoeda;
import br.com.alura.model.Moeda;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        double valorParaConverter;

        System.out.println("*************************************");
        System.out.println("Seja vem-vindo ao conversor de moedas: \n");
        System.out.println("1) Dolar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dolar");
        System.out.println("3) Dolar =>> Real Brasileiro");
        System.out.println("4) Real brasileiro =>> Dolar");
        System.out.println("5) Dolar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dolar");
        System.out.println("7) Sair\n");
        System.out.println("Escolha uma opção válida:");
        System.out.println("*************************************\n\n");
        option = input.nextInt();

        System.out.println("Digite o valor a ser convertido: ");
        valorParaConverter = input.nextDouble();

        Cambio cambio = new Cambio();
        String respostaCambio;
        switch (option) {
            case 1:
                respostaCambio = cambio.ConverterMoeda("USD", "ARS", valorParaConverter);
                System.out.println(respostaCambio);
                break;
            case 2:
                respostaCambio = cambio.ConverterMoeda("ARS","USD", valorParaConverter);
                System.out.println(respostaCambio);
                break;
            case 3:
                respostaCambio = cambio.ConverterMoeda("USD","BRL", valorParaConverter);
                System.out.println(respostaCambio);
                break;
            case 4:
                respostaCambio = cambio.ConverterMoeda("BRL","USD", valorParaConverter);
                System.out.println(respostaCambio);
                break;
            case 5:
                respostaCambio = cambio.ConverterMoeda("USD","COP", valorParaConverter);
                System.out.println(respostaCambio);
                break;
            case 6:
                respostaCambio = cambio.ConverterMoeda("COP","USD", valorParaConverter);
                System.out.println(respostaCambio);
                break;
        }
    }
}
