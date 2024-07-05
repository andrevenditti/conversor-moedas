package br.com.alura.principal;

import br.com.alura.model.ConsultaMoeda;
import br.com.alura.model.Moeda;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {

        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        Moeda moeda = consultaMoeda.buscarMoeda("BRL");
        System.out.println(moeda);
        

    }
}
