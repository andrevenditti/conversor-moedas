package br.com.alura.model;

public class Cambio {
    public String ConverterMoeda(String moedaParaConverter, String moedaConvertida, double valorParaConverter) {
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        Moeda moeda = consultaMoeda.buscarMoeda(moedaParaConverter);
        double valorConvertido = moeda.conversionRates().get(moedaConvertida) * valorParaConverter;
        String resposta = "Valor " + valorParaConverter + " [" + moedaParaConverter + "]" +
                " corresponde ao valor final de =>>> " + valorConvertido + " [" + moedaConvertida + "]";
        return resposta;
    }
}
